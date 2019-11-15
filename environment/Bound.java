/**
 * 
 */
package environment;

import javax.swing.*;

/**
 * @author benma
 *
 */
public class Bound extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//lays down bounds based on starting points, then goes in a certain direction for a certain length
	int x_pos = 0; //x-position of the starting point
	int y_pos = 0; //y-position of the starting point
	int length = 0; //number of pixels that this Bound will span
	double orientation = 0; //direction in which the length will span from the starting point. Do 0 for a horizontal line and 90 for a vertical line
	
	public Bound(int x_pos, int y_pos, int length, double orientation)
	{
		this.x_pos = x_pos;
		this.y_pos = y_pos;
		this.length = length;
		this.orientation = orientation;
	}
		
	public Bound(){}

	
	//getters and setters
	/**
	 * @return the x_pos
	 */
	public int getX_pos() 
	{
		return x_pos;
	}

	/**
	 * @param x_pos the x_pos to set
	 */
	public void setX_pos(int x_pos) 
	{
		this.x_pos = x_pos;
	}

	/**
	 * @return the y_pos
	 */
	public int getY_pos() 
	{
		return y_pos;
	}

	/**
	 * @param y_pos the y_pos to set
	 */
	public void setY_pos(int y_pos) 
	{
		this.y_pos = y_pos;
	}

	/**
	 * @return the length
	 */
	public int getLength() 
	{
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) 
	{
		this.length = length;
	}

	/**
	 * @return the orientation
	 */
	public double getOrientation() 
	{
		return orientation;
	}

	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(double orientation) 
	{
		this.orientation = orientation;
	}
	
	//helper methods
	public int getXLength()
	{
		return this.getLength() * (int) Math.cos(this.getOrientation());
	}
	
	public int getYLength()
	{
		return this.getLength() * (int) Math.sin(this.getOrientation());
	}
}
