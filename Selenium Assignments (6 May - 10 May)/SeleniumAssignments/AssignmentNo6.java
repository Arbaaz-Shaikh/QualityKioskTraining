/*

 Assignment Number 6:
	
 Identify td element showing Savings of month February,retrieve the savings
 value and print on console


 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentNo6 
{
	public static void main(String[] args)
	{

		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test");
		driver.manage().window().maximize();
		

		driver.switchTo().frame("iframeResult");
		WebElement FebSavings = driver.findElementByXPath("//table//td[text()='February']/following-sibling::td");
		
	
		System.out.print("Savings of MARCH : ");
		System.out.print(FebSavings.getText());
	}

}
