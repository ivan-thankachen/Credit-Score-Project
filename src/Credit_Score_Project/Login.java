import java.util.Scanner;
/**
 * Write a description of class Login here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Login
{
    // instance variables - replace the example below with your own
    
    public abstract void loginSystem();
    
    public abstract void storeLoginData(String user, String pass);
    
    public abstract boolean checkLoginData(String user, String pass);
    
    
}