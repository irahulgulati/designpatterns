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
public class Memento {

    private ContactList  arraylist;

    public ContactList getState(){

        return this.arraylist;
    }

    public void  setState(ContactList state){
        this.arraylist = state;
    }
}