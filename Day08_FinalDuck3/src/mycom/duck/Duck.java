package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public abstract class Duck {
	
	protected int x; //인스턴스 변수
	protected int y;
	public static final int SIZE = 30; //클래스변수
	
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상메소드 --> 추상클래스 --> new 사용 못해요~!!! --> 상속(단일상속)
	public abstract void display(Graphics g);
	
	public final void swim(Graphics g) {
		g.drawString("수영", x-5, y-2);
	}

};
