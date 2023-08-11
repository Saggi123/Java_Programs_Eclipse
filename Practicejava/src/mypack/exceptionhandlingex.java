package mypack;
class ExceptionHandling{
	public void getInt()
	{
// 		int mynumber=Integer.parseInt("Hello");
		int mynumber=25/5;
		System.out.println(mynumber);
	}
	public void getInt2()
	{
//		int mynumber2=4/2;
		int mynumber2=Integer.parseInt("Hello");
		System.out.println(mynumber2);
	}
}
public class exceptionhandlingex {
	public static void main(String args[])
	{
		ExceptionHandling obj=new ExceptionHandling();
		try//Inner catch block won't service this try block
		{
			obj.getInt();
			try {  // if inner catch block does not service this try block it will move to outer catch block
				obj.getInt2();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inside Arithmetic Exception");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception");

		}
		catch(Exception e)
		{
			System.out.println("Inside Exception Block");
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Rest of Code");
	}
}
