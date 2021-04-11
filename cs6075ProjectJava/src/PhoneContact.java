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

    public String type;

    public PhoneContact(String name, String number){
        this.name = name;
        this.number = number;
        this.type = "Phone number";
    }

    public String getName(){
        return this.name;
    }

    public String getUniqueIdentifier() {
        // TODO Auto-generated method stub
        return this.number;
    }

    public String getType(){
        return this.type;
    }
}