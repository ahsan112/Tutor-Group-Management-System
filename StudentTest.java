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
public class StudentTest {
    
    public StudentTest() {
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

    
    Student std = new Student("Ahsan","Mirza","aMirza","UG",999);
    
    
    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        
        std.setStudentID(999);
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        
        int result = std.getStudentID();
        int expResult = 999;
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentType method, of class Student.
     */
    @Test
    public void testSetStudentType() {
        
        std.setStudentType("UG");
    }

    /**
     * Test of getStudentType method, of class Student.
     */
    @Test
    public void testGetStudentType() {
                
        String result = std.getStudentType();
        String expResult = "UG";
        assertEquals(expResult, result);
    }
    
}
