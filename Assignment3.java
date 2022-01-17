package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("MALAR");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("AA");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@id='createContactForm_personalTitle']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@id='createContactForm_birthDate']"));
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	}

}
