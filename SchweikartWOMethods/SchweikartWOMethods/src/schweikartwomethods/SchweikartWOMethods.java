/*
 * Brian Schweikart
 * 11-28-2018
 * SchweikartWOMethods
 * This program will ask user for grades
*/
package schweikartwomethods;
import java.util.Scanner;

public class SchweikartWOMethods 
{
    public static void main(String[] args) 
    {
       int num = 0; //used for the users input
       int score = 0;
       int total = 0;
       double avg = 0; //used for the users score avg
       char grade; // used to show the letter grades
       Scanner keybord = new Scanner(System.in); // used for the input
       
       System.out.println("Please enter the amount of scores you wish to avg:");
       num = keybord.nextInt();
       System.out.println("What are your scores?: ");
       for(int i = 0; i < num; i++)
       {
            score = keybord.nextInt();
            total = score + total; 
       }
       
       avg = total / num;
       System.out.println("Your avg for the scores entered is: " + avg);
       
       if (avg >= 90)
        {
            grade = 'A';
        }
        else if (avg >= 80)
        {
            grade = 'B';
        }
        else if (avg >= 70)
        {
            grade = 'C';
        }
        else if (avg >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Your grade is an " + grade );
    }
}
