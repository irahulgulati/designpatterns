/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rrahul
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class LargeText extends PrintDecorator {

    // private PrintDecorator text;
    public LargeText(String string) {
        super(string);
    }

    public void printText(){
        System.out.println("[textSize= Large]");
        super.printText();
    }
}