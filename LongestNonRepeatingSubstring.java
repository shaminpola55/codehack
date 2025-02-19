package com.infy.aiapi;

import java.util.HashMap;

public class LongestRepeatingwords {
	
	public static void main (String str[])
	{
		String imput="sasdjjhnmcswer";
		String result="";
		HashMap <String,String> val= new HashMap<>();
		
		for(int i=0;i<imput.length();i++)
		{
			String itmString="";
			val= new HashMap<>();
			for(int j=i;j<imput.length();j++){
				String tmpChar=imput.charAt(j)+"";
				if(val.get(tmpChar)==null)
				{
					val.put(tmpChar, tmpChar);
					itmString+=tmpChar;
				}
				else
				{
					
					break;
				}
				
				
			}
			if(result.length()<itmString.length())
				result= itmString;
			
			
		}
		System.out.println(result);
	}

}
