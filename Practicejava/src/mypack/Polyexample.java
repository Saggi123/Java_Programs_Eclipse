package mypack;
class Parent
{
	public void print()
	{
		System.out.println("Inside Parent class");
	}
}
class subclass1 extends Parent
{
	public void print() {
		System.out.println("Inside Subclass1");
	}
}
class subclass2 extends Parent
{
	public void print() {
		System.out.println("Inside subclass2");
	}
}
public class Polyexample {
	public static void main(String args[])
	{
		Parent p=new subclass1();
		p.print();
		p=new subclass2();
		p.print();
	}

}
