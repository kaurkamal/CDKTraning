package com.cdk.ProjectBank.bankservice;

public class BankService extends AccountService {
	protected int savingAmount = 2000;
 	public String loanIntrest = "5%";
	public void checkAccount(){
		System.out.println("Enter other info and check account");
		System.out.println("your account no is : " + this.accountNo);
	}
	public void savingAccount(){
		System.out.println("Enter info and check saving");
		System.out.println("Saving amount is : " + this.savingAmount);
	}
	public void loan() {
		System.out.println("loan intrest is : " + this.loanIntrest);
	}
	
}
	