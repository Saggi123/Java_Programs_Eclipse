package Threading_Practice;
import java.io.*;
class Thread1 extends Thread
{
	public Thread1(String name)
	{
		super(name);
	}
	public void run()
	{
		while(true)
			System.out.println("Hello Thread1");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		
		while(true)
			System.out.println("Hello Thread2");
	}
}
public class FirstThread {
	public static void main(String args[])
	{
	Thread1 t1=new Thread1("Sagnik");
	Thread2 t2=new Thread2();
	System.out.println(t1.getName());
	t1.setPriority(3);
	t2.setPriority(5);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority()); 
//	t1.start();
//	t2.start();  
}
}	
//class Thread1 implements Runnable
//{
//	public void run()
//	{
//		while(true)
//			System.out.println("Hello Thread1");
//	}
//}
//class Thread2 implements Runnable
//{
//	public void run()
//	{
//		
//		while(true)
//			System.out.println("Hello Thread2");
//	}
//}
//public class FirstThread {
//public static void main(String args[])
//{
//Thread1 t1=new Thread1();
//Thread2 t2=new Thread2();
//Thread t3=new Thread(t1);
//Thread t4=new Thread(t2);
//t3.setPriority(2);
//t4.setPriority(7);
//System.out.println(t3.getPriority());
//System.out.println(t4.getPriority());
//System.out.println(t3.getState());
//System.out.println(t3.getId());
//System.out.println(t4.getId());
////t3.start();
////t4.start();  
//}
//}	
