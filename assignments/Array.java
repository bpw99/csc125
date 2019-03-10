
/**
 * Creates an array of ints and finds the max
 *
 * @Bret Wilson
 * @10/25/18
 */
import java.util.Scanner;
public class Array
{
   public static void main(String[] args)
   {
       int max = Integer.MIN_VALUE; 
       String Q = "";
       Scanner scan = new Scanner(System.in);
       
       int array[] = new int[500];
       
       for(int i = 0; i < array.length; ++i)
       {
           System.out.println("Enter a number: ");
           array[i] = scan.nextInt();
           
           System.out.println("If you want to stop enter Q, if not, enter 0");
           Q = scan.next();
           if(array[i] > max)
           {
               max = array[i];
           }
             if(Q.equals("Q"))
           {
                System.out.println("The max value in the array is: " + max);
                break;
              
           }
           
         
          
              
        }
        
       
    }
    
    
    
    
}

       
       
       