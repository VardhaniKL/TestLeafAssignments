package week1.day2;

public class Browser 
{
	public String launchBrowser(String browserName)
	{
		System.out.println(browserName + "  -Browser launched successfully" );
		return browserName;
	}
	
	 void loadurl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) 
	{
		Browser b=new Browser();
		b.launchBrowser("Firefox");
		b.loadurl();
	}

}
