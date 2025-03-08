package week1.day2;

import java.util.Scanner;

public class isPrimeNumber
{

	public static boolean isPrime(int num)
	{
		if (num ==1 )
		{
			return false;
		}
		
		if(num == 2 || num == 3)
		{
			return true;
		}
		
		else
		{
	
			for (int i=2 ; i<num; i++)
			{
				if(num%i==0)
				{
				return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) 
	{
	
			Scanner s=new Scanner(System.in);  			                                                                                                                                                     
			System.out.println("Enter the number");
			int num=s.nextInt();
			
			
			boolean result=isPrime(num);
			
			if (result==true)
			{ 
			
			System.out.println("YEs a prime no");
			}
			else
			{
			System.out.println("Not a prime no"); 
			}

	}

}
