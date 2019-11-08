package environment;

import java.awt.Color;
import java.util.*;
import javax.swing.*;

public class EnvironmentDriver extends JComponent
{
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
//		ArrayList<Block> ar1 = new ArrayList<Block>();
//		ar1.add(new Block(1000,75,Color.gray));
//		ar1.add(new Block(75,650,Color.gray));
//		ar1.add(new Block(75,650,925,0,Color.gray));
//		ar1.add(new Block(1000,75,0,575,Color.gray));
//		ar1.add(new Block(100,100,300,300,Color.orange));
//		ar1.add(new Block(100,100,700,300,Color.orange));
		
		JFrame frame = new JFrame("Stage 1");
		frame.setSize(1000,650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StageBackground b1 = new StageBackground("testBackground.png");
		Stage s1 = new Stage();
		s1.back = b1;
		s1.addBlock(new Block());
		//Stage s1 = new Stage(ar1); 
		frame.add(s1);
		frame.setVisible(true);
	
	}
}