package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingControlsInsideFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		
		D.manage().window().maximize();
		
		D.switchTo().frame("iframeResult");
		
		WebElement FirstName=D.findElementById("fname");
		FirstName.sendKeys("Arbaaz");
		
		String FirstNameEntered=FirstName.getAttribute("value");
		
		WebElement LastName=D.findElementById("lname");
		LastName.sendKeys("Shaikh");
		
		String LastNameEntered=LastName.getAttribute("value");
		
		WebElement SubmitButton=D.findElementByCssSelector("input[value='Submit']");
		SubmitButton.click();
		Thread.sleep(5000);
		WebElement DivElement=D.findElementByCssSelector("div[class='w3-container w3-large w3-border']");
		String DivText=DivElement.getText();
		
		if(DivText.contains(FirstNameEntered)&&DivText.contains(LastNameEntered))
		{
			System.out.println("Data got submitted successfully..PASSED");
		}
		else
		{
			System.out.println("Data did not get submitted successfully..FAILED");
		}	
		D.switchTo().defaultContent();
		
		WebElement RunButton=D.findElementByCssSelector("button[class='w3-button w3-bar-item w3-hover-white w3-hover-text-green']");
		RunButton.click();
	}

}
