/*
Q2. Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned. 
For example is the string is AbcDEfG, it should become aBCdeFg.
*/

import java.util.Scanner;

class q2
{
	static String toggleCase(String str)
	{
		int i=0,len=str.length();
		char ch;
		String newStr = new String();
		while(i<len)
		{
			ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				newStr += (char)(ch+32);
			else if(ch >= 'a' && ch <= 'z')
				newStr += (char)(ch-32);
			else
				newStr += ch;
			i++;
		}
		return newStr;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("String : " + str);
		str = toggleCase(str);
		
		System.out.println("After toggling the case,");
		System.out.println("String: " + str);
		System.out.println();
	}
}