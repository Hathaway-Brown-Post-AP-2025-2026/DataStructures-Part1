
/**
 * Write a description of class Trouble2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trouble2
{
    public static int whoops (int n)  {
        System.out.println ("whoops(" + n + ")");
        if (n == 0) return n;
        else return whoops (n - 2);
    }
    
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        whoops(a);
    }
}
