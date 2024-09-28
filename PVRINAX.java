package weekday2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRINAX {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.pvrcinemas.com");
	     driver.manage().window().maximize();
	     
 driver.findElement(By.xpath("//span[text()='Cinema']")).click();
 driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
 driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
 driver.findElement(By.xpath("//span[text()='Tomorrow']") ).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
 driver.findElement(By.xpath("//span[text()='Book']") ).click();
 driver.findElement(By.xpath("//button[text()='Accept']")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//span[@id='CL.CLUB|I:6']")).click();
 WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']"));
 System.out.println("Seat Number is :" + seatNumber.getText());
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
 WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']"));
System.out.println("Print the Seat info : " + seatInfo.getText());
Thread.sleep(3000)
;WebElement grandTotal = driver.findElement(By.xpath("//span[text()='238.24']"));
System.out.println("Grand Total is : " + grandTotal);
driver.findElement(By.xpath("//button[text()='Proceed']")).click();
driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
String currentPageTitle = driver.getTitle();
System.out.println("Current Page Title is : " + currentPageTitle);
driver.close();
	}
	 
}
