import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SmileyFace 
{
	final static int FRAME_WIDTH = 400;
	final static int FRAME_HEIGHT = 400;
	
	
	public static void draw(Graphics g)
	{
		//Draw the face
		g.setColor(Color.white);
		g.fillOval(50,50,300,300);

		//Draw the eyes
		g.setColor(Color.black);
		g.fillOval(120,100,50,50);
		g.fillOval(225,100,50,50);
		
		
		//Draw the nose
		g.setColor(Color.orange);
		g.fillOval(180, 180, 40, 40);

		
		//Draw the mouth
		g.setColor(Color.black);
		g.drawArc(150,200,100,100,0,-180);
	}
	

	public static void main(String[] args) 
	{
		//Do not look at the code in the main method
		//You code will go into the draw method above
		
		JFrame frame = new JFrame();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent component = new JComponent()
		{
			public void paintComponent(Graphics g)
			{
				draw(g);
			}
		};
		
		frame.add(component);
		frame.setVisible(true);		
	}

}