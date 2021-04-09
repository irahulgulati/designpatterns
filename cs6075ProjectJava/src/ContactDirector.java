import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactDirector {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ContactBuilder contactBuilder;
	
	
	public void buildList(String fileName) {
		try {
			File fileManager = new File(fileName);
//			StringBuffer text = new StringBuffer();
			FileInputStream fileStream = new FileInputStream(fileManager);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(fileStream));
			
			for (String line; (line=buffer.readLine())!=null;) {
				this.contactBuilder.buildContactList(line);
			}
//			String words = text.toString();
//			
//			for(String word: words.split("\\W+")) {
//				this.contactBuilder.buildContactList(word);
//			}
			buffer.close();
		}
		catch(IOException e) {
			System.out.println("Error while accessing the file");
		}
	}
	
	public ContactDirector(ContactBuilder builder) {
		this.contactBuilder = builder;
	}
}