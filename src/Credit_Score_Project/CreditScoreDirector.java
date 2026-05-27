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
    CreditMixCommand c1 = new CreditMixCommand();
    AmountsOwedCommand c2 = new AmountsOwedCommand();
    CreditHistoryCommand c3 = new CreditHistoryCommand();
    NewCreditCommand c4 = new NewCreditCommand();
    PaymentHistoryCommand c5 = new PaymentHistoryCommand();
    public void addCommand()
    {
        commands.add(c1);
        commands.add(c2);
        commands.add(c3);
        commands.add(c4);
        commands.add(c5);
    }
    public void construct(Builder builder)
    {
        for(Command cmd:commands)
        {
            cmd.execute((CreditScoreBuilder) builder);
        }
    }
}