package factory;

import model.Figure;
import model.Triangle;

public class TriangleFactory implements FigureFactory{
	/*
	 * The class TriangleFactory implements from FigureFactory
	 * This implementation follows the 'Factory Method' design pattern
	 * Overwrites the methods inherited form FigureFactory to only create triangles 
	 * */
	
	public TriangleFactory() { // TriangleFactory constructor
		
	}

	@Override
	public Figure createFigure(int x, int y) {
		/*
		 * Creates and returns an object of type triangle
		 * */
		return new Triangle(x, y);
	}

}
