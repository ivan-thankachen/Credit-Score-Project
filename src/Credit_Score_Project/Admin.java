import java.util.*;
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Admin extends Login
{
    private Map<String,String> users = new HashMap<>();
    
    public void storeLoginData(String u, String p)
    {
        return;
    }
    
    public boolean checkLoginData(String u, String p)
    {
        boolean authenticate = false;
        if(users.containsValue(u) == false && users.containsValue(p) == false)
        {
            return authenticate;
        }
        
        else
        {
            authenticate = true;
            return authenticate;
        }
    }
    
    
    public void loginSystem()
    {
        String user;
        String pass;
        boolean check;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome back Admin. Please enter your username with special admin passkey.");
        user = scan.nextLine();
        pass = scan.nextLine();
        check = checkLoginData(user,pass);
        if(check == true)
        {
            AdminState as = new AdminState();
            as.login();
        }
        else
        {
            AdminState as = new AdminState();
            as.logout();
        }
    }
    
}