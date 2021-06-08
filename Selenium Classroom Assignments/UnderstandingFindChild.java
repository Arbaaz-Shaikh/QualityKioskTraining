package QualityKioskTraining.SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingFindChild {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
	
		D.manage().window().maximize();
		
		List<WebElement>Checkboxes=D.findElementsByName("cars");
		System.out.println(Checkboxes.size());

		
		WebElement DivElement=D.findElementById("checkbox-example");
		List<WebElement>Checkboxes1=DivElement.findElements(By.name("cars"));
		System.out.println(Checkboxes1.size());
	}

}
