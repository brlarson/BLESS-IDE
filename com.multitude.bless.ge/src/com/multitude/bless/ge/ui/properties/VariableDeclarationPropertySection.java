//VariableDeclarationPropertySection.java

package com.multitude.bless.ge.ui.properties;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.PublicPackageSection;
//import org.osate.ba.aadlba.BehaviorAnnex;
//import org.osate.ba.aadlba.BehaviorVariable;
//import org.osate.ba.declarative.Identifier;
//import org.osate.ba.declarative.QualifiedNamedElement;
import org.osate.ge.BusinessObjectSelection;
import org.osate.ge.aadl2.AadlImportsUtil;
//import org.osate.ge.ba.util.BehaviorAnnexUtil;
import org.osate.ge.internal.ui.util.InternalPropertySectionUtil;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.OperationBuilder;
import org.osate.ge.operations.StepResult;
import org.osate.ge.swt.SwtUtil;
import org.osate.ge.ui.PropertySectionUtil;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.bless.ge.util.BlessGeUtil;

/**
 * Property section for {@link BehaviorVariable}
 */
public class VariableDeclarationPropertySection extends AbstractPropertySection {
	/**
	 * Filter which determines if the property section is compatible with an object.
	 */
	public static class Filter implements IFilter {
		@Override
		public boolean select(final Object toTest) {
			return PropertySectionUtil.isBoCompatible(toTest, bo -> bo instanceof VariableDeclaration);
		}
	}

	/**
	 * Testing ID for the label containing the variable's data classifier
	 * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
	 */
	public static final String WIDGET_ID_DATA_CLASSIFIER_LABEL = "org.osate.ge.ba.ui.properties.setVariableDataClassifierPropertySection.label";

	private BusinessObjectSelection selectedBos;
	private Label curDataClassifier;
	private Button chooseDataClassifierBtn;

	private final SelectionListener setDataClassifierListener = new SelectionAdapter() {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			final VariableDeclaration variableDeclaration = selectedBos.boStream(VariableDeclaration.class).findAny()
					.orElseThrow(() -> new RuntimeException("Selected variable declaration cannot be found"));
			final BLESSSubclause anyBehaviorAnnex = (BLESSSubclause) variableDeclaration.getOwner();

			// Set data classifier
			final Operation op = Operation.createWithBuilder(builder -> {
				final OperationBuilder<DataClassifier> prompt = builder
						.supply(() -> BlessGeUtil.promptForDataClassifier(anyBehaviorAnnex.eResource())
								.filter(c -> BlessGeUtil.getPackage(c).isPresent())
								.map(StepResult::forValue)
								.orElseGet(StepResult::abort));

				prompt.executeOperation(dataClassifier -> Operation.createWithBuilder(innerBuilder -> {
					final AadlPackage referencedPackage = BlessGeUtil.getPackage(dataClassifier).orElseThrow();

					final Set<PublicPackageSection> sections = selectedBos.boStream(VariableDeclaration.class)
							.flatMap(v -> BlessGeUtil.getPackage(v).stream())
							.distinct()
							.map(AadlPackage::getPublicSection)
							.filter(s -> s != null)
							.collect(Collectors.toSet());

					OperationBuilder<?> opBuilder = innerBuilder;
					for(final PublicPackageSection section : sections) {
						opBuilder = innerBuilder.modifyModel(section,
								(tag, prevResult) -> tag, (tag, sectionToModify, prevResult) -> {
									// Import package if needed
									AadlImportsUtil.addImportIfNeeded(sectionToModify, referencedPackage);
									return StepResult.complete();
								});
					}

					// Update the variables
//  NEED TO HAVE BLESS TYPES RATHER THAN DATA COMPONENT REFERENCES					
//					selectedBos.modifyWithOperation(opBuilder, VariableDeclaration.class,
//							(bv, prevResult) -> bv.setDataClassifier(dataClassifier));
				}));
			});

			PropertySectionUtil.execute(op);
		}
	};

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		FormData fd;

		final Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		final Composite container = getWidgetFactory().createComposite(composite);
		final Label sectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
				"Data Classifier:");

		container.setLayout(new FormLayout());
		fd = new FormData();
		fd.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		fd.top = new FormAttachment(sectionLabel, 0, SWT.CENTER);
		container.setLayoutData(fd);

		curDataClassifier = getWidgetFactory().createLabel(container, new String());
		fd = new FormData();
		fd.left = new FormAttachment(0, 0);
		fd.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		curDataClassifier.setLayoutData(fd);
		SwtUtil.setTestingId(curDataClassifier, WIDGET_ID_DATA_CLASSIFIER_LABEL);

		chooseDataClassifierBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), container, null,
				setDataClassifierListener, "Choose...", SWT.PUSH);

		fd = new FormData();
		fd.left = new FormAttachment(curDataClassifier, ITabbedPropertyConstants.HSPACE);
		fd.top = new FormAttachment(curDataClassifier, 0, SWT.CENTER);
		chooseDataClassifierBtn.setLayoutData(fd);
	}

	@Override
	public void setInput(final IWorkbenchPart part, final ISelection selection) {
		super.setInput(part, selection);
		selectedBos = Adapters.adapt(selection, BusinessObjectSelection.class);
	}

	@Override
	public void refresh() {
		final List<VariableDeclaration> behaviorVariables = selectedBos.boStream(VariableDeclaration.class)
				.collect(Collectors.toList());
//		curDataClassifier.setText(getDataClassifierLabel(behaviorVariables));
	}

	private static String getDataClassifierLabel(final List<VariableDeclaration> behaviorVariables) {
		final Iterator<VariableDeclaration> it = behaviorVariables.iterator();
		VariableDeclaration bv = it.next();
//		final DataClassifier dc = bv.getDataClassifier();
		while (it.hasNext()) {
			bv = it.next();
			// If variable data classifiers are not the same, set to multiple
//			if (dc != bv.getDataClassifier()) {
//				return "<Multiple>";
//			}
		}

//		if (dc instanceof QualifiedNamedElement) {
//			final QualifiedNamedElement qualNamedElement = (QualifiedNamedElement) dc;
//			final Identifier baNamespace = qualNamedElement.getBaNamespace();
//			final Identifier baName = qualNamedElement.getBaName();
//			return new StringBuilder(baNamespace == null ? "" : baNamespace.getId()).append("::")
//					.append(baName == null ? "" : baName.getId()).toString();
//		}

		return "";  // dc.getQualifiedName();
	}
}
