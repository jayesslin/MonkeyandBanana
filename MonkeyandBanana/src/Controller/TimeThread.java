package Controller;

import TimeTools.CutDownTime;

public class TimeThread extends Thread{
	 
	 public static int GameTime=120;
     public void run() {
    	try {
			new CutDownTime(GameTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		
     }
}
