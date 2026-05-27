import java.util.Scanner;
/**
 * Write a description of class CreditScoreBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditScoreBuilder implements Builder
{
    private Credit_Score credit = new Credit_Score(); 
    Scanner scan = new Scanner(System.in); 
    String val;
    double base = 300.0;// base value
    double max = 800.0;
    double eval_score;
    
    public void buildpaymentHistory(float input)
    {
        System.out.println("Do you have any missed payments, bankrupcies, and/or defaults? (y/n)");
        val = scan.nextLine();
        if(val.equals("n"))
        {
            eval_score = (max - base) * 0.30;
            
        }
        
        else if (val.equals("y"))
        {
            if(eval_score != base && (eval_score - 80.0 < 300))
            {
                eval_score -= 80.0;
            }
            
            else
            {
                eval_score = base; 
            }
            
            
        }
        
        else
        {
            System.out.println("Try again.");
        }
        
        

    }
    public void buildamounts_owed(float input)
    {
        System.out.println("How much is owed?");
    
    }
    public void buildcredit_history(float input)
    {
        System.out.println("How much is the history?");
        
    }
    public void buildcredit_mix(float input)
    {
        System.out.println("How much is the mix?");
    }
    public void buildnewcredit(float input)
    {
        System.out.println("How much is the credit?");
    }
}