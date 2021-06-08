package QualitykioskTraining.AccountSystemAPI;

public  class AccountMain 
{

	static final int Interest=10;	
	protected int AcntNo;
	protected int Balance;
	
	public AccountMain()

	{}
	public AccountMain(int AccntNo)
	{
		this.AcntNo=AccntNo;
	}
	public AccountMain(int AccNo,int Bal)
	{
		this.AcntNo=AccNo;
		this.Balance=Bal;
	}

	public int AccountMain(int AccNo,int Bal)
	{
		this.AcntNo=AccNo;
		Balance=Bal;
		return Balance;
	}
	
	public void OpenAccount()
	{
		
	}
	
	public int DepositeAmount(int AccNo,int Amount)
	{
		if(Amount>0)
		{		
			this.AcntNo=AccNo;
			this.Balance=Balance+Amount;
			return Balance;
			
		}
		else
		{
		 System.out.println("Invalid Amount");   
		}
		return Balance;
		
	}
	public double GetBalance()
	{
		return Balance;
	}

	public int WithdrawAmount(int AccountNo,int Amount)
	{
		this.AcntNo=AccountNo;
		if(Balance<Amount)
			{
			System.out.println("Balance is less than Amount");
			}
			Balance=Balance-Amount;
			return Balance;
			
	}
	
	public int Get_AccountNo()
	{
		return AcntNo;
	}

	public int EarnInterest(int AccNo,int Bal)
	{
		this.AcntNo=AccNo;
		this.Balance=Bal;
		
		int InterestEarned=(Balance*Interest)/100;
		Balance=Balance+InterestEarned;
		return Balance;
	}
}
