/**
 *
 * @author Ahsan
 */


public class Person {
    
    private String firstName;
    private String lastName;
    private String email;
    
    /**
     *
     *Constructors 
     **/
    public Person() {
    
    }
    
    public Person(String firstName, String lastName, String email) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        
    }

    /**
     * 
     * getters and setters 
     * 
     **/
    
    public void setFirstName (String firstName) {
        
        this.firstName = firstName;
    }
    
    
    public String getFirstName() {
        
        return this.firstName;
    }
    
    
    public void setLastName (String lastName) {
        
        this.lastName = lastName;
    }
    
    
    public String getLastName () {
        
        return this.lastName;
    }
    
    
    public void setEmail (String email) {
        
        this.email = email;
    }
    
    
    
    public String getEmail () {
        
        return this.email;
    }
    
    
}
