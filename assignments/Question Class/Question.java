import java.util.*;
/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question
{
    private String text;
    private String answer;
    private int score;
    public Question()
    {
        text = "";
        answer = "";
    }
    public void addText(String textIN)
    {
        text = textIN; 
    }
    public void addAnswer(String answerIN)
    {
        answer = answerIN;
    }
    public void display()
    {
        System.out.println(text);
    }
    public String getAnswer()
    {
        return answer;
    }
    

    
}