import java.util.ArrayList;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactFinder {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private DataManager dataManager;

	public Contact findContact(String name){
		ContactList contacts = this.dataManager.getAllContacts();
		for(int contact = 0; contact<contacts.count();contact++){
			Contact selectedContact  = contacts.get(contact);
			System.out.println("ASDSADSA"+ selectedContact.getName());
			if(selectedContact.getName().equals(name)){
				return selectedContact;
			}
		}
		return null;
	}

	public ContactFinder(DataManager dataManager){
		this.dataManager = dataManager;
	}
}