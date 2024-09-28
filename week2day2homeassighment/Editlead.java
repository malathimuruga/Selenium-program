package week2day2homeassighment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf"); 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Malathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M"); 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("MM");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test657@gmail.com");
		WebElement dd = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dDown = new Select(dd);
		dDown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement description = driver.findElement(By.name("description"));
		description.clear();
		driver.findElement(By.name("importantNote")).sendKeys("Automation Tester");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}

	

