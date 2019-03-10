import java.util.Scanner;
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This is a calculator, enter your first number: ");
        double number = scan.nextDouble();
        System.out.println("Enter a sign such as * + or - ");
        String ch = scan.next();
        if(ch.equals("*") || ch.equals("-") || ch.equals("+"))
        {
            
        System.out.println("Enter a second number: ");
        double number2 = scan.nextDouble();
    }
        if(ch.equals("*"))
        {
            System.out.println(number * number);
        }
        if(ch.equals("+"))
        {
           System.out.println(number + number); 
            
        }
        if(ch.equals("-"))
        {
            System.out.println(number-number);
        }
        
        
    }
    
        
        
    }
    
    
