package week2.Day1Homeassighment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(" https://en-gb.facebook.com/");
	     driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Malathi");
        driver.findElement(By.name("lastname")).sendKeys("Muruganantham");
        driver.findElement(By.name("reg_email__")).sendKeys("8870900238");
        driver.findElement(By.id("password_step_input")).sendKeys("8870900238");
        //driver.findElement(By.id("day")).sendKeys("15");
        //driver.findElement(By.id("month")).sendKeys("sep");
        //driver.findElement(By.id("year")).sendKeys("2024");
        WebElement dd = driver.findElement(By.id("day"));
        Select obj=new Select(dd);
        obj.selectByIndex(2);
        WebElement dd1 = driver.findElement(By.id("month"));
        Select obj1 = new Select(dd1);
        obj1.selectByIndex(4);
        WebElement dd2 = driver.findElement(By.id("year"));
        Select obj2= new Select(dd2);
         obj2.selectByIndex(2);                 
         WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
         radio.click();

	}

}
