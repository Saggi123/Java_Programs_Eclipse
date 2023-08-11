package mypack;
interface show
{
	void show1();
	interface message{
		void message1();
	}
	
}
public class nestedinterfaceex implements show.message {
	public void message1()
	{
		System.out.println("This is message1");
	}
	public void show1()
	{
		System.out.println("This is show1");
	}
	public static void main(String args[])
	{
		nestedinterfaceex obj=new nestedinterfaceex();
		obj.show1();
		obj.message1();
	}

}
