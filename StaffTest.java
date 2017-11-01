import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahsan
 */
public class StaffTest {
    
    public StaffTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    Staff s = new Staff("sFName","sLName","sEmail",123);
    
    
    /**
     * Test of setStaffID method, of class Staff.
     */
    @Test
    public void testSetStaffID() {
        
        s.setStaffID(123);
    }

    /**
     * Test of getStaffID method, of class Staff.
     */
    @Test
    public void testGetStaffID() {
        
        int result = s.getStaffID();
        int expResult = 123;
        assertEquals(expResult, result);
    }
    
}
