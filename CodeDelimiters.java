import java.util.ArrayList;

/**
 * Write a description of class CodeDelimiters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodeDelimiters
{
    private static ArrayList<String> opening = new ArrayList<String>();
    private static ArrayList<String> closing = new ArrayList<String>();
    static {
        opening.add("(");
        opening.add("[");
        opening.add("{");
        opening.add("<");
        closing.add(")");
        closing.add("]");
        closing.add("}");
        closing.add(">");
    }
    public static String getCode(String s) {
        String expected;
        MyStack<String> delimiterStack = new MyStack<String>();
        for (int i = 0; i < s.length(); i++) {
            String currChar = s.substring(i, i+1);
            if (opening.contains(currChar)) {
                delimiterStack.push(currChar);
            } else {
                String popped = delimiterStack.pop();
                expected = opening.get(closing.indexOf(currChar));
                if (!popped.equals(expected)) {
                    return "Case #" + (opening.indexOf(popped) + 1);
                }
            }
        }
        if (delimiterStack.empty()) {
            return "Code #0";
        } else {
            return "Case #" + (opening.indexOf(delimiterStack.pop()) + 1);
        }
    }
}
