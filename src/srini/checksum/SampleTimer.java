package srini.checksum;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SampleTimer {
	  
	  public static void main(String args[]) throws InterruptedException {
	    System.out.println("About to schedule task.");
	    Timer timer = new Timer();
	    timer.scheduleAtFixedRate(new RemindTask(), new Date(), 100);
	    System.out.println("Task scheduled.");
	    Thread.sleep(1000);
	    timer.cancel();
	  }
	}
	  
class RemindTask extends TimerTask {
    public void run() {
      System.out.println(System.currentTimeMillis() + "running timer!");
    }
  }
