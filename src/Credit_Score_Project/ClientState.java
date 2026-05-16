
/**
 * Write a description of class LogOutState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClientState implements LoginState
{
    // instance variables - replace the example below with your own

    public void login()
    {
        System.out.println("Hello! Would you like to calculate your credit score?");
    }
    public void logout()
    {
        System.out.println("Bye! Have a nice day!");
        
    }
}