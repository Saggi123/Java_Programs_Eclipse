 package mypack;
abstract class shape
{
	 int length;
	 int breadth;
	 int side;
	shape(int side)
	{
		this.side=side;
	}
	shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	abstract void CalculateArea();
	public void message()
	{
		System.out.println("Hello World");
	}
}
class Rectangle extends shape
{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	void CalculateArea()
	{
		int area=length*breadth;
		System.out.println(area);
	}
}
class Square extends shape
{
	Square(int side)
	{
		super(side);
	}
	void CalculateArea()
	{
		int area=side*side;
		System.out.println(area);
	}
}
public class Abstractex {
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle(10,20);
		obj.CalculateArea();
		Square obj1=new Square(20);
		obj1.CalculateArea();
		Rectangle obj2=new Rectangle(10,10);
		obj2.CalculateArea();
		obj2.message();
	}
}
