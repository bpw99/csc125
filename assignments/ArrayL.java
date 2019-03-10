import java.util.*;
/**
 * Finds max in arrayList.
 *
 * @Bret Wilson
 * @10/29/18
 */
public class ArrayL
{
    public static void main(String[] args)
    {
       ArrayList<Double> values = new ArrayList<Double>();
       System.out.println("Enter values or Q to quit");
       Scanner scan = new Scanner(System.in);
       
       while(scan.hasNextDouble())
       {
           values.add(scan.nextDouble());
        }
        double max = values.get(0);
        for(int i = 0; i < values.size(); i++)
        {
            if(values.get(i) > max)
            {
                max = values.get(i);
            }
        }
        System.out.println(values);
        System.out.println("The max number in the array is: " + max);
        
        
    }
    
    
}