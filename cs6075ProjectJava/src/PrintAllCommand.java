import java.io.IOException;
import java.util.Hashtable;

public class PrintAllCommand extends Command{

     private Memento memento;

     private String contactType;

    private SystemFacade systemFacade;

    public String execute(){
        // call to do something
        memento = this.systemFacade.createMemento();
		try{
			Hashtable<String, String> ht = this.systemFacade.fetchContactsOf(this.contactType);
            for(String key: ht.keySet()){
                System.out.println("Name:    " + key+ "   Contact Detail:  " + ht.get(key));
            }
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

    public PrintAllCommand( SystemFacade systemFacade, String contactType){
        this.systemFacade = systemFacade;
        this.contactType = contactType;
    } 
}