package Chapter12;


/**
 * Write a description of class InvoicePrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvoicePrinter
{
    public static void main(String[] args)
    {
        Address myAddress = new Address("Company A", "100 Main St", "Rogers", "MN", "55374");
        Invoice myInvoice = new Invoice(myAddress);
        myInvoice.add(new Product("Xbox one X", 399.99), 1);
        myInvoice.add(new Product("PS4", 200.00), 1);
        
        System.out.println(myInvoice.format());
        
        
        
        
        
        
        
    }
    
}