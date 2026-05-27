import java.util.Random;
/**
 * Write a description of class PaymentHistoryCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaymentHistoryCommand implements Command
{
    float inp;
    public void execute(CreditScoreBuilder builder)
    {
        builder.buildpaymentHistory(inp);
    }
    
}