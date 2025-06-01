
/**
 * This MinutesInAYear class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class MinutesInAYear
{
    public static void main(String [] args)
    {
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerYear = 365;
        int minutesInAYear = minutesPerHour * hoursPerDay * daysPerYear;
        System.out.println("The number of minutes in a year is " + minutesInAYear);
    }
}
