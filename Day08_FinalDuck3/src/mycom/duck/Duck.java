package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public abstract class Duck {
	
	protected int x; //�ν��Ͻ� ����
	protected int y;
	public static final int SIZE = 30; //Ŭ��������
	
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�߻�޼ҵ� --> �߻�Ŭ���� --> new ��� ���ؿ�~!!! --> ���(���ϻ��)
	public abstract void display(Graphics g);
	
	public final void swim(Graphics g) {
		g.drawString("����", x-5, y-2);
	}

};
