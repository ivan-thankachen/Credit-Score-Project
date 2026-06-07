
/**
 * Write a description of class ColonState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColonState implements ParameterState
{
   public boolean handlecheck(String u, String p, boolean stat)
   {
       boolean is_colon = (u.indexOf(":") == -1 && p.indexOf(":") == -1);
       if(!is_colon && stat)
       {
           System.out.println("There cannot be any colons in your credentials.");
       }
       
       return is_colon;
   }
}