package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("testleaf1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("test");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		WebElement descp=driver.findElement(By.name("description"));
		descp.sendKeys("Selenium training");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Selenium@gmail.com");
		WebElement statename=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(statename);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Selenium");
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
