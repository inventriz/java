package com.sap.practice;

public class InventThread {

	public static void main(String args[]){		
		// using extending thread
		/*for(int i=0; i<8; i++){
			ExtendThread et = new ExtendThread();
			et.start();
		}*/
		
		// using runnable interface
		/*for(int i=0; i<8; i++){
			Thread rt = new Thread(new RunnableThread());
			rt.start();
		}*/
		
		ExtendThread et1 = new ExtendThread("Hi TC");
		ExtendThread et2 = new ExtendThread("Hi PBC");
		
		et1.start();
		et2.start();
		
		// wait for threads to end
        try
        {
            et1.join();
            et2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
	}
}
