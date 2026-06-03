import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class RealFile implements FileInterface
{
    private File storage = new File("users.txt");
    public RealFile()
    {
        try
        {
            if(storage.exists())
            {
                this.storage = storage;
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