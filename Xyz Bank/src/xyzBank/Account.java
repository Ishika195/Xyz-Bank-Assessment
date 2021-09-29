package xyzBank;

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Account {
	protected StringBuilder name;
	protected StringBuilder address;
	protected int balance;
	protected Date dateCreated = new Date();
	protected String status="ACTIVE";
	
	void getOwnerName(String fname,String lname) {
		StringBuilder firstName = new StringBuilder(fname);
		StringBuilder lastName = new StringBuilder(lname);
		name = firstName.append(" "+lastName);
	}
	void getAddress(String c,String s,String p) {
		StringBuilder city = new StringBuilder(c);
		StringBuilder state = new StringBuilder(s);
		StringBuilder pin = new StringBuilder(p);
		address = city.append(","+state.append(","+pin));
	}
	void getBalance(int b) {
		balance = b;
	}
	String getDate() {
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
	      String date = ft.format(dateCreated);
	      return date;
	}
	int deposit(int amountDeposit) {
		balance += amountDeposit;
		System.out.println("Available Balance : "+ balance);
		return balance;
	}
	int withdraw(int amountWithdraw) {
		if(amountWithdraw>balance) {
			System.out.println("you don't have sufficient balance in your account");
		}
		else {
			balance -=amountWithdraw;
		}
		System.out.println("Available Balance : "+ balance);
		return balance;
	}
}
