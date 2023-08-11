package Generic_Package;
import java.util.*;
//public class Generic_Practice {
//	public static void main(String args[])
//	{
// ArrayList<Integer> l1=new ArrayList<>();
// l1.add(1);
// l1.add(2);
// l1.add(3);
// l1.add(4);
// l1.add(5);
// l1.add(6);
// l1.add(2, 77);
// System.out.println(l1);
// l1.remove(1);
// System.out.println(l1);
// System.out.println("List contains 77 "+l1.contains(77));
// System.out.println("List contains 9 "+l1.contains(9));
//}
//}

class MyGeneric<T1,T2>
{
	int val;
	T1 t1;
	T2 t2;
	public MyGeneric(int val,T1 t1,T2 t2)
	{
		this.val=val;
		this.t1=t1;
		this.t2=t2;
	}
	public T1 getT1()
	{
		return t1;
	}
	public T2 getT2()
	{
		return t2;
	}
}
public class Generic_Practice
{
	public static void main(String args[])
	{
		MyGeneric<Integer,String> obj1=new MyGeneric(44,55,"Hello");
		System.out.println(obj1.getT1());
		System.out.println(obj1.getT2());
	}
}
