
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import longest1s.driver;

/**
 * Unit test for simple driver.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
    	String test1 = "-1";
        assertFalse( driver.main(test1) != 32);
        String test2 = "0";
        assertTrue( driver.main(test2) == 0);
        String test3 = "255";
        assertTrue( driver.main(test3) == 8);
        /* Hard to test given if the parameter is null it goes to user input, but it does work. I just commented it out so you wouldn't have to deal with it.
         * String test4 = null;
         * assertTrue( driver.main(test4) == null); */
    }
}
