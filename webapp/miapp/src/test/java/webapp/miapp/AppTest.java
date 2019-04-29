package webapp.miapp.src.test.java.webapp.miapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        new Persona("xx", 1995, "zz");
        new Persona("yy", 1999, "vv");
        assertEquals(2, PersonaController.numContactos());
    }
}
