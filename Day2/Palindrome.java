package week1.day2;

import java.util.Scanner;

public class Palindrome 
	{
	
	 public static int reverse(int input) 
	 {
	        int reversed = 0;
	        for (int i = input; i > 0; i = i/10) 
	        {
	            int digit = i % 10;
	            reversed = reversed * 10 + digit;
	        }
	        return reversed;
	    }
	
	public static void main(String[] args)
	{
		System.out.println("Enter a value to check palindrome: ");
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		
		int output = reverse(input);
		if (input==output)
		{
		System.out.println("Yes, input is a palindrome: " + output);
		}
		else
		{
		System.out.println("No, input is not a palindrome: "+ output);
		}
			
	}

}
