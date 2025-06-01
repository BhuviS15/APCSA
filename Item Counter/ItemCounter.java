
/**
 * This ItemCounter class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ItemCounter
{
   public static int itemCounter(String phrase, String item)
   {
       int count = 0;
       int location = phrase.indexOf(item);
       while (location >= 0)
       {
           count++;
           location = phrase.indexOf(item, location + 1);
       }
       return count;
   }
}
