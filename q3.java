/*
Q3. Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.
*/

import java.util.Scanner;

class q3
{
	static char findMaxFreq(String str)
	{
		int i=0,len=str.length(),pos=0;
		char ch = str.charAt(i);
		int freq[] = new int[26];
		while(i<len)
		{
			ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				freq[(ch-65)]++;
			else if(ch >= 'a' && ch <= 'z')
				freq[(ch-97)]++;
			i++;
		}
		int max = freq[0];
		for(i=0;i<26;i++)
		{
			// System.out.println((char)(i+65) + " occurs " + freq[i] + " times.");
			if(max < freq[i])
			{
				max = freq[i];
				pos = i;
			}
		}
		ch = (char)(pos+65);
		return ch;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("String : " + str);
		char max = findMaxFreq(str);
		System.out.println("Character with max frequency : '" + max + "'");
		System.out.println();
	}
}