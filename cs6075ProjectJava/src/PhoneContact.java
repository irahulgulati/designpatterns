/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PhoneContact extends Contact {
    public String name;

    public String number;

    public PhoneContact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public String getUniqueIdentifier() {
        // TODO Auto-generated method stub
        return this.number;
    }
}