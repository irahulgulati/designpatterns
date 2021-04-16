import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ColoredText extends PrintDecorator {
    public ColoredText(ArrayList<Contact> contacts ) {
        super(contacts);
    }

    public void printText(){
        System.out.println("[textColor= Red]");
        super.printText();
    }
}