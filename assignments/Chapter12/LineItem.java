package Chapter12;


/**
 * Write a description of class LineItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LineItem
{
   private int quantity;
   private Product theProduct;
   
   
   public LineItem(Product productIN, int quantIN)
   {
       quantity = quantIN;
       theProduct = productIN;
    }
    
    public double getTotalPrice()
    {
        return theProduct.getPrice() * quantity;
    }
    public String format()
    {
        
        return String.format("%-30s%8.2f%5d%6.2f", theProduct.getDescription(), 
        theProduct.getPrice(), quantity, getTotalPrice());
    }
        
}