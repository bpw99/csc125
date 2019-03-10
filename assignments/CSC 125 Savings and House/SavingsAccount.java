
/**
 * SavingsAccount Class methods
 *
 * @Bret Wilson
 * @9/27/2018
 */
public class SavingsAccount
{
    private double interest;
    private double balance;
    
    // instance variables - replace the example below with your own
   public SavingsAccount(double balanceIN, double interestIN)
   {
       balance = balanceIN; 
       interest = interestIN;
   
   }
   
   public void addInterest()
   {
      balance += balance * interest; 
       
       
   }
   public double getbalance()
   {
       return balance;
   }
    
}