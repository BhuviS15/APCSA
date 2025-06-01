
/**
 * This class calculates the circumference, surface area, and volume 
 * of a sphere of the provided radius.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class Sphere
{
    public static double circumference(int radius)
    {
        return Math.PI * radius * 2.0;     // replace this line
    }
    
    public static double surfaceArea(int radius)
    {
        return 4.0 * Math.PI * radius * radius;     // replace this line
    }
    
    public static double volume(int radius)
    {
        return (4.0/3) * Math.PI * (radius * radius * radius);     // replace this line
    }
}