package environment;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener {

	int dx, dy;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
        	System.out.println("Up key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	System.out.println("Down key pressed");
        }
        
        if (e.getKeyCode() == KeyEvent.VK_W) {
        	System.out.println("W key has been pressed.");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
        	System.out.println("S key has been pressed.");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
        	System.out.println("A key has been pressed.");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
        	System.out.println("D key has been pressed.");
        }
        
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
