
/**
 * 
 */

import java.util.ArrayList;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class PrintDecorator {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ArrayList<Contact> contacts;

	public PrintDecorator(ArrayList<Contact> contacts){
		this.contacts= contacts; 
	}

	public void printText(){
		for(Contact contact: this.contacts){
			System.out.println(contact.toString());	
		}
	}
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	// private UI uI;
}