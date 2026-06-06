
/**
 * Write a description of class ColonState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColonState implements ParameterState
{
   public boolean handlecheck(String u, String p)
   {
       boolean user_colon = u.indexOf(":") == -1;
       boolean pass_colon = u.indexOf(":") == -1;
       if(!user_colon)
       {
           System.out.println("There cannot be any colons in your credentials.");
       }
   }
}