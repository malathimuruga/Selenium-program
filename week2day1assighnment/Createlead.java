package week2.Day1Homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
			
		 driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 WebElement login = driver.findElement(By.className("decorativeSubmit"));
		 login.click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malathi");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muruganantham");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testleaf");
		 driver.findElement(By.className("smallSubmit")).click();
		 WebElement element = driver.findElement(By.xpath("//input[@name='primaryPhoneCountryCode']"));
	     element.clear();
	     element.sendKeys("9");
	     driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
	     driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8870900238");
   		 String Title = driver.getTitle();
		 System.out.println("Title");
		 if(Title.contains("Createlead")) {
			 System.out.println("Title is verfied");
		 }
		 else
		 {
			 System.out.println("Title is not verfied");
		 }
		 //driver.close();
		 }
}
	



