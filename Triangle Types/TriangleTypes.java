
/**
 * This class classifies various triangle types
 *
 * @author  
 * @version 
 */
public class TriangleTypes
{
    // returns true if this is an Equilateral triangle, false if not
    public static boolean isEquilateral(int a, int b, int c)
    {
        return (a == b) && (b == c);    // replace this line
    }

    // returns true if this is an Isosceles triangle, false if not
    public static boolean isIsosceles(int a, int b, int c)
    {
        return (a == b) || (b == c) || (a == c);    // replace this line
    }

    // returns true if this is a Scalene triangle, false if not
    public static boolean isScalene(int a, int b, int c)
    {
        return !((a == b) || (b == c) || (a == c));    // replace this line
    }

    // returns true if this is a Right triangle, false if not
    public static boolean isRight(int a, int b, int c)
    {
        return ((a*a) + (b*b) == c*c) || ((b*b) + (c*c) == a*a) || ((a*a) + (c*c) == b*b);    // replace this line
    }

    // returns true if a triangle is possible with the given sides, false if not
    public static boolean isTriangle(int a, int b, int c)
    {
        return (((a+b) > c) && (a+c) > b && ((c+b) > a));    // replace this line
        // (Math.abs(a-b) <= c) && (Math.abs(a-c) <= b && Math.abs(c-b) <= a)
    }
}
