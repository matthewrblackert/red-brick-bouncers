package physics;

public class Vector 
{
	int x_coord, y_coord, x_length, y_length, magnitude = 0;
	double angle = 0;
	
	/**
	 * @param x_coord
	 * @param y_coord
	 * @param originalAngle
	 * @param length
	 */
	public Vector(int x_coord, int y_coord, double angle, int magnitude) 
	{
		super();
		this.x_coord = x_coord;
		this.y_coord = y_coord;
		this.angle = angle;
		this.magnitude = magnitude;
		this.x_length = this.getXLength();
		this.y_length = this.getYLength();
	}
	
	public Vector() {}

	//getters and setters
	
	/**
	 * @return the x_coord
	 */
	public int getX_coord() {
		return x_coord;
	}

	/**
	 * @param x_coord the x_coord to set
	 */
	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
	}

	/**
	 * @return the y_coord
	 */
	public int getY_coord() {
		return y_coord;
	}

	/**
	 * @param y_coord the y_coord to set
	 */
	public void setY_coord(int y_coord) {
		this.y_coord = y_coord;
	}

	/**
	 * @return the originalAngle
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * @param originalAngle the originalAngle to set
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}

	/**
	 * @return the length
	 */
	public int getMagnitude() {
		return this.magnitude;
	}

	/**
	 * @param length the length to set
	 */
	public void setMagnitude(int magnitude) {
		this.magnitude = magnitude;
	}
	
	//helper methods
	public void rotateVector(double newAngle)
	{
		this.angle += newAngle;
	}

	public int getXLength()
	{
		return this.magnitude * (int) Math.cos(this.angle);
	}
	
	public int getYLength()
	{
		return this.magnitude * (int) Math.sin(this.angle);
	}
	public void calculateAngle()
	{
		this.angle = Math.atan2(y_length, x_length);
	}
	
	public void calculateMagnitude()
	{
		this.magnitude = (int)Math.sqrt(Math.pow(this.x_length, 2) + Math.pow(this.y_length, 2));
	}
	
	public void updateVector()
	{
		this.x_length = getXLength();
		this.y_length = getYLength();
	}
}
