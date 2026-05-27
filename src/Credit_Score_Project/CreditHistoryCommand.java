import java.util.Random;
/**
 * Write a description of class CreditHistoryCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditHistoryCommand implements Command
{
    float inp;
    public void execute(CreditScoreBuilder builder)
    {
        builder.buildcredit_history(inp);
    }
}