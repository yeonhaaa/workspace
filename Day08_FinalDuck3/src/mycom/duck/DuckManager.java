package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	private Duck[] darr = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}
	
	private void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		
		for(int i=0; i<darr.length;i++) {
			type = rnd.nextInt(4); //0,1,2,3
			switch(type) {
			case 0 :
				//업캐스팅:자식확장은 접근불가
				darr[i] = new MallardDuck();
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			case 2:
				darr[i] = new RubberDuck();
				break;
			case 3:
				darr[i] = new DecoyDuck();
				break;
			default: 
				darr[i] = new MallardDuck();
			}
		}
	}//makeDucks
	
	
	public void displayAllDucks(Graphics g) {
		for(Duck d:darr) {
			if(d!=null) d.display(g);
		}
	}

	
	public void swimAllDucks(Graphics g) {
		for(Duck d:darr) {
			if(d!=null) d.swim(g);
		}
	}
	
	//--------
	public void quackAllDucks(Graphics g) {
		for(Duck d:darr) {
			if(d instanceof Quackable) {
				((Quackable)d).quack(g);
			}
		}//for
	}
	
	public void flyAllDucks(Graphics g) {
		for(Duck d:darr) {
			if(d instanceof Flyable) {
				((Flyable)d).fly(g);
			}
		}//for
	}
	
};
