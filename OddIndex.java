package week3Day1;

public class OddIndex 
{
	public static void main(String[] args)
	{
		String text = "changeme";
		System.out.println(text);
		
		char[] c=text.toCharArray();
		for (int i=0; i<c.length ; i++)
		{

			
			if (i%2!=0)
			{
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		
	
		System.out.println(new String(c));
	
	}

}
