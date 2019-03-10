import java.util.*;
/**
 * creates methods for multiple choice questions
 *
 * @Bret Wilson
 * @11/12/18
 */
public class ChoiceQuestion extends Question
{
    private ArrayList<String> choices;
    public ChoiceQuestion()
    {
        super();
        choices = new ArrayList<String>();
    }
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        if(correct)
        {
            String choiceString = " " + choices.size();
            setAnswer(choiceString);
        }
    }
    
    public void display()
    {
        super.display();
        for(int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + " " + choices.get(i));
        }
    }
}
    