package xyzBank;

public class Current extends Account{
	String accountType = "Current";
	void display() {
		System.out.println("Name : "+ name);
		System.out.println("Address : " + address);
		System.out.println("Account Balance :" + balance);
		System.out.println("Date of Account creation : " + getDate());
		System.out.println("Status : " + status);
		System.out.println("Account Type: " + accountType);
	}
}
