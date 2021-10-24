
package TestCases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author Schadrack-Olivet
 */

// Test class for running all test classes
public class TestRunner {
    public static void main(String args[]){
        Result result = JUnitCore.runClasses(TestAdditonSubtraction.class);
        
        System.out.println("All test cases to run: " + result.getRunCount() + " tests");
        //Print failure messages if tests didn't pass
        result.getFailures().forEach(msg ->{
            System.out.println(msg.getDescription().toString());
        });
        
        if(result.wasSuccessful()){
            System.out.println("\n\n------------------------- OK\n\n");
        }else{
           System.out.println("\n\n-------------------------- ERRORS\n\n");
        }
    }
}
