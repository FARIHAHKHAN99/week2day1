package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);	
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");	
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");	 
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();		
		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
		driver.findElement(By.xpath("//a[(text()='Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Barclays");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fariha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Khan");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
