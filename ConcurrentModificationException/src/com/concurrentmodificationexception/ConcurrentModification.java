package com.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification {
	
//	when we try to modify the object in hashmap while it is iterating over it's collection
//	we will get concurrentmodificationexception
//	To avoid it we use concurrent hashmap

	public static void main(String[] args) {
		
//		Map<String,Integer> map=new HashMap<>();
//		map.put("apple", 1);
//		map.put("banana", 2);
//		map.put("orange", 3);
//		map.put("jackfruit", 4);
//		
//		//iterate the map using keyset
//		for(String key:map.keySet()) {
//			map.remove(key);                //this will throw exception
//		}
		
		Map<String,Integer> map=new ConcurrentHashMap<String,Integer>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);
		map.put("jackfruit", 4);
		
		//iterate the map using keyset
		for(String key:map.keySet()) {
			System.out.println(map.remove(key));                //this will not  throw exception
		}

		//this works perfectly fine
		
		//thankyou
		
		
		
	}

}
