import java.io.IOException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SaveCommand extends Command {

    
    private Memento memento;

    private SystemFacade systemFacade;

    public String execute(){
        // call to do something
        memento = this.systemFacade.createMemento();
		try{
			this.systemFacade.saveContacts();
            return "Contact saved";
		}
		catch(IOException e){
            return "Error while saving contacts";
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