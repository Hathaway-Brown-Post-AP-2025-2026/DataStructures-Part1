
/**
 * Write a description of class MyIntegerArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyIntegerArrayList
{
    private int[] baseArray;
    private int size;
    
    // constructors
    public MyIntegerArrayList() {
        size = 0;
        baseArray = new int[10];
    }
    
    public MyIntegerArrayList(int maxItems) {
        size = 0;
        baseArray = new int[maxItems];
    }
    
    // methods
    public int size() {return size;}
    
    public boolean add (Integer n) {
        if (baseArray.length == size) {
            int[] temp = new int[size * 2];
            for (int i = 0; i < baseArray.length; i++) {
                temp[i] = baseArray[i];
            }
            baseArray = temp;
        }
        baseArray[size] = n;
        size++;
        return true;
    }
    
    public int remove(int index) {
        int ret;
        if (index >= size) {
            System.out.println("that's not a valid index :(");
            return 0;
        } else {
            ret = baseArray[index];
            for (int i = index; i < size - 1; i++) {
                baseArray[i] = baseArray[i+1];
            }
            size--;
        }
        return ret;
    }
    
    public int get(int index) {
        if (index >= size) {
            System.out.println("thats not a valid index:(");
            return 0;
        } else {
            return baseArray[index];
        }
    }
    
    public boolean contains(Integer n) {
        for (int i = 0; i < size; i++) {
            if (baseArray[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String str = "[";
        for (int i = 0; i <size - 1; i++) {
            str += baseArray[i] + ", ";
        }
        str += baseArray[size - 1] + "]";
        return str;
    }
    
    public boolean add(int  index, Integer n) {
        if (index < 0 || index > size) {
            System.out.println("bestie that index is invalid");
            return false;
        } else {
            int[] temp;
            if (baseArray.length == size) {
                temp = new int[size * 2];
                
            } else {
                temp = new int[size + 1];
            }
            for (int i = 0; i < index; i++) {
                    temp[i] = baseArray[i];
                }
            temp[index] = n;
            for (int i = index; i < size; i++) {
                temp[i + 1] = baseArray[i];
            }
            size++;
            baseArray = temp;
            return true;
        }
    }
    
    public boolean equals(Object o) {
        if (o instanceof MyIntegerArrayList) {
            MyIntegerArrayList other = (MyIntegerArrayList) o;
            if (other.size() == this.size()) {
                for (int i = 0; i < this.size(); i++) {
                    if (other.get(i) != this.get(i)) {
                        System.out.println("does not match!");
                        return false;
                    }
                }
                return true;
            }
        } 
        System.out.println("not same class or not size :(");
        return false;
    }
    
    public static void main(String[] args) {
        MyIntegerArrayList t1 = new MyIntegerArrayList();
        System.out.println(t1);
        System.out.println(t1.size());
        t1.add(5);
        t1.add(4);
        t1.add(11);
        System.out.println(t1);
        System.out.println(t1.get(0));
        System.out.println(t1.get(1));
        System.out.println(t1.get(3));
        System.out.println(t1.contains(5));
        System.out.println(t1.contains(12));
        System.out.println(t1.remove(0));
        System.out.println(t1.remove(1));
        System.out.println(t1);
        System.out.println(t1.size());
        t1.add(0, 0); // error starts here (still here)
        t1.add(1, 4);
        t1.add(3, 5);
        System.out.println(t1); //error
        t1.add(6,6);
        System.out.println(t1);
        int[] t2 = new int[3];
        System.out.println(t1.equals(t2));
        MyIntegerArrayList t3 = new MyIntegerArrayList(3);
        System.out.println(t3);
        System.out.println(t3.size());
        t3.add(0);
        t3.add(4);
        t3.add(22);
        System.out.println(t3.equals(t1));
         MyIntegerArrayList t4 = new MyIntegerArrayList(2);
        System.out.println(t4);
        System.out.println(t4.size());
        t4.add(0);
        t4.add(4);
        System.out.println(t4.equals(t1));
        MyIntegerArrayList t5 = new MyIntegerArrayList(3);
        System.out.println(t5);
        System.out.println(t5.size());
        t5.add(0);
        t5.add(4);
        t5.add(4);
        System.out.println(t1.equals(t5));
    }
}
