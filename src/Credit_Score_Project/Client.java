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
    
    public boolean checkParameters(String u, String p)
    {
        boolean user_length = (u.length() >= 8 && u.length() <= 15);
        boolean pass_length = (p.length() >= 10 && p.length() <= 15);
        boolean colon;
        boolean firstnum;
        boolean paramcheck;
        
        ParameterContext context = new ParameterContext();
        context.set(new ColonState());
        
        
        context.set(new FirstCharNumState());
        
        
        
        
        if(!user_length)
        {
            System.out.println("The username doesn't fit the 8 - 15 character requirement.");
        }
        
        else if(!pass_length)
        {
            System.out.println("The username doesn't fit the 10 - 15 character requirement.");
        }
        
        else if(!user_length && !pass_length)
        {
            System.out.println("The username doesn't fit the 8 - 15 character requirement.");
            System.out.println("The password doesn't fit the 10 - 15 character requirement.");
        }
        
        else
        {
            colon = context.check(u,p);
            firstnum = context.check(u,p);
            paramcheck = colon && firstnum;
        }
        
        return user_length && pass_length && paramcheck;
        
        
        
    }
    
    public void loginSystem()
    {
        String user;
        String pass;
        String val;
        Scanner scan = new Scanner(System.in);
        boolean check;
        boolean log;
        boolean param;
        LoginContext loginContext = new LoginContext();
        
        System.out.println("Welcome! Are you new to the program? (yes/no) ");
        val = scan.nextLine();
        if(val.equals("yes"))
        {
            System.out.println("Please enter your username.");
            user = scan.nextLine();
            System.out.println("Please enter your password.");
            pass = scan.nextLine();
            
            if(checkParameters(user,pass))
            {
                storeLoginData(user,pass);
                loginContext.setLoginStrategy(new ClientStrategy());
                loginContext.performLogin();
            }
            
            else
            {
                param = checkParameters(user,pass);
                while(!param)
                {
                    System.out.println("Please enter your username.");
                    user = scan.nextLine();
                    System.out.println("Please enter your password.");
                    pass = scan.nextLine();
                    param = checkParameters(user,pass);
                }
                
                if(checkParameters(user,pass))
                {
                    storeLoginData(user,pass);
                    loginContext.setLoginStrategy(new ClientStrategy());
                    loginContext.performLogin();
                }
            }
            
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
                loginContext.setLoginStrategy(new ClientStrategy());
                loginContext.performLogin();
            }
            
            else
            {
                loginContext.setLoginStrategy(new ClientStrategy());
                loginContext.performLogout();            
            }
        }
        
        
        
        
    }
}