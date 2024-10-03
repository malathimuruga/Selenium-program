package week3day2homeassighnment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.ajio.com");
	     driver.manage().window().maximize();
	     
	     
	driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags");   
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	
	
	WebElement itemcount = driver.findElement(By.xpath("//div[@class='length']"));
	
		  System.out.println("The total item founds in link" +itemcount.getText());
		  
		  List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
			for(int i =0;i<=brandList.size()-1;i++) {
				System.out.println("Prine the Brand Name : " + brandList.get(i).getText());
			}
			  
			List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
			for(int i =0;i<=bagName.size()-1;i++) {
				System.out.println("Print the Name of Bags: " + bagName.get(i).getText());
			}
			
			//driver.close();
		}
	     
		 

}
