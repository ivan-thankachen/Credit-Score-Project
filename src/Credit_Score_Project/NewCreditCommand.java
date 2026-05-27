import java.util.Random;
/**
 * Write a description of class NewCreditCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewCreditCommand implements Command
{
    float inp;
    public void execute(CreditScoreBuilder builder)
    {
        builder.buildnewcredit(inp);
    }
}