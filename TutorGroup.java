/**
 *
 * @author Ahsan
 */


public class TutorGroup {
    
    private String tutorGroupName;
    private ArrayList<Student> student = new ArrayList();
    private Staff tutor;
    private int groupSize;
    private String groupType;
    
    

    
    
    /**
     * 
     * Method to assign tutor
     * 
     * @param firstName
     * @param lastName
     * @param email
     * @param id
     * @return 
     **/
    
    public Staff addTutor(String firstName, String lastName,String email, int id) {
        
        Staff t = new Staff(firstName,lastName,email,id);
        setTutor(t);
        
        return t;
    }
    
    
    /**
     * 
     * method to assign the tutor
     * 
     **/
    
    private void setTutor (Staff tutor) {
        
        this.tutor = tutor;
    }
    
    
    /**
     * 
     * method to get tutor
     * 
     * @return 
     **/
    
    
    public Staff getTutor() {
        
        return this.tutor;
    }
    
    
    
    /*
     * method to add student to the tutor group
     ^
     */
    public Student addStudent(String firstName, String lastName,String email,String type, int id) {
        
        Student s = new Student(firstName,lastName,email,type,id);
        student.add(s);
        groupSize++;
        this.groupType = s.getStudentType();
        return s;
    }
    
    
    
    /**
     * 
     * method to remove students from the tutor group
     * 
     * @param s
     **/
    


    public void removeStudent(int index) {
        
        student.remove(index);
        groupSize--;
    }
    
    
    /**
     * 
     * Method to get Student from the array
     * 
     * @param index
     * @return 
     **/
    
    public Student getStudent(int index) {
        return student.get(index);
    }
    

    
  
    
    /**
     * 
     * method to get the group type
     * 
     * @return 
     **/
    
    public String getGroupType() {
        
        return groupType;
    }
    
    
    /**
     * 
     * method to get the group size
     * 
     * @return 
     **/
    
    
    public int getGroupSize() {
        
        return groupSize;
    }
    
    
       
    /**
     * 
     * method to get and set tutor group name
     * 
     * @param name
     **/
    
    
    public void setGroupName(String name) {
        
        this.tutorGroupName = name;
    }
    
    public String getGroupName() {
        
        return this.tutorGroupName;
    }
}
