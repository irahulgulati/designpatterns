
/**
 * 
 */
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PhoneContactFactory implements ContactFactory {

    private String name;

    private String number;

    public Contact createContactObject(){
        Contact phoneContact = new PhoneContact(name, number);
        return phoneContact;
    }

    public PhoneContactFactory(String name, String number){
        this.name = name.toLowerCase();
        this.number = number;
    }
}