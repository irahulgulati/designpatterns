import java.io.IOException;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SaveCommand extends Command {

    
    private Memento memento;

    private SystemFacade systemFacade;

    public ArrayList execute(){
        // call to do something
        memento = this.systemFacade.createMemento();
		try{
			this.systemFacade.saveContacts();
            return null;
		}
		catch(IOException e){
            return null;
		}
    }

    public void unexecute(){
        //unexecute the command
        this.systemFacade.setMemento(memento);

    }

    public SaveCommand( SystemFacade systemFacade){
        this.systemFacade = systemFacade;
    }
}