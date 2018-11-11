package Controller;


import stateImp.down_move;
import stateImp.endstate;
import stateImp.left_move;
import stateImp.right_move;
import stateImp.startstate;
import stateImp.up_move;
import view.GameGUI;

public class GameController {
	context c = new context();
	public void Changestate(String msg) {
		GameGUI GG= GameGUI.geyInstance();
				if(msg.equals("up")) {
					c.setState(new up_move());
					c.eat();
				}
				else if(msg.equals("start")) {
					/*GameThread Game = new GameThread();
					TimeThread Time = new TimeThread();
					Game.start();
					Time.start();*/
					c.setState(new startstate());
					c.eat();
					}
				else if (msg.equals("down")) {
					c.setState(new down_move());
					c.eat();
				}
				else if (msg.equals("right")) {
					c.setState(new right_move());
					c.eat();
				}
				else if (msg.equals("left")) {
					c.setState(new left_move());
					c.eat();
				}
				if(msg.equals("end")) {
					c.setState(new endstate());
					
				}
			}

	}

