 package mypack;
 import java.util.*;
 interface Account
 {
	 void Account_Details();
	 void Customer_Details();
	 static void message()
	 {
		 System.out.println("Welcome to Swiss Bank");
	 }
	 interface message
	 {
		 void message1();
	 }
 }
 interface deposit extends Account
 {
	 void deposit_amount(int amt);
 }
 interface withdraw extends Account
 {
	 void withdraw_amount(int amt);
 }
 class Operations implements deposit,withdraw,Account.message
 {
	 private long Account_Number=0;
	 private String Customer_Name="";
	 int starting_balance=0;
	 public void get_details()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter you Name");
		 Customer_Name=sc.nextLine();
		 System.out.println("Enter Your Account Number");
		 Account_Number=sc.nextInt();
	 }
	 public void Account_Details()
 }
public class interfaceex {

}
