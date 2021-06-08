package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingGetAttribute {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver D=new ChromeDriver();
        D.manage().window().maximize();

        D.get("https://letskodeit.teachable.com/p/practice");
        
        WebElement HideButton=D.findElementById("hide-textbox");
        HideButton.click();
        
        WebElement NameField=D.findElementByName("show-hide");
        String StyleAttrValue=NameField.getAttribute("Style");
        
        if(StyleAttrValue.equals("display: none;"))
        	System.out.println("After clicking on Hide button style attribute change correctly...Passed");
        else
        	System.out.println("After clicking on Hide button style attribute did not chnage corretly...Failed");
        
        WebElement ShowBtn=D.findElementById("show-textbox");
        ShowBtn.click();
        
        StyleAttrValue=NameField.getAttribute("style");
        if(StyleAttrValue.equals("display: block;"))
        	System.out.println("After clicking on show button style attribute changed correctly...PASSED");
        else
        	System.out.println("After clicking on show button style attribute did not changed correctly.Failed");
	}

}
