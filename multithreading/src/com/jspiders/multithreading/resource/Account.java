package com.jspiders.multithreading.resource;

public class Account {
	private double accountBalance;
	public synchronized void deposit(double amount) {
		System.out.println("Amount of rupees" + amount + "has been credited");
		accountBalance += amount;
		System.out.println("current account Balance is " + accountBalance);
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("amount of rupees" + amount + "has been debited");
		accountBalance -=amount;
		System.out.println("current account balance is " + accountBalance);
	}

}
