import java.util.*;
/**
 * Write a description of class QuestionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionTester
{
    public static void main(String[] args)
    {
        int count = 0;
        int count2 = 0;
        Scanner scan = new Scanner(System.in);
        Question q = new Question();
        q.addText("Name the Capital of Minnesota: \n (A) New York, (B) Minneapolis, (C) Iowa, (D) St. Paul");
        q.display();
        q.addAnswer("D");
        
        String ans = scan.nextLine();
    
        if(ans.equalsIgnoreCase(q.getAnswer()))
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println("False");
        }
        count2++;
        
        
        Question q2 = new Question();
        q2.addText("What is the square root of 144? \n (A) 11, (B) 12, (C) 13, (D) 14");
        q2.display();
        q2.addAnswer("B");       
        String ans2 = scan.nextLine();
        
        if(ans2.equalsIgnoreCase(q2.getAnswer()))
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println("False");
        }
        count2++;
        
        Question q3 = new Question();
        q3.addText("Who is our current president? \n (A) Kanye West, (B) Barrack Obama, (C) Donald Trump, (D) Kim Kardashian");
        q3.display();
        q3.addAnswer("C");
        String ans3 = scan.nextLine();
        
        if(ans3.equalsIgnoreCase(q3.getAnswer()))
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println("False");
        }
        count2++;
        System.out.println("You scored " + count + " out of " + count2);
        
    }
    
}