package mypack;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsex {
	public static void main(String args[]) throws FileNotFoundException
	{
		try {
		readFile("Hello");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		System.out.println("Rest");
	}
	private static void readFile(String filename) throws FileNotFoundException //throws FileNotFoundException
	{
		try
		{
		FileReader myfile=new FileReader(filename);
		}
		catch(Exception e)
		{
			throw new FileNotFoundException("No File");
		}
	}

}
