package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	//https://www.interviewbit.com/hashmap-interview-questions/#:~:text=Questions%20for%20Freshers-,1.,create%20an%20array%20of%20buckets.
	
	private static final String Kay = null;

	public static void main(String[] args) {

		//By copying another map into our map
		
		Map<String, String> hashMap=new HashMap<>();
		
		hashMap.put("Kamlesh", "B.tech");
		hashMap.put("Karthik", "5th");
		hashMap.put("Shruti", "1st");
		hashMap.put("Purnima", "B.ed");
		
		Map<String, String> hashMap2=new HashMap<>(hashMap);
		hashMap2.put("Ranvijay", "MCA");
		hashMap2.put("Dolly", "B.ed");
		hashMap2.put("Aaryan", "3red");
		
		hashMap2.forEach((Key,value)->System.out.println(Key +" "+value));//Using Java iteration
		
		//Map<String, String> hashMap3=new HashMap<>(hashMap);
		for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Name: "+key + "  Qulification :"+val);
		}
		
		
		//how to itreate Hash Map
		
		for(Map.Entry<String, String> entry:hashMap2.entrySet()){
			String key=entry.getKey();
			String value=entry.getValue();
		}
		
	//	hashMap2.forEach((Key,value)->(System.out.println(Key+" "+value)));
		
	}

}
