package com.infy.aiapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEvenAndOdd {
	public static void main(String str[])
	{
		int inputArray[]= {2,3,7,12,8,9,5,4};
		int len= inputArray.length;
		List<Integer> oddArray = new ArrayList<Integer>();
		List<Integer> evenArray = new ArrayList<Integer>();
		List<Integer> resultArray = new ArrayList<Integer>();
		int posArray[] = new int[len];

		int evenCount = 0;
		int oddCount =  0;
		for(int i=0;i<len;i++)
		{
			if(inputArray[i]%2==0) {
				
				evenArray.add(inputArray[i]);
				posArray[i]=2;
			}
			else
			{
				
				oddArray.add(inputArray[i]);
				posArray[i]=1;
			}
		}
		evenArray.sort((a,b)->{return 1 * (a-b);});
		oddArray.sort((a,b)->{return -1*(a-b);});
		evenCount=0;
		oddCount=0;
		
		for(int i=0;i<len;i++)
		{
			if(posArray[i]== 2)
			{
				resultArray.add(evenArray.get(evenCount++));
			}else
			{
				resultArray.add(oddArray.get(oddCount++));
			}
		}
		
		System.out.print(resultArray.toString());
	}

}
