package environment;

import java.awt.Color;

import javax.swing.*;

public class EnvironmentDriver
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Test");
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent j1 = new Block(300,300);
		frame.add(j1);
		frame.setVisible(true);
	}
}