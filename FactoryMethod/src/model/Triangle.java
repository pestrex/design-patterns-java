package model;

import java.awt.Graphics;

public class Triangle implements Figure{
	/*
	 * The class Triangle is used to set characteristics of a triangle
	 * The methods inherited from the Figure interface are implemented in order to draw the object in a JPanel.
	 * */
	
	private static final int side = 10;
	private int x, y;

	public Triangle(int x, int y) { // Triangle constructor
		setX(x);
		setY(y);
	}

	@Override
	public void draw(Graphics g) {
		/*
		 * Draw a triangle in a JPanel
		 * the triangle is painted in x and y position, of the mouse when, pressing left click
		 * */
		int X[] = {getX()+getSide(),getX(),getX()+getSide()*2};							// set x-coordinates
        int Y[] = {getY(),getY()+getSide()+getSide()/2,getY()+getSide()+getSide()/2};	// set y-coordinates
		g.drawPolygon(X, Y, 3); // draw an unfilled triangle
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

	public int getSide() {
		return side;
	}

}
