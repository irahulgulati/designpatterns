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
public class PhoneNumberBuilder extends ContactBuilder {
	
	private Hashtable<String, String> contactTable;
	
	public void buildContactList(String contactDetail) {
		String[] arrOfStr = contactDetail.split(",");
		if(arrOfStr[2].equals("Phone number")){
			this.contactTable.put( arrOfStr[0], arrOfStr[1]);
			System.out.println(this.contactTable);
		}
	}
	
	public Hashtable<String,String> getResult() {
		return this.contactTable;
	}
	
	public PhoneNumberBuilder() {
		super.instanceTable.put("PhoneNumberBuilder", this);
		this.contactTable = new Hashtable<String, String>();
	}


}