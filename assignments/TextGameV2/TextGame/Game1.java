package TextGameV2;
import java.util.*;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game1 {
    
    public Game1()
    {
    }
    
    public ArrayList<String> display()
    {
        ArrayList<String> options = new ArrayList<String>();
        options.add("Attack = 1");
        options.add("Heal = 2");
        options.add("Mystery = 3");
        options.add("Surrender = 4");
        return options;
    }
   
    public void displayHealth()
    {
        System.out.println("Your Health: " + GameRunner1.playerHP);
        System.out.println("Monster Health: " + GameRunner1.monsterHP);
        
    }
    public double roll()
    {
        double rand = Math.random() * 5;
        rand = (int) rand;
        return rand;
        
        
    }
    
}