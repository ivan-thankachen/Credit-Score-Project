import java.util.*;
/**
 * Write a description of class ReportCalculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReportCalculation
{
    public String getCreditReceiver()
    {
        int option = 0;
        String provider = null;
        Scanner scan = new Scanner(System.in);
        boolean bound = false;

        System.out.println("What is your preferred credit bureau? \n");
        System.out.println("1. Experian");
        System.out.println("2. Equifax");
        System.out.println("3. TransUnion");
        option = scan.nextInt();
        return provider;
    
    }
    public void printReport()
    {
        System.out.println("**************************************");
    }
}