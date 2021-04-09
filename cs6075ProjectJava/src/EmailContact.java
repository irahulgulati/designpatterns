/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class EmailContact extends Contact {
    public String name;
    public String email;

    public EmailContact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getUniqueIdentifier(){
        return this.email;
    }
}