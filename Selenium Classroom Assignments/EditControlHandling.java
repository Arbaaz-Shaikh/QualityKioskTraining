package QualityKioskTraining.SeleniumScript;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditControlHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver D = new ChromeDriver();
		D.manage().window().maximize();
		
		D.get("https://letskodeit.teachable.com/p/practice");
		
		
		WebElement HideButton = D.findElementById("hide-textbox");
		HideButton.click();
		
		WebElement NameField = D.findElementByName("show-hide");
		boolean IsShown = NameField.isDisplayed();
		
		if(IsShown==false)
			
			System.out.println("Hide button works.. Test Passed");
		
		else
			System.out.println("Hide button does not works.. Test failed");
		
		WebElement ShowButton=D.findElementById("show-textbox");
        ShowButton.click();
        
        IsShown=NameField.isDisplayed();
        if(IsShown==true)
            System.out.println("Show button works fine..PASSED");
        else
            System.out.println("Show button does not work fine..FAILED");
	}
}

