import java.util.Scanner;
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Admin extends Login
{
    public void loginSystem()
    {
        String user;
        String pass;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome back Admin. Please enter your username with special admin passkey.");
        user = scan.nextLine();
        pass = scan.nextLine();
    }
    
}