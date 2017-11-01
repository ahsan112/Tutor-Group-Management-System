
/**
 *
 * @author Ahsan
 */


public class TutorGroupCollection {
    
    public static ArrayList<TutorGroup> tGroup = new ArrayList();
    
    
    /**
     * 
     * Method to create a Tutor Group
     * 
     * @param groupName
     * @return 
     **/
    
    public TutorGroup createTutorGroup(String groupName) {
        
        TutorGroup t = new TutorGroup();
        t.setGroupName(groupName);
        tGroup.add(t);
        return t;
    }
    
    public TutorGroup createTutorGroup() {
        
        TutorGroup t = new TutorGroup();
        tGroup.add(t);
        return t;
    }
    
    
    /**
     * 
     * Method to get the size of the tutor group
     * collection array
     * @return 
     **/
    
    
    public int getTutorGroupCollectionSize() {
        return tGroup.size();
    }
    
    
    /**
     * 
     * Method to get a tutor group from the
     * tutor group collection
     * @param index
     * @return 
     ***/
    
    
    public TutorGroup getTutorGroup(int index) {
        
        return tGroup.get(index);
    }


    /**
     * 
     * Method to add a tutor group to the 
     * tutor group collection 
     * @param tg
     ***/
    
    public void addTutorGroup(TutorGroup tg) {
        
        tGroup.add(tg);
    }
    

    
    
}
