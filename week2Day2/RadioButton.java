package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton 
{
		public static void waitFor(int a)
		{
			try
			{
				Thread.sleep(a*1000);
			}
			catch(InterruptedException e)
			{
				
				
				
			}
		}
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//FavBrowser
		WebElement radio1=driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']"));
		radio1.click();
		
		//Reclick on radio button 
		
		WebElement radio2=driver.findElement(By.xpath("//label[@for='j_idt87:city2:2']"));
		radio2.click();
		waitFor(2);
		radio2.click();
		
		//Default radio button selected
		
		WebElement radio3=driver.findElement(By.xpath("//table[@id='j_idt87:console2']"));
		
		if (radio3.isSelected())
		{
		System.out.println("Radion button is seleccted by default");
		}
		else
		{
			System.out.println("Its not selected by default");
		}
		
		

	}

}
