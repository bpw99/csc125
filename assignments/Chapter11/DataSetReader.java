package Chapter11;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Write a description of class DataSetReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataSetReader 
{
    private double[] data;
    
    public double[] readFile(String filename) throws FileNotFoundException, BadDataException
    {
       File inFile = new File(filename);
       
       try(Scanner scan = new Scanner(inFile))
       {
           readData(scan);
           
           return data;
        }
        
        
        
        
        
    }
    private void readData(Scanner scan) throws BadDataException
    {
        if(!scan.hasNextInt())
        {
            throw new BadDataException("an integer value of length is expected");
        }
        int arrayLength = scan.nextInt();
        data = new double[arrayLength];
        
        for(int i = 0; i < data.length; i++)
        {
            readValue(scan, i);
        }
        if(scan.hasNextInt())
        {
            throw new BadDataException("End of file is expected but more data found");
        }
    }
    private void readValue(Scanner scan, int i) throws BadDataException
    {
            if(!scan.hasNextDouble())
            {
            throw new BadDataException("Double value expected");
            }
            data[i] = scan.nextDouble();
       }
    
    
}