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
public class ArrayListTest {
    
    public ArrayListTest() {
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
    
    ArrayList<Student> list = new ArrayList<>();
    
    /**
     * Test of add method, of class ArrayList.
     */
    @Test
    public void testAdd() {
        
        assertEquals(list.size(), 0);
        Student s = new Student("Ahsan","Mirza","aMirza","UG",999);
        list.add(s);
        assertEquals(list.size(), 1);
        assertTrue(list.get(0).equals(s));
    }

    /**
     * Test of get method, of class ArrayList.
     */
    @Test
    public void testGet() {
        
       
       Student s = new Student("Ahsan","Mirza","aMirza","UG",999);
       list.add(s);
       Student result = list.get(0);
       
       assertTrue(result.equals(s));
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @Test
    public void testRemove() {
        
        Student s = new Student("Ahsan","Mirza","aMirza","UG",999);
        list.add(s);
        assertEquals(list.size(), 1);
        
        list.remove(0);
        assertEquals(list.size(), 0);

    }

    /**
     * Test of size method, of class ArrayList.
     */
    @Test
    public void testSize() {
        
        int result = list.size();
        int expResult = 0;
        assertEquals(expResult, result);
    }
    
}
