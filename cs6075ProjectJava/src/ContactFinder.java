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

	public ArrayList<Contact> findContact(String name){
		ContactList contacts = this.dataManager.getAllContacts();
		ContactIterator  iterator= contacts.createIterator();
		ContactVisitor visitor = new ContactNameVisitor();
		for(iterator.first();!iterator.isDone();iterator.next()){
			Contact currentContact = iterator.currentItem();
			if(currentContact.getName().equals(name)){
				currentContact.accept(visitor);
			}
		}
		return visitor.getResult();
	}

	public ContactFinder(DataManager dataManager){
		this.dataManager = dataManager;
	}
}