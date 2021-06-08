package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHintText {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			ChromeDriver D=new ChromeDriver();
			D.get("https://letskodeit.teachable.com/p/practice");
			
			WebElement Name=D.findElementByName("enter-name");
			String Hinttext=Name.getAttribute("placeholder");
			
			if (Hinttext.equals("Enter Your Name"))
				System.out.println("Correct hintext is shown...PASSED");
			else
				System.out.println("Correct hintext is Not shown...FAILED");
			
		
	}

}
