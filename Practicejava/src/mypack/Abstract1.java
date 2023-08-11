
 package mypack;
abstract class Demo
{
	private static int num;
	public Demo(int num)
	{
		Demo.num=num;
	}
	abstract void printinfo();
	public static void printnum()
	{
		System.out.println("The number is "+num);
	}
	final void finalmethod() {
		System.out.println("Inside final method");
	}
}
class DemoDerived extends Demo
{
	static int num1;
	static float num2;
	public DemoDerived(int num)
	{
		super(num);
		num1=num;
		num2=num1+num;
	}
	void printinfo()
	{
		System.out.println("Inside Abstract Method");
		System.out.println("Number 1 is "+num1);
		System.out.println("Number 2 is "+num2);
	}
	static {
		System.out.println("Inside static block");
		
	}
}
public class Abstract1 {
	public static void main(String args[])
	{
		DemoDerived d=new DemoDerived(22);
		d.printinfo();
		d.finalmethod();
		Demo.printnum();
	}

}
