package marathon_PVR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PVR 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		//SwitchToCinemas
		driver.findElement(By.xpath("//span[contains(text(),'Cinema')]")).click();
		
		//Select Cinema
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();

		//Click Date2
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='date']")).click();
		
		//Click Tomorrow
		
		driver.findElement(By.xpath("//span[contains(text(), 'Tomorrow')]")).click();
        
		//SelectMovie
		driver.findElement(By.xpath("//span[text()='Select Movie']")).click();

		
		//ChooseMovie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		
		
		//SelectTiming
		driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		//ChooseTiming
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][1]")).click();
		
		//Book
		WebElement book=driver.findElement(By.xpath("//div[@class='quick-lefts ']"));
		book.click();
		
		//ClickAccept
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Choose Seat
		driver.findElement(By.id("CL.CLUB|I:14")).click();
		
		//Proceed
		driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		String seat=driver.findElement(By.className("seat-number")).getText();
		System.out.println("Seat "+ seat);
		driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();

		
		//Print grand total
		//String total=driver.findElement(By.xpath("//i[contains(@class='pi pi-times']")).getText();
		//System.out.println(total);
	
		//Close
		
				WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'cross-icon')]")));
		closeButton.click();
		
		//Print title
		String title=driver.getTitle();
		System.out.println(title);
		
	
	}
}
