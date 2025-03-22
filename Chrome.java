package week3Day2;

import org.checkerframework.checker.units.qual.s;

public class Chrome extends Browser
{
	public void openIncognito()
	{
		System.out.println("Open Incognito in Chrome");		
	
	}
	public void clearCache()
	{
		System.out.println("Clear Cache in CHROME");
	}
	public static void main(String[] args)
	{

		Chrome c=new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	System.out.println(c.browserName);
	System.out.println(c.browserVersion);


	}

}
