package week1.day2;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
	
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the range");
			int range=s.nextInt();
			
			int first=0;
			int second=1;
			System.out.println("Fibonacci Series " + '\n' + first +'\n'+ second);
			
			for (int i= 2;i<range;i++)
			{
				int next=first+second;
				System.out.println(next);
				first =second ;
				second =next;
	
		
			}
		
			
		}
	}

	}


