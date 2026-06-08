import java.util.*;
/**
 * Write a description of class AdminState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdminStrategy implements LoginStrategy
{
    
    public boolean login(String user)
    {
        boolean exit = false;
        int option;
        Scanner scan = new Scanner(System.in);
        ProxyFile prox = new ProxyFile();
        while(!exit)
        {
            try
            {
                System.out.println("**************************************");
                System.out.println("Welcome back! What permissions would you like to access?");
                System.out.println("**************************************\n\n");
                System.out.println("**************************************");
                System.out.println("1. Show all users.");
                System.out.println("2. Show how many users in each credit category.");
                System.out.println("3. Exit.");
                System.out.println("**************************************\n\n");
                option = scan.nextInt();
                System.out.println(option);
                scan.nextLine();
                if(option > 0 && option < 4)
                {
                    if (option == 1)
                    {
                        prox.sortFile();
            
                    }
                    
                    if(option == 2)
                    {
                        prox.readScoreFile();
                    }
                    
                    if(option == 3)
                    {
                        exit = true;
                        return exit;
                    }
                }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Choose from the option numbers listed.");
                    System.out.println("**************************************\n\n");
                }
        
        
        
        }
        catch(Exception e)
        {
            System.out.println("**************************************");
            System.out.println("Type a numerical value.");
            System.out.println("**************************************\n\n");
            scan.nextLine();
        }
    }
    
    
    return true;
    }
    public void logout()
    {
        System.out.println("Bye! Have a nice day!");
        
    }
    
}