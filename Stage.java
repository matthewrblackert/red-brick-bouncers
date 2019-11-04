package environment;

import java.awt.*;
import javax.swing.*;

public class Stage extends JComponent
{
	private static final long serialVersionUID = 1L;
	
	Block floor;
	Block ceiling;
	Block leftWall;
	Block rightWall;
	
	public Stage(JFrame j)
	{
		floor = new Block(1500,25,0,975,Color.black);
		ceiling = new Block(1500,25,Color.black);
		leftWall = new Block(25,1000,Color.black);
		rightWall = new Block(25,1000,1475,0,Color.black);
		j.add(floor);
		j.add(ceiling);
		j.add(leftWall);
		j.add(rightWall);
	}
}
