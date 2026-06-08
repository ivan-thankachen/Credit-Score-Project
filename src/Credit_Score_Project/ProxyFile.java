
/**
 * Write a description of class ProxyFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProxyFile implements FileInterface
{
    private RealFile realFile;
    
    public ProxyFile()
    {
        realFile = new RealFile();
        
    }
    
    public void writetoFile(String u, String p)
    {
        realFile.writetoFile(u,p);
    }
    
    public boolean readFile(String u, String p)
    {
        boolean clientcheck = realFile.readFile(u,p);
        return clientcheck;
    }
    
    public boolean authenticateAdmin(String pass)
    {
        boolean admincheck = realFile.authenticateAdmin(pass);
        return admincheck;
    }
    public void writeScoreFile(String user, double score)
    {
        realFile.writeScoreFile(user,score);
    }
    
    public void readScoreFile()
    {
        realFile.readScoreFile();
    }
    
    public void sortFile()
    {
        realFile.sortFile();
    }
    
}