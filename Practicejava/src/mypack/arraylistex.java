package mypack;
import java.util.*;
public class arraylistex {
	public static void main(String args[])
	{
		ArrayList<Integer>L1=new ArrayList<>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(4);
		L1.add(5);
		L1.add(6);
		L1.add(1,66);
		ArrayList<Integer>L2=new ArrayList<>(5);
		L2.add(11);
		L2.add(22);
		L2.add(33);
		L2.add(44);
		L2.add(55);
		L2.ensureCapacity(7);
		L2.add(77);
		L2.add(88);
		L2.add(99);
		L1.addAll(3, L2);
		for(int i=0;i<L1.size();i++)
		{
			System.out.print(L1.get(i)+" ");
		}
	}
}
