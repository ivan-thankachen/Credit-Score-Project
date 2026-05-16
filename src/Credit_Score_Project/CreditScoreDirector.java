
/**
 * Write a description of class CreditScoreDirector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditScoreDirector
{
    // instance variables - replace the example below with your own
    public void construct(Builder builder)
    {
        builder.buildpaymentHistory();
        builder.buildamounts_owed();
        builder.buildcredit_history();
        builder.buildcredit_mix();
        builder.buildnewcredit();
    }
}