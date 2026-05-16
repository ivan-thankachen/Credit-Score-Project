import java.util.ArrayList;
/**
 * Write a description of class CreditScoreDirector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditScoreDirector
{
    private ArrayList<Command> commands = new ArrayList<>();
    public void addComand(Command command)
    {
        commands.add(command);
    }
    public void construct(Builder builder)
    {
        for(Command cmd:commands)
        {
            cmd.execute((CreditScoreBuilder) builder);
        }
    }
}