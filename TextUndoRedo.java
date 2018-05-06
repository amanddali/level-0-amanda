package IntroToStacks;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	String letter = "";
	static Stack<Character> character = new Stack<Character>();
	static Stack<Character> store = new Stack<Character>();

	public static void main(String[] args) {
		TextUndoRedo stuff = new TextUndoRedo();
		stuff.createUI();
	}

	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.setVisible(true);
		frame.addKeyListener(this);
		panel.setPreferredSize(new Dimension(300, 300));
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	public void setLabel() {
		label.setText("");
		char car = '\0';
		letter = "";
		for (int i = 0; i < character.size(); i++) {
			car = character.pop();
			store.push(car);
		}
		for (int i = 0; i < store.size(); i++) {
			car = store.pop();
			letter += car;
			character.push(car);
		}
		label.setText(letter);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		character.push(e.getKeyChar());
		setLabel();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
