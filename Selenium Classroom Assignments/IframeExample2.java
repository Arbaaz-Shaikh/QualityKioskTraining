package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		D.manage().window().maximize();
		
		D.switchTo().frame("courses-iframe");
		
		WebElement NavigationBar=D.findElementByClassName("navbar-toggle");
		NavigationBar.click();
		
		Thread.sleep(5000);
		WebElement LoginLink=D.findElementByPartialLinkText("Login");
		LoginLink.click();
		
	}

}
