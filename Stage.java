package environment;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Stage extends JComponent
{
	/**
	 * Serial number to be utilized by the Serializable interface
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
//	ArrayList<Block> backGroundArt = new ArrayList<Block>();
	StageBackground back;
	ArrayList<Block> stageBlocks = new ArrayList<Block>();
	Block floor;
	Block ceiling;
	Block leftWall;
	Block rightWall;
	
	//constructors
	
	/**
	 * creates a default Stage with a simple floor, ceiling, walls, and white background
	 */
	public Stage()
	{
		floor = new Block(1000,50,0,575,Color.black);
		ceiling = new Block(1000,50,Color.black);
		leftWall = new Block(50,650,Color.black);
		rightWall = new Block(50,650,950,0,Color.black);
		stageBlocks.add(floor);
		stageBlocks.add(ceiling);
		stageBlocks.add(leftWall);
		stageBlocks.add(rightWall);
	}
	
	/**
	 * 
	 * @param stageBlocks
	 */
	public Stage(ArrayList<Block> stageBlocks)
	{
//		this.backGroundArt = backGroundArt;
		this.stageBlocks = stageBlocks;
	}
	
	
	//helper methods
	/**
	 * Adds a block to the 
	 * @param b
	 */
	public void addBlock(Block b)
	{
		this.stageBlocks.add(b);
		repaint();
	}
	
	/**
	 * Draws the Block object onto the current JFrame
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
//		if(!this.backGroundArt.isEmpty())
//		{
//			for(int i = 0; i < this.backGroundArt.size(); i++)
//			{
//				g2.setColor(backGroundArt.get(i).getColor());
//				g2.fillRect(backGroundArt.get(i).getX_coord(), backGroundArt.get(i).getY_coord(), backGroundArt.get(i).getX_length(), backGroundArt.get(i).getY_length());
//			}
//		}
		
		if(this.back != null)
			g2.drawImage(back.background, 0, 0, null);
		if(!this.stageBlocks.isEmpty())
		{
			for(int i = 0; i < this.stageBlocks.size(); i++)
			{
				g2.setColor(stageBlocks.get(i).getColor());
				g2.fillRect(stageBlocks.get(i).getX_coord(),stageBlocks.get(i).getY_coord(), stageBlocks.get(i).getX_length(),stageBlocks.get(i).getY_length());
			}
		}
	}
}
