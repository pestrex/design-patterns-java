package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import factory.*;
import model.*;

public class Factory {
	/*
	 * Tests to check the type of object created by the Factory
	 * */

	@Test
	public void circleFactory() {
		FigureFactory factory = new CircleFactory();
		assertTrue(factory.createFigure(0, 0).getClass() == Circle.class);
	}
	
	@Test
	public void triangleFactory() {
		FigureFactory factory = new TriangleFactory();
		assertTrue(factory.createFigure(0, 0).getClass() == Triangle.class);
	}
	
	@Test
	public void squareFactory() {
		FigureFactory factory = new SquareFactory();
		Figure figure = factory.createFigure(0, 0);
		assertFalse(figure.getClass() == Circle.class && figure.getClass() == Triangle.class);
	}

}
