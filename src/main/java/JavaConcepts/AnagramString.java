package JavaConcepts;

import java.util.Arrays;

public class AnagramString 
{
	public  static void anagramString(String str1, String str2)
	{
		boolean status = true;
		String s1=str1.replace("\\s", "");
		String s2=str2.replace("\\s", "");
		if(s1.length()!=s2.length())
		{
			status = false;
		}
		else
		{
			char[] s1A=s1.toLowerCase().toCharArray();
			char[] s2A=s2.toLowerCase().toCharArray();
			Arrays.sort(s1A);
			Arrays.sort(s2A);
			status = Arrays.equals(s1A, s2A);
		}
			if(status)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
	
	public static void main(String args[])
	{
		anagramString("Keep", "Peek");
	
	}
}
