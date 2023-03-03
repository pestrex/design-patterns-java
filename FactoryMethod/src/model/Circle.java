package model;

import java.awt.Graphics;

public class Circle implements Figure{
	/*
	 * The class Circle is used to set characteristics of a circle
	 * The methods inherited from the Figure interface are implemented in order to draw the object in a JPanel.
	 * */
	
	private static final int radius = 20;
	private int x, y;
	
	public Circle(int x, int y){ // Circle constructor
		setX(x);
		setY(y);
	}

	@Override
	public void draw(Graphics g) {
		/*
		 * Draw a circle in a JPanel
		 * the circle is painted in x and y position of the mouse when pressing left click
		 * */
		g.drawOval(getX(), getY(), getRadius(), getRadius()); // draw an unfilled circle
	}

	// Setters & Getters
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
	
	public int getRadius() {
		return radius;
	}

}
