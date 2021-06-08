package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        ChromeDriver D=new ChromeDriver();
        D.manage().window().maximize();
        
        D.get("https://letskodeit.teachable.com/p/practice");
        
        WebElement RadioElement=D.findElementById("bmwradio");
        RadioElement.click();
        
        boolean SelectedOrNot=RadioElement.isSelected();
        
        if (SelectedOrNot==true)
        	System.out.println("Radio button got selected after clicking..Passed");
        else
        	System.out.println("Radio button did got selected after clicking..Failed");

        WebElement HondaRadio=D.findElementById("hondaradio");
        HondaRadio.click();
        
        if(HondaRadio.isSelected())
        	System.out.println("Honda radio got selected after clicking..Passed");
        else
        	System.out.println("Honda radio did not get selected after clicking..failed ");
	}

}
