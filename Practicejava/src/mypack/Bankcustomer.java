package mypack;
import java.util.*;

interface Account {
    void Account_details();
    void CustomerDetails();
    static void Welcome() {
        System.out.println("Welcome to Swiss bank");
    }
}

interface deposit extends Account {
    void depositamount(int amt);
}

interface withdraw extends Account {
    void withdraw_amount(int value);
}

class operations implements deposit, withdraw {
    private long account_number;
    private String cust_name;
    int starting_balance=0;
    Scanner sc = new Scanner(System.in);
    public void get_details()
    {
    	System.out.println("Enter your account number");
    	account_number=sc.nextLong();
    	System.out.println("Enter your name");
    	cust_name=sc.next();
    }
    public void Account_details() {
        // Implementation for Account_details
    	System.out.println("Account Number- "+account_number);
    	System.out.println("Available Balance- "+starting_balance);
    }

    public void CustomerDetails() {
        // Implementation for CustomerDetails
    	System.out.println("Customer Name- "+cust_name);
    }

    public void depositamount(int amt) {
        // Implementation for deposit amount
    	starting_balance+=amt;
    	System.out.println("After Deposit");
    	this.Account_details();
    }

    public void withdraw_amount(int value) {
        // Implementation for withdraw_amount
    	if(starting_balance<value)
    		System.out.println("Balance is not sufficient");
    	else
    		starting_balance-=value;
    	System.out.println("After withdraw");
    	this.Account_details();
    }
}

public class Bankcustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rest of your code
        operations obj=new operations();
        obj.get_details();
        obj.Account_details();
        obj.CustomerDetails();
        obj.depositamount(500);
        obj.withdraw_amount(200);
        
    }
}
