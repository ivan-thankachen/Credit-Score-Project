
/**
 * Write a description of class User here.
 *
 * Ivan Thankachen 
 * User Class
 */

import java.util.Scanner;
public class User
{
    /*
    private static String choose_credit()
    {
        int selection = 0;
        String val = "exit";
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
            else
            {
                switch(selection)
                {
                    case 1:
                        val = "Equifax";
                        break;
                    case 2:
                        val = "Experian";
                        break;
                    case 3:
                        val = "TransUnion";
                        break;
    
                }
                break;
            }
            }
            
            
        
            
            
            
            
        
            return val;
        
    }
    */
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String use;
        boolean exit = false;
        System.out.println("Welcome to the Credit Score Program! Are you an admin or a user?");
        use = scan.nextLine();
        if(use.equals("admin") || use.equals("Admin"))
        {
            AdminFactory adFac = new AdminFactory();
            Login ad = adFac.createLogin();
            ad.loginSystem();
        }
        
        else if(use.equals("client") || use.equals("Client"))
        {
            ClientFactory clFac = new ClientFactory();
            Login cl = clFac.createLogin();
            cl.loginSystem();
        }
        
        else
        {
            System.out.println("Please try again.");
        }
        
    }
}