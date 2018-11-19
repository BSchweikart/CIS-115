/*
 * Brian Schweikart
 * 11-14-2018
 * SchweikartCW114
 * This program will calculate unit prices
*/
package schweikart_cw114;

import java.util.Scanner;
import java.text.NumberFormat;

public class Schweikart_CW114 
{

    public static void main(String[] args) 
    {
        // Declaare variables
        double price1 = 0;
        double price2 = 0;
        double unit1 = 0;
        double unit2 = 0;
        double unitPrice1 = 0;
        double unitPrice2 = 0;
        Scanner k = new Scanner( System.in);
        //
        System.out.print("Enter the price of the fist item: ");
        price1 = k.nextDouble();
        System.out.print("Enter the price of the second item: ");
        price2 = k.nextDouble();
        System.out.print("Enter the # of units: ");
        unit1 = k.nextDouble();
        System.out.print("Enter the # of units: ");
        unit2 = k.nextDouble();
        //
        unitPrice1 = price1 * unit1;
        unitPrice2 = price2 * unit2;
        // create an object to format output
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        // Display the total out.
        System.out.println("Item 1 unit price: " + fmt.format(unitPrice1));
        System.out.println("Item 2 unit price: " + fmt.format(unitPrice2));
    }
    
}
