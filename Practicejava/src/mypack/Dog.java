package mypack;
import java.util.*;

class Dogattributes
{
	private String name;
	private String color;
	private String breed;
	private int age;
	public Dogattributes(String name,String color,String breed,int age)
	{
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public String getcolor()
	{
		return color;
	}
	public String breed()
	{
		return breed;
	}
	public int age()
	{
		return age;
	}
	
}
public class Dog {
	public static void main(String args[])
	{
		Dogattributes d1=new Dogattributes("Missy","Brown","Golden Retriever",9);
		System.out.println("The name of the dog is "+d1.getname());
		System.out.println("The color of the dog is "+d1.getcolor());
		System.out.println("The breed of the dog is "+d1.breed());
		System.out.println("The age of the dog is "+d1.age());
	}
}
