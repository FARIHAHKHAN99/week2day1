package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

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
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fariha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khan");
				WebElement element= driver.findElement(By.id("createLeadForm_ownershipEnumID"));
				Select sel = new Select (element);
				sel.deselectByIndex(3);
				sel.deselectByValue("OWN_PROPRIETOR");
				sel.deselectByVisibleText("Partnership");
				driver.findElement(By.name("submitButton")).click();
				String str=driver.getTitle();
				System.out.println(str);
				
	
				
						
	}

}
