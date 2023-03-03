package main;

import jframes.Canvas;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // create JFrame
		Canvas canvas = new Canvas();
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400); // JFrame size
		frame.add(canvas); // add JPanel to the JFrame
		frame.setVisible(true); //set JFrame visible
	}

}
