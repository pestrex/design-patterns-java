package main;

import jframes.Canvas;
import jframes.Window;

public class Main {
	
	public static void main(String[] args) {
		Window frame = new Window(); // create JFrame
		Canvas canvas = new Canvas();
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400); // JFrame size
		frame.add(canvas); // add JPanel to the JFrame
		frame.setVisible(true); //set JFrame visible
	}

}
