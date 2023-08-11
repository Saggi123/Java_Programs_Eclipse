package Exception_Package;
import java.util.Scanner;
//public class Exception1 {
//
//	public static void main(String args[])
//	{
//		int [] marks=new int[5];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Enter Marks "+(i+1));
//			marks[i]=sc.nextInt();
//		}
//		System.out.println("Enter The number whose marks you want to access");
//		int index=sc.nextInt();
//		System.out.println("Enter The nuber you want to divide the marks with");
//		int num=sc.nextInt();
//		try
//		{
//			System.out.println("The Marks at the given index is "+marks[index]);
//			System.out.println("The required result is "+marks[index]/num);
//		}
//		catch(ArrayIndexOutOfBoundsException e )
//		{
//			System.out.println("You are trying to access an invalid array index");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("You cannot divide the marks by zero");
//		}
//	}
//}
public class Exception1
{
	public static void main(String args[])
	{
		boolean flag=true;
		int [] marks=new int[5];
		int index = 0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter marks "+(i+1));
			marks[i]=sc.nextInt();
		}
		while(flag)
		{
			System.out.println("Enter the index whose mark you want to acess");
			 index=sc.nextInt();
				try
				{
					System.out.println("The marks at the specified index is "+marks[index]);
					flag=false;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("You are trying to access an invalid index position");
				}
		}		
				flag=true;
				while(flag) {
					try {
				System.out.println("Enter the number you want to divide the number with");
				int num=sc.nextInt();
				System.out.println("The result is "+(marks[index]/num));
				flag=false;
					}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero not possible");
				}
		
			
		}
	
		
	}
}
