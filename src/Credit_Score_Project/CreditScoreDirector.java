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
    ReportCalculation display = new ReportCalculation();
    ProxyFile prox = new ProxyFile();
    String prov;
    double score;
    public void addCommand()
    {
        commands.add(c5);
        commands.add(c2);
        commands.add(c3);
        commands.add(c1);
        commands.add(c4);
    }
    public void construct(Builder builder,String user)
    {
        for(Command cmd:commands)
        {
            cmd.execute((CreditScoreBuilder) builder);
        }
        prov = display.getCreditProvider();
        score = display.getScore();
        prox.writeScoreFile(user,score);
        display.printReport(user,prov,score);
    }
}