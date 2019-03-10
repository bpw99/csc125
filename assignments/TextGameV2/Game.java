package TextGameV2;
import java.util.*;

/**
 * Contains methods used in GameRunner class
 *
 * @Bret Wilson, Jake Kerzman, Mckenna Peterson, Haley Cuppet
 * 
 */
public class Game {
    
    public Game()
    {
    }
    
    public ArrayList<String> display() //display method that displays choices//
    {
        ArrayList<String> options = new ArrayList<String>();
        options.add("Attack = 1");
        options.add("Heal = 2");
        options.add("Mystery = 3");
        options.add("Surrender = 4");
        return options;
    }
   
    public void displayHealth() //displayhealth method displays player and monster health//
    {
        System.out.println("Your Health: " + GameRunner.playerHP);
        System.out.println("Monster Health: " + GameRunner.monsterHP);
        
    }
    public double roll() //rolls a random number from 0 to 4//
    {
        double rand = Math.random() * 5;
        rand = (int) rand;
        return rand;
    }
}
