package QualityKioskTraining.SeleniumScript;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingMultipleControls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://letskodeit.teachable.com/p/practice");
		WebElement BnzCheck=D.findElementById("benzcheck");
		WebElement BmwCheck=D.findElementById("bmwcheck");
		WebElement HondaCheck=D.findElementById("hondacheck");
		if(BnzCheck.isSelected()==false && BmwCheck.isSelected()==false && HondaCheck.isSelected()==false)
			System.out.println("All three checkboxes are unchecked by default..CORRECT");
		else
			System.out.println("All three checkboxes are not unchecked by default..InCORRECT");
		//Solution 2:
		
		List<WebElement>Checkboxes=D.findElementsByCssSelector("input[type='checkbox']");
		
		//D.findElementByCssSelector(null)
		System.out.print(Checkboxes.size());
		
		/*
		 * Checkboxes=
		 * 		<input id="bmwcheck" value="bmw" name="cars" type="checkbox"> //0
		 * 		<input id="benzcheck" value="benz" name="cars" type="checkbox"> //1
		 * 		<input id="hondacheck" value="honda" name="cars" type="checkbox"> //2	
		 */
	
		 boolean FoundSelected=false;
		 int i=0;
		 while(i<Checkboxes.size())
		 {
			 WebElement Chk=Checkboxes.get(i);
			 boolean IsCheckboxSelected=Chk.isSelected();
			 if(IsCheckboxSelected==true)
			 {	 
				 FoundSelected=true;
				 break;
			 } 
			 i++;
		 }
			 
		 if(FoundSelected==false)
			 System.out.println("All checkboxed are unchecked...PASSED");
		 else
			 System.out.println("All checkboxed are NOT unchecked...FAILED");
	}

}
