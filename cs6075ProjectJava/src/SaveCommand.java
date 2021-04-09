import java.io.IOException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SaveCommand extends Command {

    
    private Memento memento;

    public SystemFacade systemFacade;

    public void execute(){
        // call to do something
        memento = this.systemFacade.createMemento();
		try{
			this.systemFacade.saveContacts();
		}
		catch(IOException e){
			System.out.println(e);
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