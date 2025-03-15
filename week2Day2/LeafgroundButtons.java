package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LeafgroundButtons {

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		// To check whether the button is disabled 
		
		WebElement db1=driver.findElement(By.id("j_idt88:j_idt92"));
		
		if (!db1.isEnabled())
		{
			System.out.println("Yes the button is disabled ");
		}
		else
		{
			System.out.println("The button is not disabled");
		}
		
		//Find location 
				WebElement loc=driver.findElement(By.id("j_idt88:j_idt96"));
				int x=loc.getLocation().getX();
				int y=loc.getLocation().getY();
				System.out.println("The location is X->  " + x+ "  Y->  " + y);
				
		// Find Color
				
			WebElement color=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
			String colour=color.getCssValue("background-color");
			System.out.println(colour);
			
		// Height and Width
			WebElement hw=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
			int height=hw.getSize().getHeight();
			int width=hw.getSize().getWidth();
			System.out.println("Height is  " + height + " Width is "+ width);
		
		// Click the button 
		
				
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Dashboard";
		
		if (ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title is as expected -> " + ActualTitle);
		}

		else 
		{
			System.out.println("TitleMismatch");
		}
		
		driver.navigate().back();
		
		
	}

}
