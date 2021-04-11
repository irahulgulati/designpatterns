import java.util.Scanner;
import java.util.Stack;

/**
 * 
 */
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UI {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private SystemFacade systemFacade;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private PrintDecorator printDecorator;

	private Contact contact;

	private Stack<Command> commandStack;
	
		
	// 	// end-user-code
   public void addContact() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please select which type of contact you want to add");
	   System.out.println("1: Contact with phone number, 2: Contact with email addressj");
	   int selectedOption = scan.nextInt();
	   if (selectedOption ==1){
			System.out.println("Please enter contact name and phone number seperated by comma");
			String input = scan.next();
			String[] arr = input.split(",");
			ContactFactory contactFactory = new PhoneContactFactory(arr[0], arr[1]);
			this.contact = contactFactory.createContactObject();
	   }
	   if(selectedOption == 2){
		   	System.out.println("Please enter contact name");
			String name = scan.next();
			System.out.println("Please enter contact email address");
			String number = scan.next();
			ContactFactory contactFactory = new EmailContactFactory(name, number);
			this.contact = contactFactory.createContactObject();
	   }
	   Command addCommand = new AddCommand( this.contact, systemFacade);
	   this.commandStack.add(addCommand);
	   addCommand.execute();
   }

	public void control(){

		Boolean cont = true;
		while(cont){
			System.out.println("Please select suitable option");
			System.out.println("1: Add new contact");
			System.out.println("2: Remove contact");
			System.out.println("3: Save contacts to contact file");
			System.out.println("4: Search contact in contact list");
			System.out.println("5: Undo :Only works for add and remove command:");
			System.out.println("6: Print list of contacts of specific type(either email or phone number)");
			System.out.println("7: Quit");

			Scanner scan  = new Scanner(System.in);
			int selectedOption = scan.nextInt();
			if (selectedOption == 1) {
				this.addContact();
				
			}
			else if(selectedOption == 2){
				System.out.println("Please enter email or phone number of contact you want to delete");
				String identifier = scan.next();
				Command removeCommand  = new RemoveCommand(this.systemFacade, identifier);
				this.commandStack.add(removeCommand);
				removeCommand.execute();
			}
			else if(selectedOption ==  3) {
				Command savecommand = new SaveCommand(this.systemFacade);
				this.commandStack.add(savecommand);
				savecommand.execute();
			}
			else if(selectedOption == 4) {
				this.searchCommandHelperFunction();
			}
			else if(selectedOption == 5){
				System.out.println("fourrr");
				if(commandStack.size()<=0) {
					System.out.println("There is nothing to undo");
					System.out.println("");
				}
				else {
					Command qc = commandStack.pop();
					qc.unexecute();
				}
			}
			else if(selectedOption == 6){
				System.out.println("Please enter contact type:");
				String selectedContactType = scan.next();
				Command printallCommand = new PrintAllCommand(this.systemFacade, selectedContactType);
				this.commandStack.add(printallCommand);
				printallCommand.execute();
			}
			else if (selectedOption == 7) {
				System.out.println("Exiting application!!!");
				cont = false;
				System.exit(1);
			}
			else {
				System.out.println("Please enter valid choice");
			}
		}
	}

	public void searchCommandHelperFunction(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter contact name to search");
		String searchName = scan.next();
		Command searchcommand = new SearchCommand(this.systemFacade, searchName);
		this.commandStack.add(searchcommand);
		String message = searchcommand.execute();
		stylizedOutput(message);

	}

	public void stylizedOutput(String message){
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please select style you want to apply to searched text");
		System.out.println("1: Print large text");
		System.out.println("2: Print small text");
		System.out.println("3: Print text in red color");
		int selectedStyleOption = scan.nextInt();
		if(selectedStyleOption == 1){
			PrintDecorator largedecorator = new LargeText(message);
			largedecorator.printText();
		}
		else if(selectedStyleOption == 2){
			PrintDecorator  smalldecorator = new SmallText(message);
			smalldecorator.printText();
		}
		else if(selectedStyleOption == 3){
			PrintDecorator colordecorator = new ColoredText(message);
			colordecorator.printText();
		}
	}
	
	public UI() {
		this.systemFacade = new SystemFacade();
		this.commandStack = new Stack<Command>();
	}
}