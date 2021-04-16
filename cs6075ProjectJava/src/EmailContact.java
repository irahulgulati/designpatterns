import java.text.MessageFormat;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class EmailContact extends Contact {
    public String name;
    public String email;
    public String type;

    public EmailContact(String name, String email){
        this.name = name;
        this.email = email;
        this.type = "email";
    }

    public String getName(){
        return this.name;
    }

    public String getUniqueIdentifier(){
        return this.email;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString(){
        return MessageFormat.format("Name: {0}, Contact: {1}", this.name, this.email);
    }

    public void accept(ContactVisitor visitor){
        System.out.println("Accepting email contact");
        visitor.visitContact(this);
    }
}