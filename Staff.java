/**
 *
 * @author Ahsan
 */


public class Staff extends Person {
    
    private int staffID; 
    
    public Staff(String firstName,String lastName,String email,int id) {
        
        super(firstName,lastName,email);
        this.staffID = id;
    }
    
    public void setStaffID(int id) {
        
        this.staffID = id;
    }
    
    public int getStaffID() {
        
        return this.staffID;
    }
    
    
}
