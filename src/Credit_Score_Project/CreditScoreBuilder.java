import java.util.Scanner;
/**
 * Write a description of class CreditScoreBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditScoreBuilder implements Builder
{ 
    Scanner scan = new Scanner(System.in); 
    String val;
    int amt;
    double base = 300.0;// base value
    double max = 800.0;
    double eval_score = base;
    double init_eval = base;
    ReportCalculation set_score = new ReportCalculation();
    
    public void buildpaymentHistory(float input)
    {
        boolean again = false;
        
        while(!again){
            System.out.println("**************************************");
            System.out.println("Do you have any missed payments, bankrupcies, and/or defaults? (y/n) ");
            System.out.println("**************************************\n\n");
            val = scan.nextLine();
        if(val.equals("n"))
        {
            eval_score = (max - base) * 0.35;
            again = true;
        }
        
        else if (val.equals("y"))
        {
            try
            {
                eval_score = (max - base) * 0.35;
                System.out.println("**************************************");
               System.out.println("How many years has it been since any missed payments, bankrupcies, and/or defaults? (less than a year = 1) ");
               System.out.println("**************************************\n\n");
               amt = scan.nextInt(); 
               if(amt > 0)
               {
                   if(amt == 1)
                       eval_score *= 0.95;
                    else if(amt > 1 && amt <= 4)
                    {
                        eval_score *= 0.8;
                    }
                    else
                    {
                        eval_score *= 0.5;
                    }
                   System.out.println("**************************************");
                    System.out.println("How many incurred?\n");
                    System.out.println("**************************************\n\n");
                   amt = scan.nextInt();
                   if(amt > 0)
                   {
                       if(amt > 5)
                       {
                           eval_score *= 0.75;
                       }
                       again = true;
                   }
                    else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than zero. ");
                    System.out.println("**************************************\n\n");
                    scan.nextLine();
                    again = false;
                }
                   
            }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than zero. ");
                    System.out.println("**************************************\n\n");
                    scan.nextLine();
                    again = false;
                }
                
            }
            
            catch(Exception e)
            {
                System.out.println("**************************************");
                System.out.println("Please type in a numerical amount. ");
                System.out.println("**************************************\n\n");
                scan.nextLine();
                again = false;
            }
        
        }
        
        else
        {
            System.out.println("**************************************");
            System.out.println("Try again. ");
            System.out.println("**************************************\n\n");
        }
        
    }

    }
    public void buildamounts_owed(float input)
    {
        boolean again = false;
        init_eval = (max-base) * 0.30;
        while(!again)
        {
            
            try
            { 
                System.out.println("**************************************");
                System.out.println("How much credit is owed? (type without percent) ");
                System.out.println("**************************************\n\n");
                amt = scan.nextInt();
                if(amt == 0)
                {
                   eval_score += init_eval;
                   again = true;
                }
                else if(amt > 0)
                {
                    if (amt <= 30)
                    {
                        init_eval *= 0.9;
                        eval_score += init_eval;
                        again = true;
                    }
                    else if(amt > 30 && amt <= 60)
                    {
                        init_eval *= 0.6;
                        eval_score += init_eval;
                        again = true;
                    }
                    else
                    {
                        init_eval *= 0.2;
                        eval_score += init_eval;
                        again = true;
                    }
                }
                
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than or equal zero. ");
                    System.out.println("**************************************\n\n");
                    again = false;
                }
            }
            
            catch(Exception e)
            {
                System.out.println("**************************************");
                System.out.println("Please type in a numerical amount. ");
                System.out.println("**************************************\n\n");
                scan.nextLine();
                again = false;
            }
    }
    
    }
    public void buildcredit_history(float input)
    {
        boolean again = false;
        init_eval = (max-base) * 0.15;
        try
        {
            while(!again)
            {
                System.out.println("**************************************");
                System.out.println("How long have you had a form of credit? (in years) ");
                System.out.println("**************************************\n\n");
                amt = scan.nextInt();
                if(amt == 0)
                {
                   again = true;
                }
                
                else if (amt > 0)
                {
                    if(amt <= 2)
                    {
                        init_eval *= 0.1;
                        eval_score += init_eval;
                        again = true;
                    }
                    else if(amt > 2 && amt <= 6)
                    {
                        init_eval *= 0.6;
                        eval_score += init_eval;
                        again = true;
                    }
                    else
                    {
                        eval_score += init_eval;
                        again = true;
                    }
                }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than or equal to zero. ");
                    System.out.println("**************************************\n\n");
                    again = false;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("**************************************");
            System.out.println("Please type in a numerical amount. ");
            System.out.println("**************************************\n\n");
            scan.nextLine();
            again = false;
        }
    }
    public void buildcredit_mix(float input)
    {
        boolean again = false;
        init_eval = (max-base) * 0.10;
        try
        {
            while(!again)
            {
                System.out.println("**************************************");
                System.out.println("How many different types of credit do you have? ");
                System.out.println("**************************************\n\n");
                amt = scan.nextInt();
                if(amt == 0)
                {
                    again = true;
                }
                else if(amt == 1)
                {
                    init_eval *= 0.1;
                    eval_score += init_eval;
                    again = true;
                }
                else if (amt == 2)
                {
                    init_eval *= 0.3;
                    eval_score += init_eval;
                    again = true;
                }
                
                else if(amt == 3)
                {
                    init_eval *= 0.6;
                    eval_score += init_eval;
                    again = true;
                }
                else if(amt >= 4)
                {
                    eval_score += init_eval;
                    again = true;
                }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than or equal to zero. ");
                    System.out.println("**************************************\n\n");
                    again = false;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("**************************************");
            System.out.println("Please type in a numerical amount.\n");
            System.out.println("**************************************\n\n");
            scan.nextLine();
            again = false;
        }
    }
    public void buildnewcredit(float input)
    {
        boolean again = false;
        init_eval = (max-base) * 0.10;
        try
        {
            while(!again)
            {
                System.out.println("**************************************");
                System.out.println("How frequently have you opened new credit in the last year? ");
                System.out.println("**************************************\n\n");
                amt = scan.nextInt();
                if(amt == 0)
                {
                    eval_score += init_eval;
                    again = true;
                }
                else if(amt > 0 && amt <= 3)
                {
                    init_eval *= 0.8;
                    eval_score += init_eval;
                    again = true;
                }
                else if (amt >= 4 && amt <= 7)
                {
                    init_eval *= 0.5;
                    eval_score += init_eval;
                    again = true;
                }
                
                else if(amt > 7 && amt <= 9)
                {
                    init_eval *= 0.3;
                    eval_score += init_eval;
                    again = true;
                }
                else if(amt >= 10)
                {
                    init_eval *= 0.1;
                    eval_score += init_eval;
                    again = true;                
                }
                else
                {
                    System.out.println("**************************************");
                    System.out.println("Value has to be greater than or equal to zero. ");
                    System.out.println("**************************************\n\n");
                    again = false;
                }
            }
            
            eval_score += 300;
            set_score.setScore(eval_score);
        }
        catch(Exception e)
        {
            System.out.println("**************************************");
            System.out.println("Please type in a numerical amount. ");
            System.out.println("**************************************\n\n");
            scan.nextLine();
            again = false;
        }
    }
}