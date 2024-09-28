package week2.Day1Homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
			
		 driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 WebElement login = driver.findElement(By.className("decorativeSubmit"));
		 login.click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("Malathi");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
         WebElement dd = driver.findElement(By.name("industryEnumId"));
         Select obj=new Select(dd);
         obj.selectByIndex(3);
         WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
         Select obj1=   new Select(dd1);
         WebElement dd2 = driver.findElement(By.name("dataSourceId"));
         Select obj2= new Select(dd2);
         WebElement dd3 = driver.findElement(By.name("marketingCampaignId"));
         Select obj3= new Select(dd3);
         obj3.selectByIndex(6);
         WebElement dd4 = driver.findElement(By.name("generalStateProvinceGeold"));
         Select obj4=new Select(dd4);
         obj4.selectByValue("TX");
         driver.findElement(By.className("smallSubmit")).click();
		 String Title = driver.getTitle();
		 System.out.println("Title");
		 if(Title.contains("Account")) {
			 System.out.println("Title is verfied");
		 }
		 else
		 {
			 System.out.println("Title is not verfied");
		 }
		 driver.close();    
         }

}
