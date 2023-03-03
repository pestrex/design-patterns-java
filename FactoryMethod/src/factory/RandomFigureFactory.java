package factory;

import model.Circle;
import model.Figure;
import model.Square;
import model.Triangle;

public class RandomFigureFactory implements FigureFactory{
	/*
	 * The class RandomFigureFactory implements from FigureFactory
	 * This implementation follows the 'Factory Method' design pattern
	 * Overwrites the methods inherited form FigureFactory to create, randomly,
	 * any figure in the list (squares, circles or triangles)
	 * */
	
	public RandomFigureFactory() { // RandomFigureFactory constructor
		
	}

	@Override
	public Figure createFigure(int x, int y) {
		/*
		 * 
		 * */
		double rand = getRandom(); // random number to define which figure will be created
		// System.out.println(rand);
		
		if (rand <= 0.33) {
			return new Square(x, y);
		} else if (rand > 0.33 && rand <= 0.67) {
			return new Circle(x, y);
		} else {
			return new Triangle(x, y);
		}
	}

	private double getRandom() {
		/*
		 * Generates and returns a random number (double type) between 0 and 1
		 * */
		return Math.random();
	}
}
