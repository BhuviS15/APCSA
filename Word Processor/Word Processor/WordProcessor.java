
/**
 * This class performs some basic word processing functions, 
 * namely find, remove, and replace.
 *
 * @author  (your name)
 * @version (today's date)
 */
public class WordProcessor
{
    /** Determines if item exists in phrase.
     * Returns true if it does, false otherwise. */
    public static boolean find (String phrase, String item)
     {
         /**
          * if (phrase.indexOf(item) == -1)
             return false;
         else
             return true;
         */
         return phrase.indexOf(item) != -1;
     }
    public static String remove (String phrase, String item)
    {
        if(find(phrase, item))  // Check if the item exists in the phrase
        {
            String beginning = phrase.substring(0, phrase.indexOf(item));  // Get substring before the item
            String ending = phrase.substring(phrase.indexOf(item) + item.length());  // Get substring after the item
            return beginning + ending;  // Concatenate and return the result
        }
        else
        {
            return phrase;  // If item is not found, return the original phrase
        }
    }
    public static String replace (String phrase, String item, String replacement)
    {
        if(find(phrase, item))  // Check if the item exists in the phrase
        {
        String beginning = phrase.substring(0, phrase.indexOf(item));  // Get substring before the item
        String ending = phrase.substring(phrase.indexOf(item) + item.length());  // Get substring after the item
        return beginning + replacement + ending;  // Concatenate and return the result
        }
        else
        {
        return phrase;  // If item is not found, return the original phrase
        }
    }
    }
