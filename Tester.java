
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String[] args)
    {
        MyArrayList<Integer> nums = new MyArrayList<Integer>();
        nums.add(4);
        nums.add(12);
        nums.add(-365);
        System.out.println(nums);
        
        MyArrayList<String> words = new MyArrayList<String>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println(words);
    }
}
