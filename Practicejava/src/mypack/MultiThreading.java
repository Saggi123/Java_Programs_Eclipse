//package mypack;
//class Multithread extends Thread
//{
//	private int threadnumber;
//	public void setter( int threadnumber)
//	{
//		this.threadnumber=threadnumber;
//	}
//	public void run()
//	{
//		if(threadnumber==3)
//			throw new RuntimeException();
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("From "+threadnumber+"-"+i);
//		}
//		try
//		{
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e)
//		{}
//	}
//}
//public class MultiThreading {
//	public static void main(String args[])
//	{
//		for(int i=0;i<5;i++)
//		{
//		Multithread mythread=new Multithread();
//		mythread.setter(i);
//		mythread.start();
//		try {
//			mythread.join();
//		}
//		catch(InterruptedException e)
//		{}
//		}
//		}
//	}
package mypack;
class Multithread implements Runnable
{
	private int threadnumber;
	public void setter( int threadnumber)
	{
		this.threadnumber=threadnumber;
	}
	public void run()
	{
		if(threadnumber==3)
			throw new RuntimeException();
		for(int i=0;i<5;i++)
		{
			System.out.println("From "+threadnumber+"-"+i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
	}
}
public class MultiThreading {
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
		Multithread thread1=new Multithread();
		Thread mythread=new Thread(thread1);
		thread1.setter(i);
		mythread.start();
		try {
			mythread.join();
		}
		catch(InterruptedException e)
		{}
		}
		}
}
	
