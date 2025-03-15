package week2Day2;

import java.time.Duration;

import org.bouncycastle.its.ITSPublicEncryptionKey.symmAlgorithm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void waitFor(int a) {
		try {
			Thread.sleep(a * 1000);
		} catch (InterruptedException e) {

		}

	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();

		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.id("ext-gen270")).sendKeys("9088938984");
		driver.findElement(By.linkText("Find Leads")).click();

		// Capture leadId of first resulting lead

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement FirstOption = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		String text = FirstOption.getText();
		System.out.println("Lead id " + text);
		waitFor(2);

		// Click on the firstLink
		WebElement selectFirst = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a"));
		selectFirst.click();

		// Delete the entry
		driver.findElement(By.linkText("Delete")).click();

		// Goto FindLeads again
			driver.findElement(By.partialLinkText("Find")).click();

		// Enter lead id
		driver.findElement(By.id("ext-gen246")).sendKeys(text);

		WebElement obj=driver.findElement(By.id("ext-gen334"));
		
		obj.click();

		WebElement records = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String text2 = records.getText();
		System.out.println(text2);
		
		

	}

}
