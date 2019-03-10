import java.util.Scanner;
/**
 * Calculates Curfew 
 *
 * @Bret Wilson
 * @10/11/2018
 */
public class CurfewCalc
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int age = scan.nextInt();
      if(age <= 13 && age >= 0)
      {
          System.out.println("You are only " + age + " years old so you are too young to go to the party");
        }
        
        
        else if(age < 17 && age > 13)
        {
            System.out.println("Your curfew is 10:00 PM since you are " + age + " years old");
        }
        else if(age > 16)
        {
            System.out.println("Your curfew is midnight since you are " + age + " years old");
        }
        else
        {
            System.out.println("Please enter a valid age");
        }

   }



} 