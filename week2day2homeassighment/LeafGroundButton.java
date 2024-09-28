package week2day2homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
	
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard")) {
			System.out.println("Dashboard title is verified");
		}else {
			System.out.println("Dashboard title does not display");
		}
		driver.navigate().back();
		WebElement checkButton = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
		boolean enabled = checkButton.isEnabled();
		if(enabled==true) {
			System.out.println("confirm button is enabled");
		}else {
			System.out.println("confirm button disabled");
		}
		WebElement positionButton = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point location = positionButton.getLocation();
		System.out.println(location);
		String text = positionButton.getText();
		System.out.println(text);
		positionButton.click();
		WebElement getColor = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		String cssValue = getColor.getCssValue("background-color");
		System.out.println(cssValue);
		WebElement saveButtonColor = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']//parent::button"));
		String cssValue2 = saveButtonColor.getCssValue("background-color");
		System.out.println(cssValue2);
		WebElement height = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		int height2 = height.getSize().getHeight();
		System.out.println("Height of the button: "+ height2);
		int width = height.getSize().getWidth();
		System.out.println("Width of the button : "+ width);
		//driver.close();
	
	}

}
