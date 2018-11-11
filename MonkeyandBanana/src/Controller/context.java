package Controller;

import java.util.Random;

import model.Banana;
import model.Grid;
import model.Monkey;
import state.state;

public class context {
	private state Curstate;
	private static int width=50;
	private static int length=50;
	public void setState(state s) {
		System.out.println("State Change!");
		Curstate = s;
		Curstate.setposition();
	}
	Banana b= Banana.getInstance(); 
	public void eat() {
		Monkey m = Monkey.getInstance();
		if (m.getX()==b.getX()&&m.getY()==b.getY()) {
			m.setScore(10);
			setBanana();
			System.out.println("Another Banana is exsits in:"+b.getX()+","+b.getY()+"!");
			System.out.println("Monkey score is :"+m.getScore()+"!");
		}
	}
	public void setBanana() {
		Random random = new Random();
		int num = random.nextInt(50)+1;
		b.setY(num);
		b.setX(num);
	}
	
}
