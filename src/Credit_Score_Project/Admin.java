import java.util.*;
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Admin extends Login
{
    Scanner scan = new Scanner(System.in);
    LoginContext admin = new LoginContext();
    public void storeLoginData(String u, String p)
    {
        return;
    }
    
    public boolean checkLoginData(String u, String p)
    {
        ProxyFile prox = new ProxyFile();
        return prox.authenticateAdmin(p);
    }
    
    
    public void loginSystem()
    {
        String val;
        boolean exit = false;
        while(!exit) {
        System.out.println("**************************************");
        System.out.println("Welcome back admin! Please type in your designated password!");
        System.out.println("**************************************\n\n");
        val = scan.nextLine();
        boolean successful = checkLoginData(null,val);
        if(successful)
        {
            admin.setLoginStrategy(new AdminStrategy());
            exit = admin.performLogin(null);
            admin.performLogout();
        }
        else
        {
            System.out.println("**************************************");
            System.out.println("Incorrect user password.");
            System.out.println("**************************************\n\n");
            admin.setLoginStrategy(new AdminStrategy());
            admin.performLogout();
            exit = true;
        }
    }
    }
    
}