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

    public void execute(){
        this.memento = this.systemFacade.createMemento();
		Contact  ct = this.systemFacade.searchContact(this.name);
		System.out.println("Printing contact searched");
        if(ct!=null){
		    System.out.println(ct.getName()+","+ct.getUniqueIdentifier());
        }
        else{
            System.out.println("No contact found");
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