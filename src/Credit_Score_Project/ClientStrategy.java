import java.util.*;
/**
 * Write a description of class LogOutState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClientStrategy implements LoginStrategy
{
    Scanner scan = new Scanner(System.in);
    private String val;
    CreditScoreDirector cd = new CreditScoreDirector();
    CreditScoreBuilder cb = new CreditScoreBuilder();

    public boolean login()
    {
        
        
        
        System.out.println("Hello! Would you like to calculate your credit score? (y/n) ");
        val = scan.nextLine();
        if(val.equals("y"))
        {
            cd.addCommand();
            cd.construct(cb);
            return true;
        }
        
        else
        {
            return true;
        }
        
    }
    public void logout()
    {
        System.out.println("Bye! Have a nice day!");
        
    }
}