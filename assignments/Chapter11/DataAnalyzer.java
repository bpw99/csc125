package Chapter11;

import java.util.*;
import java.io.*;
/**
 * Write a description of class DataAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataAnalyzer
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        DataSetReader reader = new DataSetReader();
        
        boolean done = false;
        
        while(!done)
        {
            try
            {
                System.out.println("Please enter the file name");
                String filename = scan.next();
                double[] data = reader.readFile(filename);
                double sum = 0;
                for(double d: data)
                {
                    sum = sum + d;
                }
                
                System.out.println("The sum is " + sum);
                done = true;
                
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
            catch (BadDataException e)
            {
                System.out.println("Bad data " + e.getMessage());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    
                
        
        
        
        
        
    
    
}