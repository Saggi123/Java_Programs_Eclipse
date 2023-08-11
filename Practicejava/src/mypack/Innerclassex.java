package mypack;

public class Innerclassex {
	String str="Hello ";
public void message()
{
	System.out.println("Hello this is Innerclassex");
}
 static class Insideclass
 {
	 public void message1(Innerclassex obj)
	 {
		 System.out.print(obj.str);
		 System.out.println("Inside class");
	 }
 }
 public static void main(String args[])
 {
	 Innerclassex obj=new Innerclassex();
	 Innerclassex.Insideclass obj1=new Innerclassex.Insideclass();
	 obj1.message1(obj);
	 obj.message();
 }
}
