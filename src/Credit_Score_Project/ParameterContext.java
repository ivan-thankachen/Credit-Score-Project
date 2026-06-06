
/**
 * Write a description of class ParameterContext here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ParameterContext
{
    private ParameterState state;
    boolean val;
    
    public void set(ParameterState state)
    {
        this.state = state;
    }
    
    public boolean check(String u, String p)
    {
        val = this.state.handlecheck(u,p);
        return val;
    }
}