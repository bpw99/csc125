package Chapter12;


/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
   private String description;
   private double price;
 public Product(String descIN, double priceIN)
 {
     price = priceIN;
     description = descIN;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getPrice()
    {
        return price;
    }
    
   
}