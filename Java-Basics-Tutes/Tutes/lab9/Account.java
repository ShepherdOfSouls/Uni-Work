package lab9;

public class Account 
{
	protected double balance;
	protected String owner;
	protected static final double TRANSACTION_FEE = 1.5;
	protected static double interestRate = 0;
	protected static double dollarToEuroRate = 0.7;
	
	public Account(String name)
	{
		owner = name;
		balance = 0;
	}
	
	public Account(double initialAmount)
	{
		balance = initialAmount;
	}
	
	public void deposit(double amount)
	{
		if (amount >= 0)
		{
			balance = balance + amount;
		}
	}
	
	public void withdraw(double amount)
	{
		double totalToDeduct = amount + TRANSACTION_FEE;
		if (amount >= 0 && amount <= balance)
		{
			balance = balance - totalToDeduct;
		}
	}
	
	public void addInterest()
	{
		balance = balance + balance*interestRate;
	}
	
	public void transferTo(double amount, Account receiver)
	{
		double totalToDeduct = amount + TRANSACTION_FEE;
		
		if(amount >= 0 && totalToDeduct <= balance)
		{
			withdraw(amount);
			receiver.deposit(amount);
		}
	}
	
	public boolean equals(Account otherAccount)
	{
		if (balance == otherAccount.getBalance() && owner.equals(otherAccount.getOwner()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void setInterestRate(double newInterestRate)
	{
		interestRate = newInterestRate;
	}
	
	public static double convertToEuro(double amount)
	{
		double amountInEuro = amount * dollarToEuroRate;
		return amountInEuro;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public static double getTransactionFee()
	{
		return TRANSACTION_FEE;
	}
	
	public static double getInterestRate()
	{
		return interestRate;
	}

}
