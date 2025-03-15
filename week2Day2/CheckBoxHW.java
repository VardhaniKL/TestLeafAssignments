package week2Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHW {

	public static void waitFor(int a) {
		try {
			Thread.sleep(a * 1000); // Pause for seconds
		} catch (InterruptedException e) {

		}

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();

		// BasicCheckbox

		WebElement checkbox1 = driver.findElement(By.id("j_idt87:j_idt89"));
		checkbox1.click();

		// To wait implicitly
		waitFor(1);

		// NotificationCheckbox
		WebElement checkbox2 = driver.findElement(By.id("j_idt87:j_idt91"));
		checkbox2.click();
		waitFor(2);

		// ToVerifyThePopUpMessage

		WebElement popup1 = driver.findElement(By.xpath("//div[contains(@class,'ui-growl-item')]//div[@class='ui-growl-message']"));
		String text1 = popup1.getText();
		System.out.println(" Notification Checkbox popup  message: " + text1);

		// FavouriteLanguage
		WebElement checkbox3 = driver.findElement(By.xpath("//label[text()='Python']"));
		checkbox3.click();

		WebElement checkbox4 = driver.findElement(By.xpath("// label[text()='Javascript']"));
		checkbox4.click();

		// TriStateCheckbox
		WebElement checkbox5 = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		checkbox5.click();

		// ToggleSwitch
		WebElement checkbox6 = driver.findElement(By.id("j_idt87:j_idt100"));
		checkbox6.click();

		// VerifyMessage
		WebElement popup2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']"));
		String text2 = popup2.getText();
		System.out.println(" Toggle switch popup : " + text2);

		// VerifyifCheckboxisDisabled

		WebElement checkbox7 = driver.findElement(By.id("j_idt87:j_idt102_input"));

		if (!checkbox7.isEnabled()) {
			System.out.println("Checkbox is disabled.");
		} else {
			System.out.println("Checkbox is enabled.");
		}

		// SelectMultipleOptions


		WebElement dropdown = driver.findElement(By.id("j_idt87:multiple"));
		dropdown.click();
		
	

		WebElement checkbox9 = driver.findElement(By.xpath("//li[@data-item-value='Miami']//div[contains(@class, 'ui-chkbox-box')]"));
		checkbox9.click();

		WebElement checkbox10 = driver
				.findElement(By.xpath("//li[@data-item-value='London']//div[contains(@class, 'ui-chkbox-box')]"));
		checkbox10.click();
		
		dropdown.click();

	}

}
