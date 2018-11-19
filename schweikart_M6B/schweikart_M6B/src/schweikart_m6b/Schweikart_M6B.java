/*
 * Brian Schweikart
 * 11-14-2018
 * Schweikart_M6B
 * This will allow the user to enter rate of pay and hours worked
 * then the program will find the users gross pay.
*/

package schweikart_m6b;

import java.util.Scanner;
import java.text.NumberFormat;

public class Schweikart_M6B 
{
    public static void main(String[] args) 
    {
        // Declare Var
        double ratePay = 0;
        double hoursWorked = 0;
        double grossPay = 0;
        //Set scanner for input
        Scanner keybord = new Scanner(System.in);
        //Set format for $
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        //Get input
        System.out.println("To find your gross pay please Enter Pay Rate and Hours Worked");
        System.out.print("What is your Rate of Pay? ");
        ratePay = keybord.nextDouble();
        System.out.println("Your Rate of Pay was entered at " + dollar.format(ratePay));
        System.out.print("How many hours did you work? ");
        hoursWorked = keybord.nextDouble();
        System.out.println("Your hours worked was entered at " + hoursWorked);
        //Calculate the gross pay
        grossPay = ratePay * hoursWorked;
        // Dispaly the gross pay 
        System.out.println("Your total gross pay is: " + dollar.format(grossPay));
                
    }
    
}
