package com.github.perschola;

public class Account {
	private double balance;
	
	public Account() {
		balance = 50.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}

}
