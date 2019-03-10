package TextGameV2; 

import java.util.*;
import java.io.*;


/**
 * establishes player and monster Object and asks user four seperate choices
 *
 * @Bret Wilson, Jake Kerzman, Mckenna Peterson, Haley Cuppet
 * 
 */
public class GameRunner
{
    public static double playerHP = 100;
    //establishes the players total health//
    public static double monsterHP = 100;
    //establishes the monsters total
    public static int ans;
    public static void main(String[] args)
    {
        
        
        double damage = 0;
        double heal = 0;
        //heal and damage variable established//
        Game game = new Game();
        //calls Game class to allow the use of Game methods//
        System.out.println(game.display());
        //displays the 4 choices//
        System.out.println("Enter a number corresponding to its action \n");
        //asks the user to perform a choice//
        Scanner scan = new Scanner(System.in);
        //declares scanner variable//
        while (monsterHP > 0 && playerHP > 0) //makes sure the code continues to run as long as the player and monster HP is above 0//
        {
             if(!scan.hasNextInt())//catches all inputs that are not ints//
            {
                System.out.println("Error: program only accepts ints");
                scan.close();
                System.exit(1);
            }
            System.out.println(game.display()); //continuously displays the 4 choices as long as the player and monster are alive//
            System.out.println("Enter a number corresponding to its action \n"); 
            ans = scan.nextInt();
            
          
                
            if(ans >= 1 && ans <= 3)//makes sure the monster attacks once per turn//
            {
                double damage2 = Math.random() * 10;
                damage2 = (int) damage2;
                playerHP -= damage2;
            }
            if(ans == 1)//damage for the player is a random number between 0 and 10//
            {
                damage = Math.random() * 10;
                damage = (int) damage;
                monsterHP  -= damage;
                game.displayHealth();
            }
            if(ans == 2)//increases the players hitpoints a random amount between 0 and 10)//
            {
                heal = Math.random() * 10;
                heal = (int) heal;
                playerHP += heal;
                game.displayHealth();
            }
           if(ans == 4) //ends code if the player surrenders//
           {
               
               System.out.println("You have surrendered");
               System.exit(1);
               playerHP -= 150;
            }
            
            if(ans == 3)//Mystery box method that rolls a random number
            //between 0 and 4 and gives the player a random ability based
            //on the number rolled//
            {
                
                double roll = game.roll();
                System.out.println("You chose to open a mystery box");
                if(roll == 0)
                {
                    damage += 2;
                    System.out.println("Your mystery box contained an Attack powerup, you attack has increased by 2");
                }
                if(roll == 1)
                {
                    playerHP += 10;
                    System.out.println("Your mystery box contained a helath boost, your total HP has been increased by 10");
                }
                if(roll == 2)
                {
                    monsterHP -= 10;
                    System.out.println("Your mystery box contained a posion blade that dealt 10 damage to the monster");
                }
                if(roll == 3)
                {
                    playerHP -= 10;
                    System.out.println("OH NO!!! it was a trap, you lost 10 health");
                }
                if(roll == 4)
                {
                  System.out.println("All this mystery box contained was a million dollars");
                    
                
                }
                game.displayHealth();
            }
            
            
            if(playerHP <= 0)//if the plyaers health is below 0, than the player
            //dies and loses the game//
            {
                System.out.println("Game over, you are dead");
                scan.close();
            }
            if(monsterHP <= 0)//if the monsters health is below 0, than the player wins//
            {
                System.out.println("Congrats, you have killed the monster");
                scan.close();
            }
            
            
            
        }
                
                
                
        
        
        
        
        
        
    }
}
