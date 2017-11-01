/**
 *
 * @author Ahsan
 */
public class Student extends Person {
    
    private String studentType;
    private int    studentID;
    
    
    public Student(String firstName, String lastName, String email, String type, int id) {
        
        super(firstName,lastName,email);
        this.studentType = type;
        this.studentID = id;
    }
    
        
    public void setStudentID (int studentID) {
        
        this.studentID = studentID;
    }
    
    public int getStudentID () {
        
        return this.studentID;
    }
    
    
    
    
    public void setStudentType (String studentType) {
        
        this.studentType = studentType;
    }
    
    
    
    
    public String getStudentType () {
        
        return this.studentType;
    }
    
    
    
}
