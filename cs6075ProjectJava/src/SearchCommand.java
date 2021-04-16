import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SearchCommand extends Command {
    private Memento memento;

    private String name;

    public SystemFacade systemFacade;

    public ArrayList<Contact> execute(){
        this.memento = this.systemFacade.createMemento();
		ArrayList<Contact>  ct = this.systemFacade.searchContact(this.name);
        if(ct.size() > 0 ){
            return ct;
        }
        else{
            return null;
        }
    }

    public void unexecute(){
        //unexecute the command
        this.systemFacade.setMemento(this.memento);

    }

    public SearchCommand( SystemFacade systemFacade, String name ){
        this.name = name.toLowerCase();
        this.systemFacade = systemFacade;
    }
}