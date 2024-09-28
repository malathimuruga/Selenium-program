package week2day2homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class RadioButtonLeafGround {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		WebElement radioBu = driver.findElement(By.xpath("//label[text()='Chennai']"));
		radioBu.click();
		System.out.println(radioBu.isEnabled());
		if(radioBu.isEnabled()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		
		radioBu.click();
		System.out.println(radioBu.isSelected());
		if(radioBu.isSelected()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		WebElement defaulted = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
		boolean selected = defaulted.isEnabled();
		System.out.println(selected);
		WebElement checkSelected = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
		if(checkSelected.isEnabled()) {
			System.out.println("Already selected");
		}else {
			
			checkSelected.click();
		}
		driver.close();
	}



	}


