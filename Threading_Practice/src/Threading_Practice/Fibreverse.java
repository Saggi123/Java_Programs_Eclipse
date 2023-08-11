package Threading_Practice;
 import java.io.*;
class Fibonacci extends Thread
{
	public void run() 
	{
		try
		{
			int n=10,a=0,b=1,c=0;
//			System.out.println("Enter The number of fibonnaci terms you want");
//			InputStreamReader isr=new InputStreamReader(System.in);
//			BufferedReader br=new BufferedReader(isr);
//			n=Integer.parseInt(br.readLine());
			System.out.print(a+"");
			n--;
			System.out.print(b+"");
			n--;
			while(n>0)
			{
				 c=a+b;
				System.out.print(c+"");
				a=b;b=c;
				n--;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
class Reverse extends Thread
{
	public void run()
	{
		try
		{
			int n=10;
//			System.out.println("Enter The number till which you want a reversed series");
//			InputStreamReader isr=new InputStreamReader(System.in);
//			BufferedReader br=new BufferedReader(isr);
//			n=Integer.parseInt(br.readLine());
			while(n>=0)
			{
				System.out.print(n);
				n--;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
public class Fibreverse {
	public static void main(String args[]) throws InterruptedException
	{
	Fibonacci obj1=new Fibonacci();
    Reverse obj2=new Reverse();
    obj1.start();
    Fibonacci.sleep(4000);
    obj2.start();
	}
}
