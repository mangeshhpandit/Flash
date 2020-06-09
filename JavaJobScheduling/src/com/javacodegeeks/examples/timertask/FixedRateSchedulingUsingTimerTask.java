package com.javacodegeeks.examples.timertask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class FixedRateSchedulingUsingTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Fixed rate timer task executed :: " + new Date() + " :: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
				
		Timer timer = new Timer(); // Instantiating a timer object
		
		FixedRateSchedulingUsingTimerTask task1 = new FixedRateSchedulingUsingTimerTask(); // Creating a FixedRateSchedulingUsingTimerTask
		timer.scheduleAtFixedRate(task1, 2 * 1000, 2 * 1000); // Scheduling it to be executed with fixed rate at every two seconds
		
		FixedRateSchedulingUsingTimerTask task2 = new FixedRateSchedulingUsingTimerTask(); // Creating another FixedRateSchedulingUsingTimerTask
		timer.schedule(task2, 2 * 1000, 2 * 1000); // Scheduling it to be executed with fixed delay at every two seconds
	
	}
}
