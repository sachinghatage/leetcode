package com.returnindex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturnIndices {
	
	
	//Array is given and one key target is also given then index is returned
	//example [1,2,3,4] key target is 6, then returned index will be [1,3] which is arr[1]+arr[3]=6

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4};
		int target=6;
		int[] returnIndex = returnIndex(array,target);
		System.out.println(Arrays.toString(returnIndex));		
	}

	private static int[] returnIndex(int[] array, int target) {

		//create hashmap
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(target-array[i])) {
				return new int[] {map.get(target-array[i]),i};
			}
			
			map.put(array[i], i);
		}
		
		return new int[0];    //return empty array if condition is not matched
	}

	

}
