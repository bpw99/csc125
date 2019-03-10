
/**
 * Question class for methods
 *
 * @Bret Wilson
 * @11/12/18
 */
public class Question
{
    private String text;
    private String answer;
    
    public Question()
    {
        text = "";
        answer = "";
    }
    public void setText(String textIN)
    {
    text = textIN;
    }  
    public void setAnswer(String answerIN)
    {
        answer = answerIN;
      
    }
    public String getAnswer()
    {
        return answer;
        
    }
    public boolean checkAnswer(String response)
    {
        if(response.equalsIgnoreCase(answer))
        {
            return true;
        }
        
           
        else
        {
            return false;
        }
    }
    
    public void display()
    {
        System.out.println(text);
    }
        
    
    
    
    
    
}