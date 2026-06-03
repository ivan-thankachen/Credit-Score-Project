import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class RealFile implements FileInterface
{
    private File storage = new File("users.txt");
    private boolean file_loaded = false;
    public RealFile()
    {
        try
        {
            if(storage.exists())
            {
                 file_loaded = true;
            }
            else {
                throw new IOException();
            }
        }
        
        catch (IOException e)
        {
            System.out.println("File isn't loading, consult admin.");
        }
    }
    
    public void writetoFile(String u, String p)
    {
        if(file_loaded)
        {
        try{
        FileWriter writing = new FileWriter(storage.getName());
        writing.write(u + ":" + p);
        writing.close();
    }
    
        catch(IOException e)
        {
            System.out.println("File cannot be written to.");
        }
    }
    
    }
    
    public boolean readFile(String u, String p)
    {
        boolean checked = false;
        if(file_loaded)
        {
            try{
        Scanner scan = new Scanner(storage);
        String attemptedUser;
        String attemptedPass;
        int colon;
        while(scan.hasNextLine())
        {
            String current = scan.nextLine();
            colon = current.indexOf(":");
            attemptedUser = current.substring(0,colon);
            attemptedPass = current.substring(colon+1);
            
            if(attemptedUser.equals(u) && attemptedPass.equals(p))
            {
                checked = true;
                return checked;
            }
            
        }
        
        return checked;
    }
    
    catch(IOException e)
    {
        System.out.println("Cannot read from file.");
    }
    }
    return checked;
    }
    
}