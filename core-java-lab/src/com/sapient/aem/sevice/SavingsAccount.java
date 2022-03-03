package com.sapient.aem.sevice;

public class SavingsAccount extends Account{
	public static final Double MIN_BALANCE = 500.0;


	public SavingsAccount() {
		
	}	
		

	public SavingsAccount(Double balance, Person accHolder) {
		super(balance, accHolder);		
	}


	@Override
	public void withdraw(double amount) {
		if(this.getBalance()<MIN_BALANCE) {
			System.out.println("Insufficient Funds. Minimum balance of Rs. 500 to be maintained");
		}else if( (this.getBalance() -amount) < 500) {
			System.out.println("Cannot withdraw more than "+ (this.getBalance()-500) );
		}else {
			//this.balance=this.balance-amount;
			this.setBalance(this.getBalance()-amount);
		}

	}

	

}
