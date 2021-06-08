/*

 Assignment Number 5:
	
Select option Orange in ListBox and check if option selected is indeed Orange
or Not Check whether correct options are seen in Listbox or not


 */



package SeleniumAssignment;
import java.util.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentNo5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver D= new ChromeDriver();
		
		D.get("https://letskodeit.teachable.com/p/practice");
		D.manage().window().maximize();
		


		WebElement listBox = D.findElementById("multiple-select-example");
		Select select = new Select(listBox);
		select.selectByVisibleText("Orange");
		


		List<WebElement> SelectedList = select.getAllSelectedOptions();
		if(SelectedList.size()==1 ) 
		{
			if(SelectedList.get(0).getText().equals("Orange")) 
			{
				System.out.println("Only Orange is selected");
			}
		}
		


		List<String> ExpectedList = new ArrayList<String>();
		ExpectedList.add("Apple");
		ExpectedList.add("Orange");
		ExpectedList.add("Peach");
		List<WebElement> DisplayedList = select.getOptions();
		boolean flag = true;
		
		for(WebElement listItem : DisplayedList)
		{
			String item = listItem.getText();
			if(!ExpectedList.contains(item)) {
				System.out.println(item+" is incorrectly displayed");
				flag= false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("All options are correctly displayed");
		}else
		{
			System.out.println("All options are not correctly displayed");
		}
		
	}

}
