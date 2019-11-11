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
	int floor_width = 1000;
	int floor_height = 50;
	int x_position_floor = 0;
	int y_position_floor = 575;
	
	//constructors
	
	public int getFloor_width() {
		return floor_width;
	}



	public void setFloor_width(int floor_width) {
		this.floor_width = floor_width;
	}



	public int getFloor_height() {
		return floor_height;
	}



	public void setFloor_height(int floor_height) {
		this.floor_height = floor_height;
	}



	public int getX_position_floor() {
		return x_position_floor;
	}



	public void setX_position_floor(int x_position_floor) {
		this.x_position_floor = x_position_floor;
	}



	public int getY_position_floor() {
		return y_position_floor;
	}



	public void setY_position_floor(int y_position_floor) {
		this.y_position_floor = y_position_floor;
	}



	/**
	 * creates a default Stage with a simple floor, ceiling, walls, and white background
	 */
	public Stage()
	{
		floor = new Block(floor_width, floor_height, x_position_floor, y_position_floor,Color.black, false, false);
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
			Player p1 = new Player();
			p1.paintComponent(g2);
		}
	}
}
