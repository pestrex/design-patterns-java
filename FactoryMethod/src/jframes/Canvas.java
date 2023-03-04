package jframes;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import factory.*;
import model.Figure;

public class Canvas extends JPanel implements MouseListener{
	/*
	 * The class Canvas is a JPanel used to generate figures in the window
	 * */
	private static final long serialVersionUID = 8509303623473043255L;
	
	private ArrayList<Figure> figuresList;
	protected static FigureFactory factory;
    
    public Canvas() { // Canvas constructor
    	setFiguresList(new ArrayList<>());
		setFactory(new RandomFigureFactory());
        addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
    	/*
    	 * Function that paint all the figures in the ArrayList on the JPanel
    	 * */
    	super.paint(g);
    	for (Figure objFigure: figuresList) {
    		objFigure.draw(g);
    	}
    }

    // MouseListener Methods
	@Override
	public void mouseClicked(MouseEvent e) {
		/*
		 * Function that detects when pressing the left mouse click
		 * Left-click to create a new figure at the mouse position
		 * */
		if (e.getButton() == 1) {
			getFiguresList().add(getFactory().createFigure(e.getX()-10, e.getY()-10));
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	// Setters & Getters
	public ArrayList<Figure> getFiguresList() {
		return figuresList;
	}

	public void setFiguresList(ArrayList<Figure> figuresList) {
		this.figuresList = figuresList;
	}

	public FigureFactory getFactory() {
		return factory;
	}

	public void setFactory(FigureFactory factory) {
		this.factory = factory;
	}

}
