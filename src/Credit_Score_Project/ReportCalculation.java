import java.util.*;
/**
 * Write a description of class ReportCalculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReportCalculation
{
    private static double score = 0; 
    public String getCreditProvider()
    {
        int option;
        String provider = "Not chosen";
        Scanner scan = new Scanner(System.in);
        boolean check = false;
        
        
        while(!check)
        {
            System.out.println("**************************************");
            System.out.println("What is your preferred credit bureau? ");
            System.out.println("1. Experian");
            System.out.println("2. Equifax");
            System.out.println("3. TransUnion");
            System.out.println("**************************************\n\n");
            try
            {
                option = scan.nextInt();
                if(option == 1)
                {
                    provider = "Experian";
                    check = true;
                }
                else if(option == 2)
                {
                    provider = "Equifax";
                    check = true;
                }
                else if(option == 3)
                {
                    provider = "TransUnion";
                    check = true;
                }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Please select from options 1, 2, or 3. ");
                    System.out.println("**************************************\n\n");
                }
                
            }
            catch (Exception e)
            {
                System.out.println("**************************************");
                System.out.println("Please type a numerical value. ");
                System.out.println("**************************************\n\n");
                scan.nextLine();
                check = false;
            }
        }
        return provider;
    
    }
    
    public void setScore(double s)
    {
        score = s;
    }
    
    public double getScore()
    {
        return score;
    }
    
    
    
    public void printReport(String user, String provider, double score)
    {
        System.out.println("**************************************");
        System.out.println("Username: " + user);
        System.out.println("Provider: " + provider);
        System.out.println("Credit Score: " + score);
        if(score >= 300 && score <= 579)
        {
            System.out.println("Evaluation of Credit Score: Poor");
        }
        
        else if(score >= 580 && score <= 669)
        {
            System.out.println("Evaluation of Credit Score: Fair");
        }
        else if(score >= 670 && score <= 739)
        {
            System.out.println("Evaluation of Credit Score: Good");
        }
        else if(score >= 740 && score <= 799)
        {
            System.out.println("Evaluation of Credit Score: Great");
        }
        else
        {
            System.out.println("Evaluation of Credit Score: Exceptional");
        }
        System.out.println("**************************************");
        
    }
}