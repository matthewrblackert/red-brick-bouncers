package environment;

import javax.swing.*;

public class EnvironmentDriver
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Test");
		frame.setSize(1500,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent j1 = new Stage();  
		frame.add(j1);
		frame.setVisible(true);
	}
	
	/**
	 * Draws the Block object onto the current JFrame
	 */
	
}