package IntroToStacks;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted character onto a
	 * Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */
	Stack <char> label = new Stack <char>();
	JFrame f;
	JPanel p;
	JLabel l;

	public static void main(String[] args) {
		TextUndoRedo TUR = new TextUndoRedo();
		TUR.setup();

	}
	
	void setup() {

		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		f.add(p);
		p.add(l);
		f.setVisible(true);
		f.setSize(500, 500);
		f.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
			
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
