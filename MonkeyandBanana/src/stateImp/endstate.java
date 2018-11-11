package stateImp;

import com.sun.javafx.tools.packager.Log;

import model.Banana;
import model.Monkey;
import state.state;

public class endstate extends state{
	public void setposition() {
		
		Monkey m = Monkey.getInstance();
		m.setScore(Integer.MIN_VALUE);
	}
}
