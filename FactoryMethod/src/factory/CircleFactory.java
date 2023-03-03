package factory;

import model.Circle;
import model.Figure;

public class CircleFactory implements FigureFactory{
	/*
	 * The class CircleFactory implements from FigureFactory
	 * This implementation follows the 'Factory Method' design pattern
	 * Overwrites the methods inherited form FigureFactory to only create circles 
	 * */
	
	public CircleFactory() { // CircleFactory constructor
		
	}

	@Override
	public Figure createFigure(int x, int y) {
		/*
		 * Creates and returns an object of type circle
		 * */
		return new Circle(x, y);
	}

}
