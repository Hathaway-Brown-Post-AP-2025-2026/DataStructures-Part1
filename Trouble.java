
/**
 * Write a description of class Trouble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trouble
{
    public static int delegate (int a, int b)   {
        return a / b;
    }
    
    public static void calculate(int a, int b)  {
        System.out.println (delegate (a, b));
    }
    
    public static void doMath (int a, int b)    {
        System.out.println(a);
        System.out.println(b);
        calculate(a, b);
    }
    
    public static void main (String[] args)      {
        doMath(3, 0);
    }
}
