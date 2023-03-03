package factory;

import model.Figure;

public interface FigureFactory {
	
	abstract Figure createFigure(int x, int y);
	
}
