package mypack;

 class Genericex1 <T1,T2>{

	private T1 value1;
	private T2 value2;
	public void setter(T1 value1,T2 value2)
	{
		this.value1=value1;
		this.value2=value2;
	}
	public void display()
	{
		System.out.println("Value1= "+value1);
		System.out.println("Value2= "+value2);
	}
	
}
public class Genericex{
	public static void main(String args[])
	{
		Genericex1<Integer,Integer> obj=new Genericex1<>();
		obj.setter(20, "Hello");
		obj.display();
	}
}
