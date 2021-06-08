/*

 Assignment Number 8:
	
Enter your name in FirstName field.Select entered value using Ctr1 a,copy
using ctrl c and paste it in LastName field using Ctrl v


 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AssignmentNo8 {
	public static void main(String[] args) {


		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement firstName = driver.findElementById("fname");
		WebElement lastName = driver.findElementById("lname");
		
		String name = "ARBAAZ";
		
	
		firstName.sendKeys(name);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		actions.keyDown(lastName, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		String actualName = lastName.getAttribute("value");
		if(actualName.equals(name))
		{
			System.out.println("Copy Paste Operation performed correctly.......");
		}
		else 
		{
			System.out.println("Copy Paste Operation Not performed correctly.......");
		}
		driver.quit();
	}

}
