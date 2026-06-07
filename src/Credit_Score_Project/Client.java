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
    
    public boolean checkParameters(String u, String p, boolean stat)
    {
        boolean user_length = (u.length() >= 8 && u.length() <= 15);
        boolean pass_length = (p.length() >= 10 && p.length() <= 15);
        boolean colon;
        boolean firstnum;
        boolean paramcheck;
        boolean no_exist;
        
        ParameterContext context = new ParameterContext();
        
        
        
        
        
        
        
        
        if(!user_length && !pass_length)
        {
            if(stat){
                System.out.println("The username doesn't fit the 8 - 15 character requirement.");
                System.out.println("The password doesn't fit the 10 - 15 character requirement.");}
        }
        
        else if(!pass_length)
        {
            if(stat)
                System.out.println("The password doesn't fit the 10 - 15 character requirement.");
        }
        
        else if(!user_length)
        {
            if(stat)
            {
                System.out.println("The username doesn't fit the 8 - 15 character requirement.");
            }
        }
        
        else
        {
            context.set(new ColonState());
            colon = context.check(u,p,stat);
            
            context.set(new FirstCharNumState());
            firstnum = context.check(u,p,stat);
            
            context.set(new AlreadyExistsState());
            no_exist = context.check(u,p,stat);
            
            paramcheck = colon && firstnum && no_exist;
            return user_length && pass_length && paramcheck;
        }
        
        return false;
        
        
        
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
        boolean exit = false;
        LoginContext loginContext = new LoginContext();
        
        while(!exit) {
        
        System.out.println("Welcome! Are you new to the program? (yes/no) \n ");
        val = scan.nextLine();
        if(val.equals("yes"))
        {
            System.out.println("Please enter your username. \n");
            user = scan.nextLine();
            System.out.println("Please enter your password. \n");
            pass = scan.nextLine();
            
            if(checkParameters(user,pass,false))
            {
                storeLoginData(user,pass);
                loginContext.setLoginStrategy(new ClientStrategy());
                exit = loginContext.performLogin();
            }
            
            else
            {
                while(!checkParameters(user,pass,true))
                {
                    System.out.println("Please enter your username.\n");
                    user = scan.nextLine();
                    System.out.println("Please enter your password.\n");
                    pass = scan.nextLine();
                }
                
                if(checkParameters(user,pass,false))
                {
                    storeLoginData(user,pass);
                    loginContext.setLoginStrategy(new ClientStrategy());
                    exit = loginContext.performLogin();
                }
            }
            
        }
        else if (val.equals("no"))
        {
            System.out.println("Please enter a username.\n");
            user = scan.nextLine();
            System.out.println("Please enter a password.\n");
            pass = scan.nextLine();
            check = checkLoginData(user,pass);
            if(check == true)
            {
                loginContext.setLoginStrategy(new ClientStrategy());
                exit = loginContext.performLogin();
            }
            
            else
            {
                loginContext.setLoginStrategy(new ClientStrategy());
                loginContext.performLogout(); 
                exit = true;
            }
        }
        
        else
        {
            exit = true;
        }
        
        
    }
    
    if(exit)
    {
    loginContext.setLoginStrategy(new ClientStrategy());
    loginContext.performLogout();
}   
        
    }
}