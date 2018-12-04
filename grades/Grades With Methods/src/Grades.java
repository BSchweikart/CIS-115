import java.util.Scanner;

public class Grades 
{
    
    
    public static void main(String[] args) 
    {
       double avg = userInput();
       System.out.println("Your avg for the scores entered is: " + avg);
    }
    
    public static double userInput()
    {
       Scanner keybord = new Scanner(System.in); // used for the input
       int num = 0;
       int score = 0;
       int total = 0;
       double avg = 0; //used for the users score avg
       System.out.println("Please enter the amount of scores you wish to avg:");
       num = keybord.nextInt();
       System.out.println("What are your scores?: ");
       for(int i = 0; i < num; i++)
       {
            score = keybord.nextInt();
            total = score + total; 
       }
       avg = total / num;
       return avg;
    }
    
    public static void grade()
    {
        
    }
}
