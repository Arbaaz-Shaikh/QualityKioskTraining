package QualityKioskTraining.SeleniumScript;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		WebElement OpenWindowButton=D.findElementById("openwindow");
		OpenWindowButton.click();
		Thread.sleep(5000);
		String OriginalWindowHandle=D.getWindowHandle();
		
		System.out.println("Original Window "+D.getWindowHandle());
		
		Set<String>Handles=D.getWindowHandles();
		/*
		 * Handles=487485745848fngngfdgn
		 * 		cvmgmfgmfg484845857485
		 */
		for(String Handle:Handles)
		{
			D.switchTo().window(Handle);
			String Title=D.getTitle();
			
			if(Title.equals("Let's Kode It"))
			{
				break;
			}	
		}	
		
		
		WebElement LoginLink=D.findElementByPartialLinkText("Login");
		LoginLink.click();
		Thread.sleep(5000);
		D.close();
		Thread.sleep(5000);
		D.switchTo().window(OriginalWindowHandle);
		System.out.println(D.getTitle());
		D.quit();
		
	}

}
