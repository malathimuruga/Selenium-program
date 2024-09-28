package week2day2homeassighment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://leaftaps.com/opentaps/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	     driver.findElement(By.xpath("//span[contains (text() ,'Phone')]")).click();
	     WebElement element = driver.findElement(By.xpath("//input[@name='primaryPhoneCountryCode']"));
	     element.clear();
	     element.sendKeys("9");
	     driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
	     driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8870900238");
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         
	}

}
