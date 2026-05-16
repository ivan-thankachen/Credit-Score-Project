
/**
 * Write a description of class AdminFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdminFactory implements LoginFactory
{
    public Login createLogin()
    {
        return new Admin();
    }
}