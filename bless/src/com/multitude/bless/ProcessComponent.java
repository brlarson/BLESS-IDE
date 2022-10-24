/**
 * 
 */
package com.multitude.bless;

import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;

/**
 * @author brl
 *
 */
public class ProcessComponent extends ForAllElement
	{

	protected void 
action(Element obj) {
	resultList.add(obj);
}
	
	
	}
