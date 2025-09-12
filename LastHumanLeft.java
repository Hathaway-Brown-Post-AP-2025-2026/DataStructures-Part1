import java.util.ArrayList;

/**
 * Write a description of class LastHumanLeft here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LastHumanLeft
{
    // instance variables - replace the example below with your own
    private MyIntegerArrayList children;

    /**
     * Constructor for objects of class LastHumanLeft
     */
    public LastHumanLeft(int numKids)
    {
        children = new MyIntegerArrayList();
        for (int i = 0; i < numKids; i++) {
            children.add(i);
        }
    }

    public int play() {
        int it = 0;
        while (children.size() > 1) {
            //reset so .remove is within bounds if the last child is currently "it" (it == size -1) OR if the last child just got out (it == size)
            if (it >= children.size() - 1) {
                it -= children.size();
            }
            children.remove(it + 1);
            it++;
        }
        return children.get(0);
    }
    
    public static void main(String[] args) {
        LastHumanLeft test1 = new LastHumanLeft(5);
        System.out.println(test1.play());
        LastHumanLeft test2 = new LastHumanLeft(10);
        System.out.println(test2.play());
        ArrayList<Integer> test = new ArrayList<Integer>();
    }
}
