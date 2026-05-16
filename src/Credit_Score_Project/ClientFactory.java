
/**
 * Write a description of class ClientFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClientFactory implements LoginFactory
{
    // instance variables - replace the example below with your own
    public Login createLogin()
    {
        return new Client();
    }
}