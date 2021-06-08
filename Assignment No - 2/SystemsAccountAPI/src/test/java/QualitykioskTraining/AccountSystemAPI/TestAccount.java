package QualitykioskTraining.AccountSystemAPI;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import QualitykioskTraining.AccountSystemAPI.AccountMain;

public class TestAccount 
{
	
	AccountMain Obj;
	int result;
	@BeforeGroups("RegressionTest")
		public void InitGroup()
	{
		System.out.println("I am in Before class");
		Obj=new AccountMain();	
	}
	@BeforeGroups("SmokeTest")
	public void InitGroup1()
	{
		System.out.println("I am in Before class");
		Obj=new AccountMain();	
	}
	@BeforeClass
	public void Init()
	{
		Obj=new AccountMain();
	}
		
	@BeforeMethod
	public void ReinitialiseResultVar()
	{
		System.out.println("I am in Before Method");
	}
	
	@Test
	public void TestSavingAccountType()
	{
		System.out.println("I am in TestSavingAccountType() TestCase");	
		DemoAccount.GetAccountType("Saving");	
	}
	
	@Test
	public void TestSalaryAccountType()
	{
		System.out.println("I am in TestSalaryAccountType() TestCase");	
		DemoAccount.GetAccountType("Salary");
	}
	
	
	@Test(priority=1,groups= {"RegressionTest"})
	public void TestGetBalanceWithInitialBalance()
	{
		System.out.println("I am in  TestGetBalanceWithInitialBalance() TestCase");
		result=Obj.AccountMain(1,0);
		Assert.assertEquals(result,0,"Balance does not match");
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
	
	@Test
	public void TestDepositeAmount()
	{
		System.out.println("I am in TestDepositeAmount() TestCase");
		Obj.AccountMain(2,0);
		result=Obj.DepositeAmount(2,4000);
		Assert.assertEquals(result,4000,"Balance does not match");		
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
	
	@Test
	public void TestDepositeAmount1()
	{
		System.out.println("I am in TestDepositeAmount1() TestCase");
		Obj.AccountMain(3,0);
		result=Obj.DepositeAmount(3,4000);
		Assert.assertEquals(result,4000,"Balance does not match");		
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
		
	@Test
	public void TestDepositeAmountWithNegativeAmount()
	{
		System.out.println("I am in TestDepositeAmountWithNegativeAmount() TestCase");
		result=Obj.DepositeAmount(2,-200);
		Assert.assertEquals(result,4000,"Negative Amount can not be process..Please Try again");
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
	
	
	@Test(priority=1,groups= {"SmokeTest"})
	public void TestWithdrawAmount()
	{
		System.out.println("I am in TestWithdrawAmount() TestCase");
		Obj.AccountMain(5,0);
		result=Obj.DepositeAmount(5,2000);
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
		result=Obj.WithdrawAmount(5,1000);
		Assert.assertEquals(result,1000,"Balance does not match");
		System.out.println("After Withdraw Amount , Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
	
	
	@Test(priority=2,groups= {"SmokeTest"})
	public void TestWithdrawAmountWithZeroBalance() 
	{
		System.out.println("I am in TestWithdrawAmountWithZeroBalance() TestCase");
		Obj.AccountMain(6,0);
	    Obj.WithdrawAmount(6,1000);
	}
	
	
	@Test(priority=3,groups= {"SmokeTest"})
	public void TestWithdrawAmountWithZNegativeAmount() 
	{
		System.out.println("I am in TestWithdrawAmountWithZNegativeAmount() TestCase");
	    Obj.WithdrawAmount(6,-1000);
	}
	
	@Test(priority=4,groups= {"SmokeTest"})
	public void TestEarnInterest() 
	{
		System.out.println("I am in TestEarnInterest()  TestCase");
		Obj.AccountMain(20,0);
	    result=Obj.EarnInterest(20,5000);
	    Assert.assertEquals(result,5500,"Balance does not match");
	    System.out.println("After Earning Interest , Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());
	}
	
	
	@Test(priority=2,dataProvider="ProvideAccountNumber",groups= {"RegressionTest"})
	public void TestDataDrivenTest(int AccNo,int Amount,int expectedResult)
	{
		System.out.println("I am in TestDataDrivenTest TestCase");
		Obj.AccountMain(AccNo,0);
		result=Obj.DepositeAmount(AccNo,Amount);
		System.out.println("Balance of Account Number "+Obj.Get_AccountNo()+" is:"+Obj.GetBalance());		
		Assert.assertEquals(result,expectedResult,"Balance does not match with account");
	
	}
	
	@DataProvider
	   public Object[][] ProvideAccountNumber()
	   {
		   Object [][] SetOfValues=new Object[3][3];
		   
		   SetOfValues[0][0]=15;
		   SetOfValues[0][1]=2000;
		   SetOfValues[0][2]=2000;
		   
		   SetOfValues[1][0]=16;
		   SetOfValues[1][1]=5000;
		   SetOfValues[1][2]=5000;
		   
		   SetOfValues[2][0]=17;
		   SetOfValues[2][1]=15000;
		   SetOfValues[2][2]=15000;
		   		   
		   return SetOfValues;
		   
	   }
	
	
	
	  @Parameters({"RequestID"})
	  @BeforeSuite
	   public void CreateResultFolder(String RequestID)
	   {
		   System.out.println("I am in  Before Suite");
		 try 
		 {
		    
			 Files.createDirectories(Paths.get("./"+RequestID));
	   
	     }
		 catch(IOException e)
		 {
		    System.out.println("Cannot create directory");	 
		 }
		}
	   @Parameters({"RequestID"})
	   @AfterSuite
	    public void CopyResultFile(String RequestID )
	   { 
		   System.out.println("I am in  After Suite");
		  
		   try{
			   Files.copy(Paths.get("C:\\Users\\Ganesh\\eclipse-workspace\\AccountSystemAPI\\test-output\\emailable-report.html"),Paths.get("./"+RequestID+"/Result1.html"),StandardCopyOption.REPLACE_EXISTING);
		      
		      }
		   catch(IOException e)
		   {
			   System.out.println("Cannot Copy file");
		   }
		   }	
	
}
