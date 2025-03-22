package week3Day1;

import java.util.Arrays;
import java.util.Scanner;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class AnagramString 
{
	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the frist word");
		String word1=s.next();
		System.out.println("Enter the second word");
		String word2=s.next();
		int length1=word1.length();
		int length2=word2.length();
		if (length1==length2)
		{
			System.out.println("Length matches");
		}
		else
		{
			System.out.println("Length doesnt match");
	
		}
		
		char[] char1 =word1.toCharArray();
		Arrays.sort(char1);
		String sorted1=new String(char1);
		System.out.println("The sorted value1 " +sorted1);
		
		
		char[] char2=word2.toCharArray();
		Arrays.sort(char2);
		String sorted2=new String(char2);
		System.out.println("The sorted value2 " +sorted2);
		
		if(sorted1.equals(sorted2))
		{
			System.out.println("The words are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}
	}

}
