package factory;

import model.Figure;
import model.Square;

public class SquareFactory implements FigureFactory{
	/*
	 * The class SquareFactory implements from FigureFactory
	 * This implementation follows the 'Factory Method' design pattern
	 * Overwrites the methods inherited form FigureFactory to only create squares 
	 * */

	public SquareFactory() { // SquareFactory constructor
		
	}
	
	@Override
	public Figure createFigure(int x, int y) {
		/*
		 * Creates and returns an object of type square
		 * */
		return new Square(x, y);
	}

}
