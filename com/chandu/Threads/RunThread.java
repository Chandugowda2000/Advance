package com.chandu.Threads;


public class RunThread implements Runnable {
	// method to start Thread
	public void run()
	{
		System.out.println(
			"Thread is Running Successfully");
	}

	public static void main(String[] args)
	{
		RunThread g1 = new RunThread();
		// initializing Thread Object
		Thread t1 = new Thread(g1);
		t1.start();
	}
}
