import java.util.Random;
/**
 * Write a description of class CreditMixCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditMixCommand implements Command
{
    float inp;
    public void execute(CreditScoreBuilder builder)
    {
        builder.buildcredit_mix(inp);
    }
}