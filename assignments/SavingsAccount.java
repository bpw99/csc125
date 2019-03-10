
/**
 * Savings account methods
 *
 * @Bret Wilson
 * @10/3/2018
 */
public class SavingsAccount
{
    private double balance;
    private double interest;
    
    
    public SavingsAccount(double balanceIN)
    {
        balance = balanceIN;
    }
    public void addInterest(double interestIN)
    {
        interest = interestIN;
        balance += balance * interest;
        
        
    }
}