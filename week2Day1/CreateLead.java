package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead 
{
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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Koki Plasts");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Plastic supplies");
		
		WebElement submit = driver.findElement(By.className("smallSubmit"));
		submit.submit();
		
		String title=driver.getTitle();
		System.out.println("Form created & submitted successfylly at " + title);
		
		driver.close();
	
	}

}
