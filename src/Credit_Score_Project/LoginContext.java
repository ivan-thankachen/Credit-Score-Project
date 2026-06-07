
/**
 * Write a description of class LoginContext here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoginContext
{
    private LoginStrategy loginStrategy;
    
    public void setLoginStrategy(LoginStrategy lc)
    {
        this.loginStrategy = lc;
    }
    
    public boolean performLogin()
    {
        return loginStrategy.login();
    }
    
    public void performLogout()
    {
        loginStrategy.logout();
    }
}