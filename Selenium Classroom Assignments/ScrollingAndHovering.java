package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAndHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement HoverButton=D.findElementById("mousehover");
		
		//D.executeScript("arguments[0].scrollIntoView();", HoverButton);  //Top alignment
		///D.executeScript("arguments[0].scrollIntoView(false);", HoverButton);	//Bottom alignment
		
		
		
		D.executeScript("arguments[0].scrollIntoView({block: \"center\", inline: \"center\"});", HoverButton);	//Center alignment
		Thread.sleep(5000);
		
		Actions Act=new Actions(D);

		Act.moveToElement(HoverButton).perform();
		
		Thread.sleep(5000);
		
		D.findElementByLinkText("Top").click();
		
		Thread.sleep(5000);

	}

}
