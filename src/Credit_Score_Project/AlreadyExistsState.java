import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/** 
 * Write a description of class AlreadyExists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlreadyExistsState implements ParameterState
{
    public boolean handlecheck(String u, String p, boolean stat)
    {
        try
        {
            BufferedReader buf = new BufferedReader(new FileReader("users.txt"));
            String line;
            String user;
            String pass;
            int colon;
            while((line = buf.readLine()) != null)
            {
                colon = line.indexOf(":");
                if(colon != -1)
                {
                    user = line.substring(0,colon);
                    if(u.equals(user))
                    {
                        if(stat)
                        {
                            System.out.println("**************************************");
                            System.out.println("Username is already taken.");
                            System.out.println("**************************************\n\n");
                        }
                        return false;
                    }
                }
            }
            
            return true;
        }
        
        catch (IOException e)
        {
            System.out.println("**************************************");
            System.out.println("Issue with reading file, contact administrator.");
            System.out.println("**************************************\n\n");
            return false;
        }
    }
}