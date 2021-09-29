package xyzBank;

import java.util.Scanner;

public class BankAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int flag = 1;
		do {
			System.out.println("Enter First name");
			String firstName = scnr.next();
			System.out.print("Enter Last name");
			String lastName = scnr.next();
			System.out.print("Enter city");
			String city = scnr.next();
			System.out.print("Enter state");
			String state = scnr.next();
			System.out.print("Enter pin");
			String pin = scnr.next();
			int balance = scnr.nextInt();
			System.out.println("What type of account do you want?");
			System.out.println("1. Savings");
			System.out.println("2. Current");
			int i = scnr.nextInt();
			switch (i) {
			case 1:
				Savings savingsAcc = new Savings();
				savingsAcc.getOwnerName(firstName, lastName);
				savingsAcc.getAddress(city, state, pin);
				savingsAcc.getBalance(balance);
				savingsAcc.display();
				int choice;
				do {
					choice  = scnr.nextInt();
					System.out.println("select 1. Withdraw    2. Deposit   3.Exit");
					if(choice == 1) {
						int amountWithdraw = scnr.nextInt();
						savingsAcc.withdraw(amountWithdraw);
					}
					else if(choice == 2) {
						int amountDeposit = scnr.nextInt();
						savingsAcc.deposit(amountDeposit);
					}
				}while(choice == 1 || choice == 2);
				break;
			case 2:
				Current currentAcc = new Current();
				currentAcc.getOwnerName(firstName, lastName);
				currentAcc.getAddress(city, state, pin);
				currentAcc.getBalance(balance);
				currentAcc.display();
				do {
					System.out.println("select 1. Withdraw    2. Deposit   3.Exit");
					choice = scnr.nextInt();
					if(choice == 1) {
						int amountWithdraw = scnr.nextInt();
						currentAcc.withdraw(amountWithdraw);
					}
					else if(choice == 2) {
						int amountDeposit = scnr.nextInt();
						currentAcc.deposit(amountDeposit);
					}
				}while(choice == 1 || choice == 2);
				break;
			}
			System.out.println("do you want to created another account? enter 1 for yes and 0 for no");
			flag = scnr.nextInt();
		} while (flag == 1);
		scnr.close();
	}

}
