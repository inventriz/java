package com.inventriz.thread;

import java.util.Date;
import java.util.Scanner;

public class ProduceConsume {
	
	// Prints a string and waits for consume()
    public void produce()throws InterruptedException
    {
        // synchronized block ensures only one thread
        // running at a time.
        synchronized(this)
        {
            System.out.println("producer thread running by "+Thread.currentThread().getId()+"@ "+new Date(System.currentTimeMillis()));

            // releases the lock on shared resource
            wait(12000); // wait for 12 sec
            //wait(); // unlimited wait

            // and waits till some other method invokes notify().
            System.out.println("Resumed at "+Thread.currentThread().getId()+"@ "+new Date(System.currentTimeMillis()));
        }
    }

    // Sleeps for some time and waits for a key press. After key
    // is pressed, it notifies produce().
    public void consume()throws InterruptedException
    {
        // this makes the produce thread to run first.
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);

        // synchronized block ensures only one thread
        // running at a time.
        synchronized(this)
        {
            System.out.println("Waiting for return key by "+Thread.currentThread().getId()+"@ "+new Date(System.currentTimeMillis()));
            s.nextLine();
            System.out.println("Return key pressed by "+Thread.currentThread().getId()+"@ "+new Date(System.currentTimeMillis()));

            // notifies the produce thread that it
            // can wake up.
            notify();

            // Sleep
            Thread.sleep(2000);
        }
    }

}
