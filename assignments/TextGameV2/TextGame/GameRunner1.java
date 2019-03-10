package TextGameV2;

import java.util.*;
import java.io.*;


/**
 * Write a description of class GameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameRunner1
{
    public static double playerHP = 100;
    public static double monsterHP = 100;
    public static int ans;
    public static void main(String[] args)
    {
        
        
        double damage = 0;
        double heal = 0;
        Game1 game = new Game1();
        Scanner scan = new Scanner(System.in);
        while (monsterHP > 0 && playerHP > 0)
        {
             if(!scan.hasNextInt())
            {
                System.out.println("Error: program only accepts ints");
                scan.close();
                System.exit(1);
            }
            System.out.println(game.display());
            System.out.println("Enter a number corresponding to its action");
            ans = scan.nextInt();
            
          
                
            if(ans >= 1 && ans <= 3)
            {
                double damage2 = Math.random() * 10;
                damage2 = (int) damage2;
                playerHP -= damage2;
            }
            if(ans == 1)
            {
                damage = Math.random() * 10;
                damage = (int) damage;
                monsterHP  -= damage;
                game.displayHealth();
            }
            if(ans == 2)
            {
                heal = Math.random() * 10;
                heal = (int) heal;
                playerHP += heal;
                game.displayHealth();
            }
           if(ans == 4)
           {
               
               System.out.println("You have surrendered");
               System.exit(1);
               playerHP -= 150;
            }
            
            if(ans == 3)
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
            
            
            if(playerHP <= 0)
            {
                System.out.println("Game over, you are dead");
                scan.close();
            }
            if(monsterHP <= 0)
            {
                System.out.println("Congrats, you have killed the monster");
                scan.close();
            }
            
            
            
        }
                
                
                
        
        
        
        
        
        
    }
}

