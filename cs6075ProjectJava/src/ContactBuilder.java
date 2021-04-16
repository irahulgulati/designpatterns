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
public abstract class ContactBuilder {
	
	private  static ContactBuilder contactInstance;
	
	protected static Hashtable<String,ContactBuilder> instanceTable;

	static {
		instanceTable = new Hashtable<String, ContactBuilder>();
	}
	
	public void buildContactList(String contactDetail) {
		
	}

	protected ContactBuilder(){

	}
	
	public static ContactBuilder getContactBuilder() {
		// if (instanceTable.get(ContactType.contactType) == null) {
		// 	return contactInstance;
		// }
		// else {
			contactInstance = instanceTable.get(ContactType.contactType);
			return contactInstance;
		// }
	}

	public abstract Hashtable<String,String> getResult();
	
	// public abstract Hashtable<String, String> getResult();
}