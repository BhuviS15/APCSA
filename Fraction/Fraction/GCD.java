
/**
 * This GCD class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class GCD
{
    public static void main(String[] args) {
        int n0 = 48;
        int n1 = 60;

        System.out.println("Finding GCD of " + n0 + " and " + n1);
        int gcd = findGCD(n0, n1);
        System.out.println("The GCD is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
