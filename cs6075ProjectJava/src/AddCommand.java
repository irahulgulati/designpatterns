import java.io.IOException;
import java.util.Hashtable;

public class AddCommand extends Command{
    private Contact contact;
    
    private Memento memento;
    private ContactList contactList;

    public SystemFacade systemFacade;

    public String execute(){
        // call to do something
        memento = this.systemFacade.createMemento();
        this.systemFacade.addContact(this.contact);
        return "Contact added";
    }

    public void unexecute(){
        //unexecute the command
        this.systemFacade.setMemento(memento);

    }

    public AddCommand( Contact contact , SystemFacade systemFacade){
        this.contact = contact;
        this.systemFacade = systemFacade;
    }
}
