package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        ChromeDriver D=new ChromeDriver();
        D.manage().window().maximize();
        
        D.get("https://letskodeit.teachable.com/p/practice");
        
       WebElement benzcheck= D.findElementById("benzcheck");
       benzcheck.click();
       boolean IsSelectedOrNot=benzcheck.isSelected();
       
       if(IsSelectedOrNot==true)
    	   System.out.println("Clicking on checkbox selected it..passed");
       else
    	   System.out.println("Clicking on checkbox did not selected it..failed");
       
       WebElement hondacheck= D.findElementById("hondacheck");
       hondacheck.click();
       
       if(hondacheck.isSelected())
    	   System.out.println("Clicking on checkbox selected it..passed");
       else
    	   System.out.println("Clicking on checkbox did not selected it..failed");
	}

}
