
/**
 * Creates a 2D house
 *
 * @Bret Wilson
 * @9/27/18
 */
import java.awt.*;
import java.util.*;
import javax.swing.JComponent;
import javax.swing.JFrame; 
import java.awt.Graphics;
class House extends JComponent
{
    public void paint(Graphics g)
    {
        
        g.drawRect (100, 100, 100, 100);
        g.drawRect (135, 150, 30, 50);
        
        
        
    }
}
    public class DrawHouse
    {
    
        public static void main(String[] a)
        {
            JFrame window = new JFrame();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setBounds(30, 30, 300, 300);
            window.getContentPane().add(new House());
            window.setVisible(true);
            
            
            
            
        }
        
        
    }

    
    

        
    // instance variables - replace the example below with your own
    