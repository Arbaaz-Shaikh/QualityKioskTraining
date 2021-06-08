/*

 Assignment Number 2:
	
 Click TryIt button.Once prompt alert will be shown,
 enter Name in the edit field of prompt box. and close the alert


 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo2 {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();

		
		driver.switchTo().frame("iframeResult");
		WebElement tryItBtn = driver.findElementByTagName("button");
		tryItBtn.click();
		
		String name = "ARBAAZ";
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		
		WebElement demoText = driver.findElementById("demo");
		String text = demoText.getText();
		
		if(text.contains(name)) {
			System.out.println("Entered Name is in Edit Box of Alert....PASSED");
		}else {
			System.out.println("Entered Name is not in Edit Box of Alert....FAILED");
		}
		
		driver.quit();
	}

}
