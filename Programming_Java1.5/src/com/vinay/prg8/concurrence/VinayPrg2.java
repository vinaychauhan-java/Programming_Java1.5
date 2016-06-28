package com.vinay.prg8.concurrence;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable
{

	protected BlockingQueue<String> queue = null;

	public Producer(BlockingQueue<String> queue)
	{
		this.queue = queue;
	}

	public void run()
	{
		try
		{
			System.out.println("Addign 1st Element in Queue");
			queue.put("1");
			Thread.sleep(1000);
			System.out.println("Addign 2nd Element in Queue");
			queue.put("2");
			Thread.sleep(1000);
			System.out.println("Addign 3rd Element in Queue");
			queue.put("3");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable
{

	protected BlockingQueue<String> queue = null;

	public Consumer(BlockingQueue<String> queue)
	{
		this.queue = queue;
	}

	public void run()
	{
		try
		{

			System.out.println("Retrieving Element : " + queue.take());

			// System.out.println("Retrieving Element : " + queue.take());
			// System.out.println("Retrieving Element : " + queue.take());
			// System.out.println("Retrieving Element : " + queue.take());
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class VinayPrg2
{

	public static void main(String[] args) throws InterruptedException
	{
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer).start();
		new Thread(consumer).start();

		// Thread.sleep(4000);

	}

}
