package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg2Day1 {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Barclays");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Farihah");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Farihah");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rahi3@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		  
	  driver.findElement(By.linkText("Duplicate Lead")).click();
	  driver.findElement(By.id("createLeadForm_companyName")).clear();
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	  driver.findElement(By.id("createLeadForm_firstName")).clear();
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fariha");
	  driver.findElement(By.className("smallSubmit")).click();
		 String title = driver.getTitle();
		  System.out.println(title);
	}

}
