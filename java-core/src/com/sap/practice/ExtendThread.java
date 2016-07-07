package com.sap.practice;

public class ExtendThread extends Thread{
	
	private String msg;
	
	public ExtendThread(String msg) {
		this.msg = msg;
	}
	
	synchronized void send(String msg){
		
		// Displaying the thread that is running
		System.out.println ("ExtendThread " +
          Thread.currentThread().getId() +
          " is running for "+this.msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sending message == "+msg);
	}
	
	public void run() {
		try
        {
			this.send(this.msg);
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
		
	}

}
