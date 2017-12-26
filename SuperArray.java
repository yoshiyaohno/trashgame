/**
  SuperArray implements list data and operations
  by encapsulating an array
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class SuperArray {

    private Object[] data;  // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;

    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperArray() {
        data = new Object[ INITIAL_CAPACITY];
        // filledElements 0 is already correct
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /** 
       @return a string representation of this list, in [a,b,c,] format
      */ 
    public String toString() {
        String result = "[";
        for( int i = 0; i < filledElements; i++) {
            if (data[i] instanceof String)
                result += "\"" + data[i] + "\"";
            else
                result += data[ i];
            result += ",";
        }
        return result + "]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( Object value) {
         // expand if necessary
         if( filledElements == data.length) expand();

         data[ filledElements++] = value;
        return true;
     }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
        Object[] bigger = new Object[ data.length * 2];
        for( int i = 0; i < filledElements; i++)
            bigger[i] = data[i];
        data = bigger;
     }

    /** 
      Removes the element at the specified position in this list.

      Shifts any subsequent elements to the left (that is, 
      subtracts one from their indexes).
      
      @return the value that was removed from the list
     */
     public Object pop( int index) {
         Object popped = data[index];
         for( int i = index; i < filledElements; ++i )
             data[i] = data[i+1];
         --filledElements;
         return popped;
     }

}

