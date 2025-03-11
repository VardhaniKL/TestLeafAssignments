package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
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
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Koki Plasts");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Savitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Savi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("PLT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Export and Import");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("var@kok.com");
		
		WebElement dd1=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s1=new Select(dd1);
		s1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).submit();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Only exports");
	
		driver.findElement(By.name("submitButton")).submit();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
	
			
		

	}

}
