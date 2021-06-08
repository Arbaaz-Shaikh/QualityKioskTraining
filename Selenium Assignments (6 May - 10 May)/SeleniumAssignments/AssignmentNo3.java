/*

 Assignment Number 3:
	
 Type course name in the search field of Iframe given in Iframe example section


 */



package SeleniumAssignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo3 {
public static void main(String[] args) {
		
		
		System.setProperty("chrome.webdriver.chrome", "C:\\\\Users\\\\Ganesh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();

		String courseName="Selenium";
		
		driver.switchTo().frame("courses-iframe");
		WebElement course = driver.findElementById("search-courses");
		course.sendKeys(courseName);
		

		String enteredCourseName = course.getAttribute("value");
		if(enteredCourseName.equals(courseName)) {
			System.out.println(" Entered course name is correct ....PASSED");
		}else {
			System.out.println("Entered course name is not correct....FAILED");
		}
		driver.quit();

	}

}
