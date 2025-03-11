package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dropdown 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KokiPlasts");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vardhani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KL");
		
		WebElement dd1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s1=new Select(dd1);	
		s1.selectByIndex(4);
		
		WebElement dd2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s2=new Select(dd2);
		s2.selectByVisibleText("Automobile");
		
		WebElement dd3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select s3=new Select(dd3);
		s3.selectByValue("OWN_CCORP");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		String Title =driver.getTitle();
		System.out.println("The title is    " + Title);
		driver.close();
				
	}

}
