package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get ("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kolamveri");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		WebElement CreateAcct =driver.findElement(By.className("smallSubmit"));
		CreateAcct.submit();
		
		String Title=driver.getTitle();
		System.out.println(Title);
				
		
	}

}
