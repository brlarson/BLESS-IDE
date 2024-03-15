/*
 * (C) Multitude Corporation 2024
 * generated by Xtext 2.30.0
 from BLESS.xtext, by BRL 
 */
package com.multitude.aadl.bless.validation;

import com.multitude.aadl.bless.bLESS.ActionTimeout;
import com.multitude.aadl.bless.bLESS.BAAlternative;
import com.multitude.aadl.bless.bLESS.Computation;
import com.multitude.aadl.bless.bLESS.ExecuteTimeout;
import com.multitude.aadl.bless.bLESS.FreezePort;
import com.multitude.aadl.bless.bLESS.InternalCondition;
import com.multitude.aadl.bless.bLESS.IssueException;
import com.multitude.aadl.bless.bLESS.LockingAction;
import com.multitude.aadl.bless.bLESS.Otherwise;
import com.multitude.aadl.bless.bLESS.Pause;
import com.multitude.aadl.bless.bLESS.Priority;
import com.multitude.aadl.bless.bLESS.SubprogramAccessDispatch;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractBLESSValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.multitude.aadl.bless.bLESS.BLESSPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://aadl.info/AADL/2.0"));
		return result;
	}
	
	@Check
	public void checkDeprecatedPriority(Priority element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedSubprogramAccessDispatch(SubprogramAccessDispatch element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedExecuteTimeout(ExecuteTimeout element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedOtherwise(Otherwise element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedInternalCondition(InternalCondition element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedComputation(Computation element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedBAAlternative(BAAlternative element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedIssueException(IssueException element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedLockingAction(LockingAction element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedFreezePort(FreezePort element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedPause(Pause element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
	
	@Check
	public void checkDeprecatedActionTimeout(ActionTimeout element) {
		addIssue("This part of the language is marked as deprecated and might get removed in the future!", element, BLESSConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART);
	}
}
