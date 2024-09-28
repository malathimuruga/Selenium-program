package week2day2homeassighment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactionswithcheckboxes {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://leafground.com/checkbox.xhtml");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//span[text()='Basic']")).click();
	     driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	     driver.findElement(By.xpath("//label[text()='Java']")).click();
	     driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
	     driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[3]")).click();
         driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']")).click();
         //WebElement display = driver.findElement(By.xpath("//div[@class='grid formgrid'])[5]"));
 		//boolean enabled = display.isEnabled();
 		//System.out.println(enabled);
 		driver.findElement(By.xpath("(//label[text()='Paris']")).click();
		driver.findElement(By.xpath("(//label[text()='Istanbul']")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin']")).click();
		driver.findElement(By.xpath("(//label[text()='Brasilia']")).click();
		driver.findElement(By.xpath("(//label[text()='London']")).click();
	    driver.close();

	     
	     
	   
	}

}
