package stateImp;

import model.Banana;
import model.Monkey;

public class up_move extends startstate{
	public void setposition() {
		Monkey x = Monkey.getInstance();
		Banana b = Banana.getInstance();
		x.setY(1);
		System.out.println("Monkey now in£º ["+x.getX()+" ,"+x.getY()+"]");
		System.out.println("banana now in£º ["+b.getX()+" ,"+b.getY()+"]");
		
	}
}
