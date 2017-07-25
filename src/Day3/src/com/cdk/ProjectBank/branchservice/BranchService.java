package com.cdk.ProjectBank.branchservice;

public class BranchService extends BankService {
	protected fixedDeposit = 500;
	public void moneyTransfer(){
		System.out.println("Money transfered from account : " + this.accountNo);
	}
	public void fixdeposit(){
		System.out.println("Fixed deposit amount: " + this.fixedeposit);
		}
}	