import static org.junit.Assert.*;
import org.junit.*;

/**
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar JavaFileTest.java
 * 
 * 
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore JavaFileTest
 */
public class JavaFileTest {
    @Test
    public void test1() {
        assertTrue(!JavaFile.returnFalse());

    }

}
