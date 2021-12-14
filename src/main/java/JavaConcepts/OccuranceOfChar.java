package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar 
{
	public void occurance(String name)
	{
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] strArray= name.toCharArray();
		for(char c: strArray)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		
		}
		
	}

}
