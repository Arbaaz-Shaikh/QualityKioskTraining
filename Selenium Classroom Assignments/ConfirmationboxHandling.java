package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver D=new ChromeDriver();
        D.manage().window().maximize();
        
        D.get("https://letskodeit.teachable.com/p/practice");
        
        WebElement NameField=D.findElementById("name");
        NameField.sendKeys("Arbaaz");
        
        String Name=NameField.getAttribute("value");
        
        WebElement ConfirmBtn=D.findElementById("confirmbtn");
        ConfirmBtn.click();
        
        Alert Al =D.switchTo().alert();
        
        String ConfirmText=Al.getText();
        
        if(ConfirmText.contains(Name))
        	System.out.println("Name is present in Confirmation box...Passed");
        else
        	System.out.println("Name is Not present in Confirmation box..Failed");
        Al.dismiss();

	}

}
