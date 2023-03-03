package jframes;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import factory.*;
import model.Figure;

public class Canvas extends JPanel implements MouseListener, KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8509303623473043255L;
	
	private ArrayList<Figure> figuresList;
	private FigureFactory factory;
    
    public Canvas() { // Canvas constructor
    	/*
    	 * 
    	 * */
    	setFiguresList(new ArrayList<>());
		setFactory(new RandomFigureFactory());
        addMouseListener(this);
        addKeyListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
    	/*
    	 * 
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
		 * 
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
	
	// KeyListener Methods
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 * 
		 * */
		if(KeyEvent.VK_T == e.getKeyCode()) {
			setFactory(new TriangleFactory());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

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
