package physics;

public class AccelerationVector extends Vector
{
	public AccelerationVector(int x_coord, int y_coord, double angle, int length) 
	{
		super(x_coord, y_coord, angle, length);
	}
	
	//helper methods
	public int getXAccel()
	{
		return super.getXLength();
	}
	
	public int getYAccel()
	{
		return super.getYLength();
	}
}
