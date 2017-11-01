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
public class TutorGroupTest {
    
    public TutorGroupTest() {
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

    
    TutorGroup tg = new TutorGroup();
    
    
    /**
     * Test of addTutor method, of class TutorGroup.
     */
    @Test
    public void testAddTutor() {
        
        tg.addTutor("tFName", "tLName", "tEmail", 111);
    }

    /**
     * Test of getTutor method, of class TutorGroup.
     */
    @Test
    public void testGetTutor() {
        
        Staff expResult = tg.addTutor("tFName", "tLName", "tEmail", 111);
        Staff result = tg.getTutor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addStudent method, of class TutorGroup.
     */
    @Test
    public void testAddStudent() {
        
        assertEquals(tg.getGroupSize(), 0);
        Student s = tg.addStudent("Ahsan","Mirza","aMirza","UG",999);
        assertEquals(tg.getGroupSize(), 1);
        assertTrue(tg.getStudent(0).equals(s));
        
    }

    /**
     * Test of removeStudent method, of class TutorGroup.
     */
    @Test
    public void testRemoveStudent() {
        
        Student s = tg.addStudent("Ahsan","Mirza","aMirza","UG",999);
        assertEquals(tg.getGroupSize(), 1);
        tg.removeStudent(0);
        assertEquals(tg.getGroupSize(), 0);
        
    }



    /**
     * Test of getGroupSize method, of class TutorGroup.
     */
    @Test
    public void testGetGroupSize() {
        
        int result = tg.getGroupSize();
        int expResult = 0;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGroupName method, of class TutorGroup.
     */
    @Test
    public void testSetGroupName() {
        
        tg.setGroupName("First Group");
        
    }

    /**
     * Test of getGroupName method, of class TutorGroup.
     */
    @Test
    public void testGetGroupName() {
        
        tg.setGroupName("First Group");
        String result = tg.getGroupName();
        String expResult = "First Group";
        assertEquals(expResult, result);
        
    }
    
}
