package week2.Day1Homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 driver.findElement(By.id("numberEmployees")).sendKeys("5");
		 driver.findElement(By.className("smallSubmit")).click();
		 String Title = driver.getTitle();
		 System.out.println("Title");
		 if(Title.contains("Create Account")) {
			 System.out.println("Title is verfied");
		 }
		 else
		 {
			 System.out.println("Title is not verfied");
		 }
		 driver.close();
		 }
	}



