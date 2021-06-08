package QualityKioskTraining.SeleniumScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingExistenceofElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
	
		D.manage().window().maximize();
	
		WebElement HideButton=D.findElementById("hide-textbox");
		HideButton.click();
		
		List<WebElement>Lst=D.findElementsById("displayed-text");
		if(Lst.size()==0)
			System.out.println("Element got removed from DOM after clicking on Hide button..PASSED");
		else
			System.out.println("Element did not get removed from DOM after clicking on Hide button..FAILED");
			
		
		WebElement ShowButton=D.findElementById("show-textbox");
		ShowButton.click();
		
		Lst=D.findElementsById("displayed-text");
		if(Lst.size()==1)
			System.out.println("After clicking on Show button,element got added back in DOM..PASSED");
		else
			System.out.println("After clicking on Show button,element did not gtt added back in DOM..FAILED");
	}

}
