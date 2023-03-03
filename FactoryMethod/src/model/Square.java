package model;

import java.awt.Graphics;

public class Square implements Figure{
	/*
	 * The class Square is used to set characteristics of a square
	 * The methods inherited from the Figure interface are implemented in order to draw the object in a JPanel.
	 * */
	
	private static final int side = 20;
	private int x, y;
	
	public Square(int x, int y) { // Square constructor
		setX(x);
		setY(y);
	}

	@Override
	public void draw(Graphics g) {
		/*
		 * Draw a square in a JPanel
		 * the square is painted in x and y position, of the mouse when, pressing left click
		 * */
		g.drawRect(getX(), getY(), getSide(), getSide()); // draw an unfilled square
	}
	
	// Setter & Getters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSide() {
		return side;
	}

}
