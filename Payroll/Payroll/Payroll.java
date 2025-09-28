
/**
 * This Payroll class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */

import java.util.Scanner;

public class Payroll
{
    public static void main(String [] args)
    {
       Scanner keyboard = new Scanner(System.in); 
        
       int hourlyWage;
       int regularHours;
       int overtimeHours;
       
       System.out.println("This program calculates weekly gross pay.");
       System.out.print("Enter the hourly wage: ");
       hourlyWage = keyboard.nextInt();
       
       System.out.print("Enter the number of regular hours worked: ");
       regularHours = keyboard.nextInt();
       
       System.out.print("Enter the number of overtime hours worked: ");
       overtimeHours = keyboard.nextInt();
       
       double overtimePay = hourlyWage * 1.5 * overtimeHours;
       double totalPay = overtimePay + hourlyWage * regularHours; 
       System.out.println("Total pay = $" + totalPay);
      
       
       
    }
}
