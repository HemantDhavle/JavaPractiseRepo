package JavaConcepts;

public class ReverseString 
{
	public static void main(String args[])
	{
		String name = "DHAVLE";
		String temp= "";
		char ch;
		
		for(int i = 0 ;i<name.length();i++)
		{
			ch = name.charAt(i);
			temp = ch+temp;
			System.out.println(temp);
		}
		System.out.println(temp+"name");
	}

}
