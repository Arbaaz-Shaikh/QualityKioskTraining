package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        ChromeDriver D=new ChromeDriver();
        D.manage().window().maximize();
        
        D.get("https://letskodeit.teachable.com/p/practice");
        
        WebElement NameFiled=D.findElementByName("enter-name");
        NameFiled.sendKeys("Arbaazz");
        
        String EnterName =NameFiled.getAttribute("value");
        
        WebElement AlertBtn=D.findElementById("alertbtn");
        AlertBtn.click();
        
        Alert Al =D.switchTo().alert();
        String AlertMessage=Al.getText();
        
        if(AlertMessage.contains(EnterName))
        	System.out.println("Entered name is present in Alert message..Passed");
        else
        	System.out.println("Entered name is Not present in Alert message..Failed");
        
        Al.accept();
	}

}
