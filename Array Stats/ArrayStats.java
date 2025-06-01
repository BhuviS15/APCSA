
/**
 * This ArrayStats class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ArrayStats
{
    public static double findMean(int[] a) {
        double result = 0.0;
        for (int i = a.length - 1; i >= 0 ; i--) {
            result += a[i];
        }
        result = result * 1.0 / a.length;
        return result;
    }

    public static int findMedian(int[] a) {
        int result = 0;
        if (a.length % 2 == 1) {
            result = a[(a.length / 2)];
        }
        else if (a.length % 2 == 0) {
            result = (a[(a.length / 2)] + a[(a.length / 2) - 1]) / 2;
        }
        return result;
    }

    public static int findMode(int[] a)
    {
        int index = 0;
        int soFar = 1;
        int count = 1;
        for (int k = 1; k < a.length; k++)
        {
            if (a[k - 1] == a[k])
            {
                count++;
                if (count > soFar)
                {
                    soFar = count;
                    index = k;
                }
            }
            else
            {
                count = 1;
            }
        }
        return a[index];
    }
}
