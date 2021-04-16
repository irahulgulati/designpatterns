import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * 
 */
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DataManager {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ContactList contactList;
	
	// private ArrayList<Contact> contactList; //this has to be from adapter pattern
 	
	public Hashtable<String, String> fetchContactsOf(String contactType)  throws IOException{
		try {
				String fileName = null;
				Hashtable<String, String> result = null;
				if (contactType.equals("phonenumber")) {
					new PhoneNumberBuilder();
					ContactType.contactType = "PhoneNumberBuilder";
					ContactBuilder builder = (PhoneNumberBuilder) ContactBuilder.getContactBuilder();
					fileName = "contacts.data";
					ContactDirector director = new ContactDirector(builder);
					director.buildList(fileName);
					result = builder.getResult();
				}
			
				if(contactType .equals("email")){
					new EmailBuilder();
					ContactType.contactType = "EmailBuilder";
					ContactBuilder builder = (EmailBuilder) ContactBuilder.getContactBuilder();
					fileName = "contacts.data";
					ContactDirector director = new ContactDirector(builder);
					director.buildList(fileName);
					result= builder.getResult();
				}

				return result;
		}
		catch(IOException e){
			throw e;
		}
		
	}
	
	public void save() throws IOException {
		File fl = new File("contacts.data");

		if(!fl.isFile()) {
			fl.createNewFile();
		}
		PrintWriter writer = new PrintWriter(new FileOutputStream(fl));
		for(int i = 0; i<this.contactList.count();i++){
			Contact contact = this.contactList.get(i);
			String name = contact.getName();
			String identifier = contact.getUniqueIdentifier();
			String type = contact.getType();
			writer.println(name+","+identifier+","+type);
		}
	   
	    writer.close();
	}

	public void load() throws IOException {
		File fl = new File("contacts.data");
		if(!fl.isFile()) {
			fl.createNewFile();
		}
		Scanner scan = new Scanner(new FileReader(fl));
		while(scan.hasNext()){
			ContactFactory factory = new EmailContactFactory("Hello","World");
			Contact newContact = factory.createContactObject();
		    this.contactList.append(newContact);
		}
		scan.close();
	}

	public Boolean deleteContact(String identifier){
		for(int i = 0; i<this.contactList.count();i++){
			Contact contact = contactList.get(i);
			System.out.println("thissssss"+contact.getUniqueIdentifier()+",,,,,,,,"+identifier);
			if(contact.getUniqueIdentifier().equals(identifier)){
				System.out.println("entering identii");
				this.contactList.delete(contact);
				return true;
			}
		}
		return false;
	}

	public Memento createMemento(){
		Memento memento = new Memento();
		ContactList copiedList = this.clone();
		memento.setState(copiedList);
		return memento;
	}

	public ContactList clone(){
		ContactList clonedContactList = new ContactListAdapter();
		for (int i=0;i<this.contactList.count();i++){
			clonedContactList.append(this.contactList.get(i));
		}
		return clonedContactList;

	}

	public void setMemento(Memento memento){
		System.out.println("state"+memento.getState());
		this.contactList = memento.getState();
	}
	
	public ContactList getAllContacts() {
		return this.contactList;
	}
	public DataManager() {
		this.contactList = new ContactListAdapter();
	}
}