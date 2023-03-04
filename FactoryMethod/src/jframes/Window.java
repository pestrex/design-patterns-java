package jframes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import factory.*;

public class Window extends JFrame implements KeyListener{
	/*
	 * The class Window generates a JFrame to open a new window
	 * The class implements a KeyListener to catch when the user pressed a key.
	 */
	private static final long serialVersionUID = -4880294148055442955L;
	
	public Window() { // Window constructor
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * Change factory type when typing the correct letter
		 * */
		int key = e.getKeyCode();
		System.out.println(key);
		switch (key){
		case 67: // 'C' only creates circles
			setFactory(new CircleFactory());
			break;
		case 82: // 'R' creates randomly
			setFactory(new RandomFigureFactory());
			break;
		case 83: // 'S' only creates squares
			setFactory(new SquareFactory());
			break;
		case 84: // 'T' only creates triangles
			setFactory(new TriangleFactory());
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	// Setters & Getters¿
	
	public void setFactory(FigureFactory factory) {
		Canvas.factory = factory;
	}

}
