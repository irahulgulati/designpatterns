import java.io.IOException;
import java.util.Hashtable;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactManager {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private DataManager dataManager;

	public void addContact(Contact contact){
		this.dataManager.getAllContacts().append(contact);
		this.dataManager.getAllContacts();
	}

	public Boolean deleteContact(String identifier){
		return this.dataManager.deleteContact(identifier);
	}

	public Hashtable<String, String> fetchContact(String contactType) throws IOException{
		
		try{
			return this.dataManager.fetchContactsOf(contactType);
		}
		catch(IOException e){
			throw e;
		}
	}

	public ContactManager(DataManager dataManager){
		this.dataManager = dataManager;
	}

}