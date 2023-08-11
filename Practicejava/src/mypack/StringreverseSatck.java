package mypack;
import java.util.*;
class reverse{
	private String str;
	private String strev="";
	public void setter(String str)
	{
		this.str=str;
	}
	public void Reverse()
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty())
		{
			strev=strev+stack.pop();
		}
	}
	public void sort()
	{
		char [] chararray=new char[str.length()];
		chararray=str.toCharArray();
		int i=0;
		int j=0;
		while(i<chararray.length)
		{
			j=i+1;
			while(j<chararray.length)
			{
				if(chararray[j]<chararray[i])
				{
					char temp=chararray[j];
					chararray[j]=chararray[i];
					chararray[i]=temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(chararray[0]);
		strev= new String(chararray);
	}
	public void sort1()
	{
		char[] chararray=new char[str.length()];
		chararray=str.toCharArray();
		Arrays.sort(chararray);
		strev=new String(chararray);
	}
	public void swap(char char1,char char2)
	{
		char[] chararray=new char[str.length()];
		chararray=str.toCharArray();
		char temp,temp1,temporary;
		int index1=0,index2=0;
		for(int i=0;i<chararray.length;i++)
		{
			if(chararray[i]==char1)
			{
				 temp = chararray[i];
			     index1=i;
			}
			if(chararray[i]==char2)
			{
				temp1=chararray[i];
				index2=i;
			}
		}
		 temporary=chararray[index1];
		 chararray[index1]=chararray[index2];
		 chararray[index2]=temporary;
		 strev=new String(chararray);
	}
	public void Pangram()
	{
		char[] chararray=new char[str.length()];
		str=str.toLowerCase();
		chararray=str.toCharArray();
		Arrays.sort(chararray);
		if(chararray[0]=='a' && chararray[chararray.length-1]=='z' && chararray.length==26)
		{
			System.out.println("The given String is Pangram");
		}
		else
			System.out.println("The given String is not a Pangram");
	}
	public void display()
	{
		System.out.println("Reversed String is "+strev);
	}
}
public class StringreverseSatck {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String");
		String str=sc.next();
		reverse obj=new reverse();
		obj.setter(str);
		obj.sort1();
		obj.display();
		obj.swap('a', 'k');
		obj.display();
		obj.Pangram();
	}
}
