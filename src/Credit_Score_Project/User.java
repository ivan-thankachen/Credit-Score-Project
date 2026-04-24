
/**
 * Write a description of class User here.
 *
 * Ivan Thankachen 
 * User Class
 */

import java.util.Scanner;
public class User
{
    private static String choose_credit()
    {
        int selection = 0;
        String val = "temp";
        Scanner scan = new Scanner(System.in);
        
        while(selection != 4)
        {
            System.out.print("Please select the credit score receiver used.\n" + 
        "1) Equifax\n" + "2) Experian\n" + "3) TransUnion\n" + "4) Exit");
        
        selection = scan.nextInt();
        
        if (selection < 1 || selection > 4)
        {
            System.out.print("Try again.");
        }
        }
        
    
        
        
        
        
    
        return val;
        
    }
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        String choice;
        choice = choose_credit();
        
        
        
        
    }
}