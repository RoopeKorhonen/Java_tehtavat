import Week_3_OhtuUnitTesting_3.StringManipulatorRoope;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulatorRoopeTest {
    private StringManipulatorRoope stringManipulator;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Setting up resources before all tests...");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Cleaning up resources after all tests...");
    }

    @Before
    public void setUp() {
        stringManipulator = new StringManipulatorRoope();
        System.out.println("Setting up resources before each test...");
    }

    @After
    public void tearDown() {
        stringManipulator = null;
        System.out.println("Cleaning up resources after each test...");
    }

    @Test
    public void testReverse() {
        assertEquals("cba", stringManipulator.reverse("abc"));
        assertEquals("54321", stringManipulator.reverse("12345"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("HELLO", stringManipulator.capitalize("hello"));
        assertEquals("WORLD", stringManipulator.capitalize("world"));
    }
}

