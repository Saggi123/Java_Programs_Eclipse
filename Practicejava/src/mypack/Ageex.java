package mypack;

public class Ageex {
	public static void main(String args[]) throws Agelessthanexception
	{
		try
		{
		checkage(-2);
		}
		catch(Agelessthanexception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest");
	}
public static void checkage(int age) throws Agelessthanexception
{
	
	if(age<0)
		throw new Agelessthanexception("Age cannot be less than 0");
	else if(age<18)
		throw new Agelessthanexception("Age cannot be less than 18");

}
}
