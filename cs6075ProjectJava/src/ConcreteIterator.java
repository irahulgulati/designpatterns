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
public class ConcreteIterator implements ContactIterator {

    private ContactList list;
    private int index;
    
    public ConcreteIterator (ContactList arrayL){ 
        this.list = arrayL;
        this.index = 0;
    }

    @Override
    public void first() {
        // TODO Auto-generated method stub
        this.index = 0;
    }

    @Override
    public void next() {
        // TODO Auto-generated method stub
        index++;
    }

    @Override
    public boolean isDone() {
        // TODO Auto-generated method stub
        return index >=list.count();
    }

    @Override
    public Contact currentItem() {
        // TODO Auto-generated method stub
        return list.get(this.index);
    }
}