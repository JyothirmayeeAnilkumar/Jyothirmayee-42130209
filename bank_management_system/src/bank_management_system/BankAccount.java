package bank_management_system;
import java.util.*;

public class BankAccount {
	private String accountholder;
	private double balance;
	private ArrayList<String>transactions;
	
	public BankAccount(String accountholder) 
	{
		this.accountholder=accountholder;
		this.balance=0.0;
		this.transactions=new ArrayList<>();
		transactions.add("Account created with balance:Rs 0");	
	}
	
	//DEPOSIT METHOD
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			transactions.add("Deposited: Rs"+amount+",New Balance: Rs"+balance);
			System.out.println("Successfully deposited Rs"+amount);
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}
	
	//WITHDRAW METHOD
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			transactions.add("withdraw: rs"+amount+"New Balance: Rs"+balance);
			System.out.println("Successfull withdraw "+amount);
		}
		else
		{
			System.out.println("Invalid withdraw amount");
	
		}
	}
	
	//CHECK BALANCE
	public void balance()
	{
		System.out.println("Balance Rs"+balance);
	}
	
	//TRANSACTION HISTORY
	public void transactionhistory()
	{
		System.out.println("Transaction History\n");
		for(String transactions:transactions)
		{
			System.out.println(transactions);
		}
	}
	
	
	 

	

}
