package QualityKioskTraining.SeleniumScript;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementExistance_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		D.manage().window().maximize();
		int IsElementExists=0;
		WebElement HideButton=D.findElementById("hide-textbox");
		HideButton.click();
		try 
		{
			WebElement Txt=D.findElementById("displayed-text");
			
		}
		catch(NoSuchElementException E)
		{
			IsElementExists=1;
		}
		if(IsElementExists==1)
			System.out.println("Hide button removed element successfully..PASSED");	
		else
			System.out.println("Hide button did not remove element successfully..FAILED");
		IsElementExists=0;
		WebElement ShowButton=D.findElementById("show-textbox");
		ShowButton.click();
		try 
		{
			WebElement Txt=D.findElementById("displayed-text");
			
		}
		catch(NoSuchElementException E)
		{
			IsElementExists=1;
		}
		if(IsElementExists==0)
		{
			System.out.println("Show button added textbox in the DOM..PASSED");
		}
		else
		{
			System.out.println("Show button did not add textbox in the DOM..FAILED");
		}	
	}

}
