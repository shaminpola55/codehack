package com.infy.aiapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstMissingPositive {
	public static void main(String str[])
	{
		int input[]= {4,2,3,6,7,5,-1,-5,4,9,-2,8};
		List<Integer> numb= new ArrayList<Integer>();
		HashMap<Integer,Integer> hmap= new HashMap<>();
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>0)
			{
				if(hmap.get(input[i]) ==null) {
					hmap.put(input[i], 1);
				numb.add(input[i]);
				}
			}
		}
		numb.sort((a,b)->{return a-b;});
		System.out.println(numb.toString());
		int i=0;
		for(i =0 ;i<numb.size();i++)
		{
			if(i+1 != numb.get(i)) {
				System.out.print(i+1);
				i=-1;
				break;
			}
		}	
		if(i!=-1)
			System.out.print(i+1);
		
		
	}

}
