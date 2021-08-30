package lab9;

public class AccountWithGivenName {

	public static void main(String[] args) 
	{
		Account[] accounts = makeAccounts();
		String name0 = "Marion";
		String name1 = "Eliza";
		String name2 = "Christine";
		
		String[] names = new String[3];
		names[0] = name0;
		names[1] = name1;
		names[2] = name2;
		
		for (int i = 0; i < names.length; i++)
		{
			Account a = findAccountWithName(accounts, names[i]);
			
			if(a == null)
			{
				System.out.println(names[i] + " does not have an account");
			}
			else
			{
				System.out.println(a.getOwner() + " has $" + a.getBalance());
			}
		}
		

	}
	
	public static Account[] makeAccounts()
	{
		Account a1 = new Account("Michelle");
		Account a2 = new Account("Christine");
		Account a3 = new Account("Albert");
		Account a4 = new Account("Christopher");
		Account a5 = new Account("Eliza");
		Account a6 = new Account("Fiona");
		
		a1.deposit(200);
		a2.deposit(900);
		a3.deposit(400);
		a4.deposit(100);
		a5.deposit(1000);
		a6.deposit(400);
		
		Account[] accounts = new Account[6];
		
		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;
		accounts[3] = a4;
		accounts[4] = a5;
		accounts[5] = a6;
		
		return accounts;
	}
	
	public static Account findAccountWithName(Account[] accounts, String nameToSearchFor)
	{
		for(int i = 0; i < accounts.length; i++)
		{
			if (accounts[i].getOwner().equals(nameToSearchFor))
			{
				return accounts[i];
			}	
		}
		return null;
	}

}
