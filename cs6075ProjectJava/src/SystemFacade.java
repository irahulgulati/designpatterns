import java.io.IOException;
import java.util.Hashtable;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SystemFacade {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ContactManager contactManager;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ContactFinder contactFinder;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private DataManager dataManager;

	public void addContact(Contact contact){
		this.contactManager.addContact(contact);
	}

	public Boolean deleteContact(String identifier){
		return this.contactManager.deleteContact(identifier);
	}

	public Contact searchContact(String name){
		return this.contactFinder.findContact(name);
	}

	public void saveContacts() throws IOException{
		this.dataManager.save();
	}

	public Hashtable<String, String> getAllContactsOf(String contactType){
		return this.dataManager.getAllContactsOf(contactType);
	}

	public Memento createMemento(){
		return this.dataManager.createMemento();
	}

	public void setMemento(Memento memento){
		System.out.println("Setting memento");
		System.out.println(memento);
		this.dataManager.setMemento(memento);
	}

	public SystemFacade(){
		this.dataManager = new DataManager();
		this.contactFinder = new ContactFinder(dataManager);
		this.contactManager = new ContactManager(dataManager);
	}
}