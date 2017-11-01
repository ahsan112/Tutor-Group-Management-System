import java.util.Arrays;

/**
 *
 * @author Ahsan
 */
class ArrayList<T> {
    private static final int STARTING_CAPACITY = 10;
    private Object elementData[]={};
    private int size = 0;



    public ArrayList() {
      elementData = new Object[STARTING_CAPACITY];
    }

    /**
     * 
     * Method to add to the arrayList
     * 
     **/

    public void add(T t) {
      if (size == elementData.length) {
        increaseCapacity(); //increase current capacity of list, make it double.
      } 
      elementData[size++] = t;
    }

    /**
     * 
     * Method to get from the arrayList
     * 
     **/

    public T get(int index) {
      if ( index <0 || index>= size) {  
        throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
      }
      return(T) elementData[index]; //return value on index.
    }


     /**
     * 
     * Method to remove from  the arrayList
     * 
     **/
    
    public Object remove(int index) {
        
        get(index);
        
        if ( index <0 || index>= size) {  
          throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        Object removedElement=elementData[index];
        for(int i=index;i<size;i++){
           elementData[i]=elementData[i+1];
        }
        size--;   //reduce size of ArrayListCustom after removal of element.

        return removedElement;
    }
    
    /**
     * 
     * Method to increase the size of the  array
     * 
     **/
    
    private void increaseCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    /**
     * 
     * Method to return the size of  the arrayList
     * 
     **/
    
    public int size() {
        return size;
    }
    
}
