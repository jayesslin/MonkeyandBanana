package stateImp;

import model.Banana;
import model.Monkey;


public class left_move extends startstate{
	public void setposition() {
		Monkey x = Monkey.getInstance();
		Banana b = Banana.getInstance();
		x.setX(-1);
		System.out.println("Monkey now in�� ["+x.getX()+" ,"+x.getY()+"]");
		System.out.println("banana now in�� ["+b.getX()+" ,"+b.getY()+"]");
	}
}
