package Chapter12;

import java.util.*;
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private Address billingAddress;
    private ArrayList<LineItem> items;
    public Invoice(Address addressIN)
    {
        billingAddress = addressIN;
        items = new ArrayList<LineItem>();
    }
    public double getAmountDue()
    {
        double amountDue = 0;
        for(LineItem item : items)
        {
            amountDue = amountDue + item.getTotalPrice();
        }
        return amountDue;
    }
    public void add(Product productIN, int quantity)
    {
        LineItem anItem = new LineItem(productIN, quantity);
        items.add(anItem);
    }
    
    public String format()
    {
        String r = "   INVOICE\n\n" + billingAddress.format() + String.format("\n\n","Description", "Price","Qty","Total");
        for(LineItem item: items)
        {
            r = r +item.format() + "\n";
        }
        r = r + String.format("\nAmount Due: ", getAmountDue());
        return r;
    }
    
    
    
    
    
    
    
}