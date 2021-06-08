package QualityKioskTraining.UnitTestingAssignmnt;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ArbaazConcatenateTest 
{

	ArbaazConcatString Obj= new ArbaazConcatString();       //Object of Class containing Concat function
	String Result;
	
	@BeforeGroups("RegressionTest")                         //Before Groups & Regression Test
	public void init()
	{
		System.out.println("I am in Before Group");
		//Obj=new ArbaazConcatString();	
	}
	
	@BeforeClass                                          //Before Class
	public void Init()
	{
		System.out.println("I am in Before class");
		//Obj=new ArbaazConcatString();
	}
	@BeforeMethod
	public void ResReinitialise()                        //Before Method
	{
		System.out.println("I am in Before Method");
		Result = null;
	}
	
	@Test(priority=1,groups= {"RegressionTest"})         //Priority is 1 & Regression test applied
	public void TestConcatenateString()
	{
		System.out.println("Test case 1 ");
		 
		String str1,str2;
		
		
		
//		Scanner sc = new Scanner(System.in);                 //Input from user for both strings BUT DOES NOT WORK WITH TERMINAL!!!!!!!!
//	    System.out.println("Enter the 1st string");
//		str1=sc.nextLine();
//		System.out.println("Enter the 2nd string");
//		 str2=sc.nextLine();
		 
		Result = Obj.Concatenate(str1="ARBAAZ SHAIKH",str2="WORKS AT QUALITYKIOSK");                   //concatenate object
		Assert.assertEquals(Result,str1+" "+str2,"Concatenate does not work with Strings");     //Testng Assert function
		System.out.println(Result);
	}
	
	@AfterClass                           
	public void Teardown()                                    //After Class object set to null
	{
		System.out.println("I am in After Class");
		Obj = null;
	}
	
	@BeforeSuite
	   public void ResultFolder()                            //before suite for create a folder to save our report
	   {
		   System.out.println("I am in  Before Suite");
		 try 
		 {
		    
			 Files.createDirectory(Paths.get("./Res1"));
	   
	     }
		 catch(IOException e)
		 {
		    System.out.println("It is Not able to create directory");	 
		 }
		}
	   
	   @AfterSuite
	    public void ResultFile()                                  //After suite rewrites the report 
	   { 
		   System.out.println("I am in  After Suite");
		  
		   try{
			   Files.copy(Paths.get("C:\\Users\\Ganesh\\eclipse-workspace\\UnitTestingAssignmnt\\test-output\\emailable-report.html"),Paths.get("./Res1/Res.html"),StandardCopyOption.REPLACE_EXISTING);
		      
		      }
		   catch(IOException e)
		   {
			   System.out.println("Couldnt Copy file");
		   }
		   }
}