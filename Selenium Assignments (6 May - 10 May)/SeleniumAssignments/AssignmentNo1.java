/*
 
Assignment Number 1:
Enter name in "Enter Your Name" field.Click on Confirm button.Check value entered in the field
indeed exists in the message shown by confirmation window.Close confirmation window by clicking on No button

*/



package SeleniumAssignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo1 {
	public static void main(String[] args){

		

		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		

		WebElement name = driver.findElementById("name");
		String Name = "ARBAAZ";
		name.sendKeys(Name);
		

		WebElement confirmBtn = driver.findElementById("confirmbtn");
		confirmBtn.click();
		
	
		Alert confirmationWindow =driver.switchTo().alert();
		String message = confirmationWindow.getText();
		
		
		if(message.contains(Name)) 
		{
			System.out.println("Entered name is showing in confirmation window message...PASSED");
		}
		else 
		{
			System.out.println("Entered name is not showing in confirmation window message...FAILED");
		}

		
		confirmationWindow.dismiss();
		
		
		driver.quit();
	}

}
