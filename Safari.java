package week3Day2;

public class Safari extends Edge
{
	public void readerMode()
	{
		System.out.println("Reader Mode SAFARI");
	}
	public void fullScreenMode() 
	{
	System.out.println("Fullscreen mode SAFARI");	
	}
	public static void main(String[] args)
	{
	Safari s=new Safari();
	s.readerMode();
	s.fullScreenMode();
	s.openURL();
	s.clearCache();
	s.takeSnap();

	}

}
