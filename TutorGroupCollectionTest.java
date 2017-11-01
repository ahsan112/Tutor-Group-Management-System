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
public class TutorGroupCollectionTest {
    
    public TutorGroupCollectionTest() {
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

    TutorGroupCollection tgc = new TutorGroupCollection();
    
    
    /**
     * Test of createTutorGroup method, of class TutorGroupCollection.
     */
    @Test
    public void testCreateTutorGroup() {
        
        assertEquals(tgc.getTutorGroupCollectionSize(), 0);
        TutorGroup t = tgc.createTutorGroup();
        
        assertEquals(tgc.getTutorGroupCollectionSize(), 1);
        assertTrue(tgc.getTutorGroup(0).equals(t));
        
    }



    /**
     * Test of getTutorGroupCollectionSize method, of class TutorGroupCollection.
     */
    @Test
    public void testGetTutorGroupCollectionSize() {
            
        int result = tgc.getTutorGroupCollectionSize();
        int expResult = 1;
        assertEquals(expResult, result);
    }

    /**
     * Test of getTutorGroup method, of class TutorGroupCollection.
     */
    @Test
    public void testGetTutorGroup() {
        
        TutorGroup tg = tgc.createTutorGroup();
        
        TutorGroup result = tgc.getTutorGroup(1);
        TutorGroup expResult = tg;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addTutorGroup method, of class TutorGroupCollection.
     */
    @Test
    public void testAddTutorGroup() {
        
        assertEquals(tgc.getTutorGroupCollectionSize(), 2);
        TutorGroup t = tgc.createTutorGroup();
        
        assertEquals(tgc.getTutorGroupCollectionSize(), 3);
        assertTrue(tgc.getTutorGroup(2).equals(t));
        
    }
    
}
