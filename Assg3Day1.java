	package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg3Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);	
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");	 
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Farihah");
		driver.findElement(By.id("lastNameField")).sendKeys("Khan");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9344953690");
		driver.findElement(By.className("smallSubmit")).click();
		
		String text = driver.findElement(By.id("viewContact_firstNameLocal_sp")).getText();
		System.out.println(text);
		String title = driver.getTitle();
		System.out.println(title);
	
	    driver.close();
	}

}
