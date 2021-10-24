package TestCases;

import junit.framework.TestCase;
import main.ArithmeticOperation;

/**
 *
 * @author Schadrack-Olivet
 */
public class TestAdditonSubtraction extends TestCase{
    private final ArithmeticOperation OBJ = new ArithmeticOperation();
    
    // testcase for addition method
    public void testAddition(){
        OBJ.setFirstNumber(45);
        OBJ.setSecondNumber(15);
        long expected = 60;
        
        assertTrue(expected == OBJ.addition());       
    }
    
    // testcase for subtraction method
    public void testSubtraction(){
        OBJ.setFirstNumber(45);
        OBJ.setSecondNumber(15);
        long expected = 30;
        
        assertTrue(expected == OBJ.subtraction());       
    }
    
    // testcase for multiplication method
    public void testMutliplication(){
        OBJ.setFirstNumber(45);
        OBJ.setSecondNumber(15);
        long expected = 675;
        
        assertTrue(expected == OBJ.mutliplication());       
    }
}
