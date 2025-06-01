
/**
 * This class represent some basic String object utilities
 *
 * @author  (your name)
 * @version (today's date)
 */
public class StringUtilities
{
    /** Returns the first character in string
     *  Precondition: string.length() >= 1 
     */
    public static String getFirstCharacter(String string) 
    { 
        return string.substring(0,1);    // replace this line
    } 

    /** Returns the last character in string
     *  Precondition: string.length() >= 1 
     */
    public static String getLastCharacter(String string) 
    { 
        return string.substring(string.length()-1);    // replace this line
    } 

    /** Returns the middle character in string
     *  Precondition: string.length() >= 1 
     */
    public static String getMiddleCharacter(String string) 
    { 
        return string.substring(string.length()/2, string.length()/2 + 1);    // replace this line
    } 
    
    /** Returns a random character from string 
     *  Precondition:  string.length() >= 1
     */
    public static String getRandomCharacter(String string)
    {   
        int randomIndex = (int) (Math.random() * string.length());
        return string.substring(randomIndex, randomIndex + 1);    // replace this line
    }
} 
