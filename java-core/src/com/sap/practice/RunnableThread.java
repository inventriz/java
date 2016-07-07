package com.sap.practice;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		try
        {
            // Displaying the thread that is running
            System.out.println ("RunnableThread " +
                  Thread.currentThread().getId() +
                  " is running");
 
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
		
	}

}
