package week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHomeWork 
{
	
	public static void waitFor(int a)
	{
		try 
		{
		    Thread.sleep(a*1000); // Pause for seconds
		} 
		catch (InterruptedException e)
		{
		  
		}

	}

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Manage timeout
		

		
		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();
		
		
		driver.findElement(By.id("accountName")).sendKeys("Sulabam Exports");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement dd1=driver.findElement(By.name("industryEnumId"));
		Select s1=new Select(dd1);
		s1.selectByIndex(3);
		
		WebElement dd2=driver.findElement(By.name("ownershipEnumId"));
		Select s2=new Select(dd2);
		s2.selectByVisibleText("S-Corporation");
		
		WebElement dd3=driver.findElement(By.name("dataSourceId"));
		Select s3=new Select(dd3);
		s3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dd4=driver.findElement(By.id("marketingCampaignId"));
		Select s4=new Select(dd4);
		s4.selectByIndex(6);
		
		WebElement dd5=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s5=new Select(dd5);
		s5.selectByValue("TX");
		waitFor(30);
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println( driver.getTitle());
		
		
		

	}

}
