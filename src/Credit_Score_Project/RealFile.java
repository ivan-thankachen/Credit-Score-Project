import java.io.*;
import java.util.*;
public class RealFile implements FileInterface
{
    String path = System.getProperty("user.dir");
    private File storage = new File(path + "\\users.txt");
    private File admin_file = new File(path + "\\credit_admin.txt");
    private File score_file = new File(path + "\\user_scores.txt");
    private boolean file_loaded = false;
    public RealFile()
    {
        if(!storage.exists() && !score_file.exists())
        {
            try
            {
                storage.createNewFile();
                score_file.createNewFile();
                file_loaded = true;
            }
            catch (IOException e)
            {
                System.out.println("**************************************");
                System.out.println("Files can't be created.");
                System.out.println("**************************************\n\n");
            }
        }
        else
        {
            if(storage.exists())
            {
                file_loaded = true;
            }
        }
    }
    
    public void writetoFile(String u, String p)
    {
        if(file_loaded)
        {
        try{
        FileWriter writing = new FileWriter(storage.getName(),true);
        writing.write(u + ":" + p + "\n");
        writing.close();
    }

    
        catch(IOException e)
        {
            System.out.println("**************************************");
            System.out.println("File cannot be written to.");
            System.out.println("**************************************\n\n");
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
            if(colon != -1)
            {
                attemptedUser = current.substring(0,colon);
                attemptedPass = current.substring(colon+1);
                
                if(attemptedUser.equals(u) && attemptedPass.equals(p))
                {
                    checked = true;
                    return checked;
                }
            }
            
        }
        
        return checked;
    }
    
    catch(IOException e)
    {
        System.out.println("**************************************");
        System.out.println("Cannot read from file.");
        System.out.println("**************************************\n\n");
    }
    }
    return checked;
    }
    
    public boolean authenticateAdmin(String pass)
    {
        try
        {
            Scanner scan = new Scanner(admin_file);
            while(scan.hasNextLine())
            {
                String current = scan.nextLine();
                if(pass.equals(current))
                {
                    return true;
                }
            }
            return false;
            
        }
        catch(IOException e)
        {
            System.out.println("**************************************");
            System.out.println("File cannot be accessed.");
            System.out.println("**************************************\n\n");
            return false;
        }
    }
    
    public void writeScoreFile(String user, double score)
    {
        try
        {
            FileWriter writing; 
            
            if(!userInFile(user))
            {
                writing = new FileWriter(score_file.getName(),true);
                writing.write(user + ":" + score + "\n");
            }
            else
            {
                BufferedReader read = new BufferedReader(new FileReader(score_file.getName()));
                
                String line;
                ArrayList<String> lines = new ArrayList<String>();
                while((line = read.readLine()) != null)
                {
                    if(!line.isEmpty() && line.substring(0,line.indexOf(":")).equals(user))
                    {
                        lines.add(user + ":" + score + "\n");
                    }
                    else
                    {
                        lines.add(line + "\n");
                    }
                    
                }
                
                writing = new FileWriter(score_file.getName());
                
                for(String u : lines)
                {
                    writing.write(u);
                }
            }
            writing.close();
        }
        catch(IOException e)
        {
            System.out.println("**************************************");
            System.out.println("File cannot be written to.");
            System.out.println("**************************************\n\n");
        }
    }
    
    public void readScoreFile()
    {
        try
        {
            Scanner scan = new Scanner(score_file);
            int colon;
            double score;
            int poor = 0;
            int fair = 0;
            int good = 0;
            int great = 0;
            int exceptional = 0;
            while(scan.hasNextLine())
            {
                String current = scan.nextLine();
                colon = current.indexOf(":");
                String score2 = current.substring(colon + 1);
                score = Double.parseDouble(score2);
                if(score >= 300 && score <= 579)
                {
                    poor++;
                }
                
                else if(score >= 580 && score <= 669)
                {
                    fair++;
                }
                else if(score >= 670 && score <= 739)
                {
                    good++;
                }
                else if(score >= 740 && score <= 799)
                {
                    great++;
                }
                else
                {
                    exceptional++;
                }
                
            }
            
            System.out.println("**************************************");
            System.out.println("Total Number in Each Category:");
            System.out.println("Poor: " + poor);
            System.out.println("Fair: " +fair);
            System.out.println("Good: " + good);
            System.out.println("Great: " + great);
            System.out.println("Exceptional: " + exceptional);
            System.out.println("**************************************\n\n");
            
            
        }
        
        catch(IOException e)
        {
            System.out.println("Cannot read file.");
        }
        
    }
    
    public void sortFile()
    {
        try
        {
            BufferedReader read = new BufferedReader(new FileReader(storage.getName()));
            String line;
            ArrayList<String> lines = new ArrayList<String>();
            while((line = read.readLine()) != null)
            {
                lines.add(line.substring(0,line.indexOf(":")));
            }
            Collections.sort(lines);
            System.out.println("**************************************");
            for(String user : lines)
            {
                System.out.println("User: " + user);
            }
            System.out.println("**************************************\n\n");
        }
        catch(IOException e)
        {
            System.out.println("**************************************");
            System.out.println("Can't read from file.");
            System.out.println("**************************************\n\n");
        }
    }
    
    private boolean userInFile(String user)
    {
        try
        {
            Scanner scan = new Scanner(score_file);
            String current;
            String curr_user;
            int colon;
            while (scan.hasNextLine())
            {
                current = scan.nextLine();
                colon = current.indexOf(":");
                curr_user = current.substring(0,colon);
                if(curr_user.equals(user))
                {
                    return true;
                }
                
            }
            return false;
        }
        
        catch(IOException e)
        {
            System.out.println("**************************************");
            System.out.println("Can't read from file.");
            System.out.println("**************************************\n\n");
            return false;
        }
    }
    
    
    
}