import java.util.Random;
/**
 * Write a description of class AmountsOwedCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AmountsOwedCommand implements Command
{
    float inp;

    public void execute(CreditScoreBuilder builder)
    {
        builder.buildamounts_owed(inp);
    }
}