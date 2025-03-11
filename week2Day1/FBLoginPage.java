package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginPage {
	
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        ChromeDriver openFb = new ChromeDriver();
    	
        openFb.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        openFb.manage().window().maximize();
        openFb.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        openFb.findElement(By.id("pass")).sendKeys("Tuna@321");
        openFb.findElement(By.name("login")).click();
        openFb.findElement(By.linkText("Find your account and log in.")).click();
        String Title=openFb.getTitle();
        System.out.println(Title);
    }
}


