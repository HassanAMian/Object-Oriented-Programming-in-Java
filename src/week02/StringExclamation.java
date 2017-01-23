package week02;

import java.util.ArrayList;

public class StringExclamation
{
	public ArrayList<String> splitByExclamation(String line)
	{
		ArrayList<String> list = new ArrayList<String>(); //generic collection class
		int index = line.indexOf("!");
		if(index >= 0)
		{
			String firstPart = line.substring(0, index);
			String lastPart = line.substring(index +1);
			
			list.add(firstPart.trim());
			list.add(lastPart.trim());
		}
		return list;
	}

}
