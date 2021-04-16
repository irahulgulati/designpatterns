import java.util.ArrayList;

public class RemoveCommand extends Command{
   private Memento memento;

    private String identifier;

    public SystemFacade systemFacade;

    public ArrayList execute(){
        this.memento = this.systemFacade.createMemento();
		if(this.systemFacade.deleteContact(this.identifier)){
            return null;
        }
        else{
            return null;
        }
    }

    public void unexecute(){
        //unexecute the command
        this.systemFacade.setMemento(this.memento);

    }

    public RemoveCommand( SystemFacade systemFacade, String identifier ){
        this.identifier = identifier.toLowerCase();
        this.systemFacade = systemFacade;
    } 
}
