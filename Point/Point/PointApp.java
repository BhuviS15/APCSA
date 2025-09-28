
/**
 * This PointApp class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class PointApp
{
    public static Point findFarPoint(Point a, Point b, Point c) {
        double aDistance = a.getDistanceFromOrigin();
        double bDistance = b.getDistanceFromOrigin();
        double cDistance = c.getDistanceFromOrigin();
        if (aDistance > bDistance && aDistance > cDistance) {
            return a;
        }
        if (bDistance > aDistance && bDistance > cDistance) {
            return b;
        }
        return c;
    }
}
