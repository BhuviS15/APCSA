
/**
 * This StringArray class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class StringArray
{
    public static int numInArray(String[] a, String s) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (s.equals(a[i])) {
                count++;
            }
        }
        return count;
    }
    
    // postcondition: for all k such that 0 <= k < a.length,
    // returns the string in a[k] followed by a colon
    // and a space and the number of times that string
    // occurs in b. (\n is used to generate a new line)
    public static String listAllNums(String[] a, String[] b)
    {
        String result = "";
        for (int i = 0; i < a.length; i++) { 
            String s = a[i];
            int count = numInArray(b, s);
            result += s + ": " + count + "\n";
        }
        
        return result;
    }
}
