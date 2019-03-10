
/**
 * Runner for SavingsAccount
 *
 * @Bret Wilson
 * @9/27/18
 */
public class SavingsRunner
{
    public static void main(String[] args)
    {
        SavingsAccount bretsAccount = new SavingsAccount(1000, 0.10);
        bretsAccount.addInterest();
        System.out.println("My new balance is " + bretsAccount.getbalance());
        
        
    }
    
    
}
        
        
    // instance variables - replace the example below with your own
    