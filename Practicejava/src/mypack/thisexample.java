package mypack;

//Constructor Chaining

public class thisexample {
	int a;
	int b;
	static int c;
	public thisexample(int a ,int b,int c)
	{
		this.a=a;
		this.b=b;
		thisexample.c=c;
	}
	public thisexample()
	{
		this(10,20,30);
	}
	public static void display(thisexample obj)
	{
		
		System.out.println("A= "+obj.a+",B= "+obj.b);
		c=obj.a+obj.b;
		System.out.println("C= "+c);
	}
	public void display1(thisexample obj2)
	{
		System.out.println(this.a);
		System.out.println(obj2.a);
		System.out.println(this.a+obj2.a);
	}
	public static void main(String args[])
	{
		thisexample obj1=new thisexample();
//		thisexample.display(obj1);
		thisexample obj3=new thisexample(30,100,110);
		obj1.display1(obj3);
	}
}
