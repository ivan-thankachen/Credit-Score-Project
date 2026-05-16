
/**
 * Write a description of class AdminState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdminState implements LoginState
{
    // instance variables - replace the example below with your own
    public void login()
    {
        System.out.println("Welcome back! What permissions would you like to access?");
    }
    public void logout()
    {
        System.out.println("Bye! Have a nice day!");
        
    }
}