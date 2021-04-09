
/**
 * 
 */
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class EmailContactFactory implements ContactFactory {
    private String name;
    private String email;

    public Contact createContactObject(){
        Contact emailContact = new EmailContact(name, email);
        return emailContact;
    }
    
    public EmailContactFactory(String name, String email){
        this.name = name.toLowerCase();
        this.email = email.toLowerCase();
    }
}