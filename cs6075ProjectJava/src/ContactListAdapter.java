
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactListAdapter extends ArrayList<Contact> implements ContactList {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ContactListAdapter(){
		super();
	}
	
	public int count() {
		return super.size();
	}

	public Contact get(int indx) {
		return super.get(indx);
	}

	public Contact first() {
		return super.get(0);
	}

	public Contact last() {
		return super.get(super.size()-1);
	}

	public boolean include(Contact Obj) {
		return super.contains(Obj);
	}

	public void append(Contact Obj) {
		super.add(Obj);
	}

	public void prepend(Contact Obj) {
		super.add(0, Obj);
	}

	public void delete(Contact Obj) {
		super.remove(Obj);
	}

	public void deleteLast() {
		super.remove(super.size()-1);
	}

	public void deleteFirst() {
		super.remove(0);
	}

	public void deleteAll() {
		super.clear();
	}

}