
/**
 * Creates an ArrayList from scratch!
 *
 * @author  Michael Buescher
 * @version 2025-08
 */
public class MyArrayList<T>
{
    private T[] data;
    private int size;
    
    public MyArrayList()
    {
        data = (T[])(new Object[10]);
        size = 0;
    }
    
    public boolean add(T item)
    {
        if (size == data.length) {                    // If the List is full
            T[] temp = (T[])(new Object[2 * size]);   // make a new list twice as big
            for (int i = 0; i < size; i++)
            {
                temp[i] = data[i];                    // Fill with the existing data
            }
        }
        
        data[size] = item;          // Add new item to the end
        size++;                     // Update size
        return true;
    }
    
    public String toString()
    {
        String ans = "[";
        
        // add all but the last item, with parentheses
        for (int i = 0; i < size - 1; i++) {
            ans += data[i] + ", ";
        }
        
        // add the last item
        if (size > 0) {
            ans += data[size - 1];
        }
        
        ans += "]";
        return ans;
    }
}
