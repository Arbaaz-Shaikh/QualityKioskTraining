package QualitykioskTraining.AccountSystemAPI;

public class SavingAccount extends AccountMain
{
	public SavingAccount(int ActNo,int Balance)
	{	
	    super(ActNo,Balance);
	    System.out.println("Submit Required docs.");
	    System.out.println("Account will be opened in 48 hours.");
	}

}
