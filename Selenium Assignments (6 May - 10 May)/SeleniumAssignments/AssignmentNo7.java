/*

 Assignment Number 7:
	
Identify td showing CompanyName from country UK,
retrieve company name and print it on console

 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class AssignmentNo7 {
	public static void main(String[] args) {


		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement companyName = driver.findElementByXPath("//table//td[text()='UK']/preceding-sibling::td[last()]");
		System.out.print("Company Name from country UK : ");
		System.out.println(companyName.getText());
		driver.quit();

	}
}
