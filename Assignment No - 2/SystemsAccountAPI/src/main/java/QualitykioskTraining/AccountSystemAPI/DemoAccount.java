package QualitykioskTraining.AccountSystemAPI;

public class DemoAccount {

		static AccountMain GetAccountType(String AccountType)
		{
		switch(AccountType)
		{
		case "Saving":
			System.out.println("I am in Saving Accounts Super Method");
		    return new SavingAccount(5,1000);
		    
					
	    case "Salary":
	        System.out.println("I am in Salary Accounts Super Method");
	       	return new SalaryAccount(6);
		}
		return null;
		}

	

}
