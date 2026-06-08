
/**
 * Write a description of interface LoginState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface LoginStrategy
{
    public boolean login(String user);
    public void logout();
}