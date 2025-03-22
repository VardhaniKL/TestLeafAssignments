package week3Day2;

public class Edge extends Chrome
{

	public void takeSnap()
	{
		System.out.println("Take a snap n EDGE");
	}
	public void clearCookies()
	{
		System.out.println("Clear cookies in EDGE");
	}
	public static void main(String[] args) 
	{
		Edge e=new Edge();
		e.clearCookies();
		e.takeSnap();
		e.openIncognito();
		e.clearCache();
		e.navigateBack();
	

	}

}
