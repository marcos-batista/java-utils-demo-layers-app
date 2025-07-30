package test.marcosbatista.java.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestMain  extends TestCase {
	
    public TestMain( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( TestMain.class );
    }

    public void testApp() {
        assertTrue( true );
    }
}
