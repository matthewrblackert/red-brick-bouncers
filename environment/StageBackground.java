package environment;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class StageBackground extends Block
{
	/**
	 * Serial number to be utilized by the Serializable interface
	 */
	private static final long serialVersionUID = 1L;

	Image background = null;
	
	public StageBackground(String fileLocation)
	{
		if((new File(fileLocation)).exists())
			background = new ImageIcon(fileLocation).getImage();
	}
	
}