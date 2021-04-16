import java.util.ArrayList;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactNameVisitor implements ContactVisitor {

    private ArrayList<Contact> searchedContact;
    @Override
    public void visitContact(Contact contact) {
        // TODO Auto-generated method stub
        System.out.println("visting contact and adding it");
        this.searchedContact.add(contact);
    }

    @Override
    public ArrayList<Contact> getResult() {
        // TODO Auto-generated method stub
        System.out.println("Getting result");
        return searchedContact;
    }

    public ContactNameVisitor(){
        this.searchedContact = new ArrayList<Contact>();
    }
}