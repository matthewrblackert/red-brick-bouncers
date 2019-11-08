package environment;

import java.awt.*;
import javax.swing.*;

class Block extends JComponent
{
	/**
	 * Serial number to be utilized by the Serializable class
	 */
	private static final long serialVersionUID = 8363955838800823126L;
	
	/**
	 * Instance variables include the interactable boolean, which indicates whether or not a Player can interact with the block,
	 * the destructable boolean which indicates whether or not a Player can destroy a block
	 * x_length and y_length that are the size of the given block, and Color which is the color of the block. 
	 * The instance variables are set to default to false, 0, 0, and black.
	 * The x_coord and y_coord are the starting location of the Block from which the Grapics class will draw
	 * 
	 * Several of these variables are ints because the Graphics class must draw on pixels, and therefore cannot handle doubles
	 */
	boolean destructable = false; //defaulted to false because most Blocks should not be destructable until we figure out some potential uses
	boolean interactable = true; //defaulted to true because most Blocks should be interacted with unless they are a part of the background
	int x_coord = 0; //0 is on left-hand side, with +x heading to the right
	int y_coord = 0; //0 is on the top side, with the +y heading down
	int x_length = 0; //length of this block in the +x direction (right)
	int y_length = 0; //length of this block in the +y direction (down)
	Color color = Color.black;
	
	
	//constructors
	
	/**
	 * Creates a default Block object and draws into a given JFrame
	 */
	public Block(){}
	
	/**
	 * Creates a Block with a parametrized length and width
	 */
	public Block(int length, int width)
	{
		this.x_length = length;
		this.y_length = width;
	}
	
	/**
	 * Creates a Block with a parametrized color
	 */
	public Block(Color c)
	{
		this.color = c;
	}
	
	/**
	 * Creates a Block with a parametrized interactable boolean
	 */
	public Block(boolean i)
	{
		this.interactable = i;
	}
	
	/**
	 * Creates a Block with a parametrized length, width, and color
	 */
	public Block(int length, int width, Color c)
	{
		this.x_length = length;
		this.y_length = width;
		this.color = c;
	}
	
	/**
	 * Creates a Block with a parametrized length, width, x coord, y coord, and color
	 */
	public Block(int length, int width, int x, int y, Color c)
	{
		this.x_length = length;
		this.x_coord = x;
		this.y_length = width;
		this.y_coord = y;
		this.color = c;
	}
	
	/**
	 * Creates a Block with a parametrized length, width, color, and interactable boolean
	 */
	public Block(int length, int width, Color c, boolean i, boolean d)
	{
		this.x_length = length;
		this.y_length = width;
		this.color = c;
		this.interactable = i;
		this.destructable = d;
	}

	
	//getters and setters
	
	/**
	 * @return whether or not a Player can destroy this Block
	 */
	public boolean isDestructable() {
		return destructable;
	}

	/**
	 * @param destructable that will set whether or not a Player can destroy this Block
	 */
	public void setDestructable(boolean destructable) {
		this.destructable = destructable;
	}

	/**
	 * @return whether or not a Player can interact with this Block
	 */
	public boolean isInteractable() 
	{
		return interactable;
	}

	/**
	 * @param boolean intereractable that will set whether or not a Player can interact with this Block
	 */
	public void setInteractable(boolean interactable) 
	{
		this.interactable = interactable;
	}

	/**
	 * @return the x_length of this Block
	 */
	public int getX_length() 
	{
		return x_length;
	}

	/**
	 * @param x_length is the x_length to set for this Block
	 */
	public void setX_length(int x_length) 
	{
		this.x_length = x_length;
	}

	/**
	 * @return the y_length of this Block
	 */
	public int getY_length() 
	{
		return y_length;
	}

	/**
	 * @param y_length is the y_length to set for this Block
	 */
	public void setY_length(int y_length) 
	{
		this.y_length = y_length;
	}

	/**
	 * @return the color of the Block
	 */
	public Color getColor() 
	{
		return color;
	}

	/**
	 * @param color is the color to set for the Block
	 */
	public void setColor(Color color) 
	{
		this.color = color;
	}
	
	/**
	 * @return the x_coord of the Block's upper left-hand pixel
	 */
	public int getX_coord() 
	{
		return x_coord;
	}

	/**
	 * @param x_coord to be the x-coord of the Block's upper left-hand pixel
	 */
	public void setX_coord(int x_coord) 
	{
		this.x_coord = x_coord;
	}

	/**
	 * @return the y_coord of the Block's upper left-hand pixel
	 */
	public int getY_coord() 
	{
		return y_coord;
	}

	/**
	 * @param y_coord to be the y-coord of the Block's upper left-hand pixel
	 */
	public void setY_coord(int y_coord) 
	{
		this.y_coord = y_coord;
	}
	
	
	//helper methods

	/**
	 * Sets the coordinates of the Block's upper left-hand pixel
	 * @param x is the x-coord of the pixel
	 * @param y is the y-coord of the pixel
	 */
	public void setCoordinates(int x, int y)
	{
		this.setX_coord(x);
		this.setY_coord(y);
	}

	/**
	 * Sets the x_length and y_length of this Block
	 * @param x is the int to become the x_length
	 * @param y is the int to become the y_length
	 */
	public void setBlockSize(int x, int y)
	{
		this.setX_length(x);
		this.setY_length(y);
	}
}
	
	
