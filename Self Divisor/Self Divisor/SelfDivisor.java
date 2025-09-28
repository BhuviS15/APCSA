
/**
 * This SelfDivisor class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class SelfDivisor
{
    /** @param number the number to be tested
     * Precondition: number > 0
     * @return true if every decimal digit of number is
     * a divisor of number, false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int temp = number; 
        while (temp > 0) { 
            int digit = temp % 10; 
            if (digit == 0 || number % digit != 0) { 
                return false; 
            } 
            temp /= 10; 
        } 
        return true;
    }

    /** @param start starting point for values to be checked
     * Precondition: start > 0
     * @param num the size of the array to be returned
     * Precondition: num > 0
     * @return an array containing the first num
     * integers >= start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)

    {
        int[] selfDivisors = new int[num]; 
        int count = 0; 
        while (count < num) { 
            if (isSelfDivisor(start)) { 
                selfDivisors[count] = start; 
                count++; 
            } 
            start++; 
        } 
        return selfDivisors;
    }
}
