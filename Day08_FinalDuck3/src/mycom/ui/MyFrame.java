package mycom.ui;

import java.awt.Graphics;

import javax.swing.JFrame;

import mycom.duck.DuckManager;

public class MyFrame extends JFrame{

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManager mgr = new DuckManager();
	
	public MyFrame() {
		super();
		this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(mgr!=null) {
			mgr.displayAllDucks(g);
			mgr.flyAllDucks(g);
			mgr.quackAllDucks(g);
			mgr.swimAllDucks(g);
		}
	}
};
