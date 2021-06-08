/*

 Assignment Number 4:
	
 Open page using script and confirm that Click Me! button is DISABLED


 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentNo4 
{
public static void main(String[] args) {
		
		
		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		driver.manage().window().maximize();

	
		driver.switchTo().frame("iframeResult");
		WebElement btn = driver.findElementByTagName("button");
		
	
		if(!btn.isEnabled())
		{
			System.out.println("Button is Disabled....PASSED");
		}else 
		{
			System.out.println("Button is enabled....FAILED");
		}
		
		driver.quit();
		
}
}