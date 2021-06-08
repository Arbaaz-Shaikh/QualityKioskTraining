package QualityKioskTraining.SeleniumScript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		
		D.manage().window().maximize();
		WebElement CarCombo=D.findElementById("carselect");
		Select Se=new Select(CarCombo);
		WebElement SelectedOption=Se.getFirstSelectedOption();
		String SelectedOptionText=SelectedOption.getText();
		if(SelectedOptionText.equals("BMW"))
			System.out.println("Correct dropdown option is selected by default..PASSED");
		else
			System.out.println("Correct dropdown option is NOT selected by default..FAILED");
		Se.selectByIndex(1);
		Thread.sleep(3000);
		Se.selectByValue("honda");
		Thread.sleep(3000);
		Se.selectByVisibleText("BMW");
		Thread.sleep(3000);
		SelectedOptionText=SelectedOption.getText();
		if(SelectedOptionText.equals("BMW"))
			System.out.println("Correct dropdown option is selected by default..PASSED");
		else
			System.out.println("Correct dropdown option is NOT selected by default..FAILED");
		List<String>ExpectedCarNames=new ArrayList<String>();
		ExpectedCarNames.add("Benz");
		ExpectedCarNames.add("BMW");
		ExpectedCarNames.add("Honda");
		List<WebElement>AllCarOptions=Se.getOptions();
		for(int i=0;i<AllCarOptions.size();i++)
		{
			WebElement Option=AllCarOptions.get(i);
			String OptionText=Option.getText();
			if(ExpectedCarNames.contains(OptionText))
				System.out.println("Correct options are present..PASSED");
			else
				System.out.println("InCorrect option "+OptionText+" is found...FAILED");
		}	
		for(WebElement Optn:AllCarOptions)
		{
			
			String OptionText=Optn.getText();
			if(ExpectedCarNames.contains(OptionText))
				System.out.println("Correct options are present..PASSED");
			else
				System.out.println("InCorrect option "+OptionText+" is found...FAILED");
		}	
	}

}
