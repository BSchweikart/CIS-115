import java.util.Scanner;

public class schweikartcw1203 
{
    public static void main(String[] args)
    {
        displayName();
        int value = getValue();
        displayValue(value);
        System.out.print(value);
        
    }
    
    public static void displayName() 
    {
       System.out.println("Brian Schweikart");
       System.out.println("12-03-18");
       System.out.println("schweikartCW1203");
       System.out.println("This program is spliting grades code into methods");
    }    
     
    
    public static int getValue()
    {
        Scanner keybord = new Scanner(System.in);
        int value = 0;
        System.out.print("Enter a value: ");
        value = keybord.nextInt();
        return value;
    }
    
    public static void displayValue(int x)
    {
        System.out.println(x);
    }
}
