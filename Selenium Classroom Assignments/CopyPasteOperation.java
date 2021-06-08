package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement UserNameField=D.findElementById("txtUsername");
		UserNameField.sendKeys("Arbaaz");
		
		Actions Act=new Actions(D);
		Thread.sleep(5000);
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		
		WebElement PasswordField=D.findElementByCssSelector("input[type='password']");
		Thread.sleep(5000);
		Act.keyDown(PasswordField, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	
		String PasswordValue=PasswordField.getAttribute("value");
		if(PasswordValue.equals(""))
			System.out.println("Password field did not allow PASTE operation i.e. Ctrl+v..PASSED");
		else
			System.out.println("Password field  allowed PASTE operation i.e. Ctrl+v..FAILED");
	}

}
