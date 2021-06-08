package QualityKioskTraining.SeleniumScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://letskodeit.teachable.com/p/practice");

		/*
				//table[@id='product']/descendant::tr[3]/td[3]
				 * 
				 * //table[@id='product']/descendant::td[text()='Python Programming Language']/following-sibling::td
		*/
		WebElement Column=D.findElementByXPath("//table[@id='product']/descendant::td[text()='Python Programming Language']/following-sibling::td");
	
		/*
		
			//*[@id='product']
		
		*/
		System.out.println(Column.getText());
		
	}

}
