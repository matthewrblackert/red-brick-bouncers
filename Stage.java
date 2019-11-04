package environment;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Stage extends JComponent
{
	private static final long serialVersionUID = 1L;
	
	ArrayList<Block> stageBlocks = new ArrayList<Block>();
	Block floor;
	Block ceiling;
	Block leftWall;
	Block rightWall;
	
	public Stage()
	{
		floor = new Block(1000,75,0,575,Color.black);
		ceiling = new Block(1000,75,Color.black);
		leftWall = new Block(75,650,Color.black);
		rightWall = new Block(75,650,925,0,Color.black);
		stageBlocks.add(floor);
		stageBlocks.add(ceiling);
		stageBlocks.add(leftWall);
		stageBlocks.add(rightWall);
	}
	
	/**
	 * Draws the Block object onto the current JFrame
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		for(int i = 0; i < this.stageBlocks.size(); i++)
		{
			g2.setColor(stageBlocks.get(i).getColor());
			g2.fillRect(stageBlocks.get(i).getX_coord(),stageBlocks.get(i).getY_coord(), stageBlocks.get(i).getX_length(),stageBlocks.get(i).getY_length());
		}
	}
}
