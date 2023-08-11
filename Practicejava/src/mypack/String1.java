package mypack;
import java.util.*;
class charAtindex
{
	private String str;
	public void setter(String str)
	{
		this.str=str;
	}
	public char getter(int index)
	{
		char s=str.charAt(index);
		return s;
	}
	public String replace(char char1,char char2)
	{
		str=str.replace(char1, char2);
		return str;
		
	}
	public String reverse()
	{
		String strrev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev=strrev+str.charAt(i);
		}
		return strrev;
		
	}
}
public class String1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		System.out.println("Enter the index whose character you want");
		int index=sc.nextInt();
		charAtindex obj=new charAtindex();
		obj.setter(str);
		char ch=obj.getter(index);
		str=obj.replace('a','k');
		String strev=obj.reverse();
		System.out.println("The character is "+ch);
		System.out.println("The String after replace is "+str);
		System.out.println("The reversed String is "+strev);
	}

}
