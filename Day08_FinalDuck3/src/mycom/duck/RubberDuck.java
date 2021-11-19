package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck 
		implements Quackable{

	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x,y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.ORANGE);
		g.drawString("»à»à", x+Duck.SIZE+2, y+Duck.SIZE+2);
	}
	

};
