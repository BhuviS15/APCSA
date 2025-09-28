
/**
 * This TemperatureConversion class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */

import java.util.Scanner;

public class TemperatureConversion
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double farenheit;
        double celsius;
        
        System.out.print("Enter degrees Farneheit: ");
        farenheit = keyboard.nextDouble();
        
        celsius = (farenheit - 32.0) * 5.0 / 9.0;
        
        System.out.print("The equivalent in Celsius is ");
        System.out.println(celsius);
    }
    
}
