import java.lang.*;
/**
 * Write a description of class FirstCharNumState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstCharNumState implements ParameterState
{
   public boolean handlecheck(String u,String p, boolean stat)
   {
       boolean num = Character.isDigit(u.charAt(0));
       
       if(num && stat)
       {
           System.out.println("**************************************");
           System.out.println("You cannot have a number as the first character of your username.");
           System.out.println("**************************************\n\n");
           
       }
       
       return !num;
       
   }
}