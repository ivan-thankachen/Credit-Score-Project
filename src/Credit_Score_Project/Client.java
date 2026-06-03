import java.util.*;
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client extends Login
{
    
    public void storeLoginData(String u, String p)
    {
        ProxyFile f = new ProxyFile();
        f.writetoFile(u,p);
    }
    
    public boolean checkLoginData(String u, String p)
    {
        ProxyFile f = new ProxyFile();
        return f.readFile(u,p);
        
    }
    
    public void loginSystem()
    {
        String user;
        String pass;
        String val;
        Scanner scan = new Scanner(System.in);
        boolean check;
        boolean log;
        
        System.out.println("Welcome! Are you new to the program? (yes/no) ");
        val = scan.nextLine();
        if(val.equals("yes"))
        {
            System.out.println("Please enter your username.");
            user = scan.nextLine();
            System.out.println("Please enter your password.");
            pass = scan.nextLine();
            storeLoginData(user,pass);
            ClientState cs = new ClientState();
            cs.login();
        }
        else
        {
            System.out.println("Please enter a username.");
            user = scan.nextLine();
            System.out.println("Please enter a password.");
            pass = scan.nextLine();
            check = checkLoginData(user,pass);
            if(check == true)
            {
                ClientState cs = new ClientState();
                cs.login(); 
            }
            
            else
            {
                ClientState cs = new ClientState();
                cs.logout(); 
            }
        }
        
        
        
        
    }
}