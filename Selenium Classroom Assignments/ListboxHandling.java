package QualityKioskTraining.SeleniumScript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.get("https://letskodeit.teachable.com/p/practice");
		WebElement Listbox=D.findElementById("multiple-select-example");
		Select Se=new Select(Listbox);
		Se.selectByIndex(0);
		Thread.sleep(5000);
		Se.selectByValue("orange");
		Thread.sleep(5000);
		Se.selectByVisibleText("Peach");
		Thread.sleep(5000);
		Se.deselectByIndex(0);
		Thread.sleep(5000);
		List<String>ExpectedSelectedOptionTexts=new ArrayList<String>();
		ExpectedSelectedOptionTexts.add("Orange");
		ExpectedSelectedOptionTexts.add("Peach");
		ExpectedSelectedOptionTexts.add("Apple");
		List<WebElement>SelectedOptions=Se.getAllSelectedOptions();
		/*
		 * SelectedOptions=			<option value="orange">Orange</option>
									<option value="peach">Peach</option>*/
		for(WebElement SelectedOptn:SelectedOptions)
		{
			String SelectedOptionText=SelectedOptn.getText();
			if(ExpectedSelectedOptionTexts.contains(SelectedOptionText))
				System.out.println("Correct options are Selected..PASSED");
			else
				System.out.println("Wrong option "+ SelectedOptionText+ " is selected..FAILED");
		}	
		List<WebElement>AllOptions=Se.getOptions();
		for(WebElement Optn:AllOptions)
		{
			String OptionText=Optn.getText();
			if(ExpectedSelectedOptionTexts.contains(OptionText))
				System.out.println("Correct options are Present..PASSED");
			else
				System.out.println("Wrong option "+ OptionText+ " is Present..FAILED");
		}	
	}

}
