package Exception_Package;
 class invalidageexception extends Exception
 {
//	 public invalidageexception(String message)
//	 {
//		 super(message);
//	 }
	 public String getMessage()
	 {
		 return "invalid age";
	 }
	 public String toString()
	 {
		 return "Age should be greater than 18";
	 }
 }
 
 public class customexception
 {
	 public static void main(String args[]) 
	 {
		 validateage(9);
		 validateage(-8);
		 
	 }
	 	 public static void validateage(int age)
	 {
		 if(age<0)
		 {
			 try
			 {
				 throw new invalidageexception();
			 }
			 catch(invalidageexception e)
			 {
				System.out.println (e.getMessage());
			 }
			 finally
			 {
				 System.out.println("Hello I am finally 1");
			 }
		 }
		 else if(age<18)
		 {
			 try
			 {
				 throw new invalidageexception();
			 }
			 catch(invalidageexception e)
			 {
				System.out.println(e.toString());
			 }
			 finally {
				 System.out.println("I am finally 2");
			 }
		 }
	 }
	 }
	 
 