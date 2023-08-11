package mypack;
import java.util.*;
class RevSort
{
	private String str="";
	private String strsort="";
	private String strrev="";
	public void setter(String str)
	{
		this.str=str; 
	}
	public void sortnormal()
	{
		char[]chararray=new char[strsort.length()];
		chararray=str.toCharArray();
		int i=0;
		int j=0;
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(chararray[j]>chararray[i])
				{
					char temp=chararray[j];
					chararray[j]=chararray[i];
					chararray[i]=temp;
				}
			}
		}
		strsort=new String(chararray);
		System.out.println(strsort);
	}
	public void sortarray()
	{
		char[]chararray=new char[str.length()];
		chararray=str.toCharArray();
		Arrays.sort(chararray);
		strsort=new String(chararray);
		System.out.println(strsort);
	}
	public void reverse()
	{
		char[]chararray=new char[str.length()];
		chararray=str.toCharArray();
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			s.push(chararray[i]);
		}
		int i=0;
		while(s.isEmpty()!=true)
		{
			chararray[i++]=s.pop();
		}
		strrev=new String(chararray);
		System.out.println(strrev);
	}
	public void swap()
	{
		char[]chararray=new char[str.length()];
		chararray=str.toCharArray();
		int length=str.length();
		for(int i=0;i<length-(length%2);i=i+2)
		{
			char temp=chararray[i];
			chararray[i]=chararray[i+1];
			chararray[i+1]=temp;
		}
		str=new String(chararray);
		System.out.println(str);
	}
	public boolean Pangram()
	{
		int[]freqarray=new int[26];
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				int index=str.charAt(i)-'a';
				freqarray[index]+=1;
			}
		}
		for(int i=0;i<freqarray.length;i++)
		{
			if(freqarray[i]==0)
				return false;
		}
		return true;
	}
	public void wordlength()
	{
		String[]words=str.split(" ");
		System.out.println(words[2]);
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()%2==0)
				System.out.println(words[i]);
		}
	}
}
public class ReverseandSort {
	public static void main(String args[])
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String");
		str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Enter The String you want to append");
		String str1=sc.nextLine();
		sb.insert(4,str1);
		System.out.println(sb);
	}

}
