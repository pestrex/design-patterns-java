package main;

import jframes.Canvas;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Canvas canvas = new Canvas();
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.add(canvas);
		frame.setVisible(true);
	}

}
