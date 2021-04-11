public class RemoveCommand extends Command{
   private Memento memento;

    private String identifier;

    public SystemFacade systemFacade;

    public String execute(){
        this.memento = this.systemFacade.createMemento();
		if(this.systemFacade.deleteContact(this.identifier)){
            return "Deleted contact";
        }
        else{
            return "Cannot delete contact, either it does not exist or there was some error";
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
