package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("testleaf");
		
		WebElement sourcename=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source=new Select(sourcename);
		source.selectByIndex(4);
		WebElement sourcename1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source1=new Select(sourcename1);
		source1.selectByVisibleText("Automobile");
		WebElement sourcename2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2=new Select(sourcename2);
		source2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		boolean title=driver.getTitle().contains("View Lead | opentaps CRM");
		if(title)
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title Mismatch");
		}
		
	}

	}
