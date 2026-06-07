
/**
 * Write a description of class User here.
 *
 * Ivan Thankachen 
 * User Class
 */

import java.util.Scanner;
public class User
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String use;
        boolean exit = false;
        System.out.println("Welcome to the Credit Score Program! Are you an admin or a client?");
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