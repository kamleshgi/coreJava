package com.java8.secondhighest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AverageMarksCoding {

	public static void main(String[] args) {
		Map<String, List<Integer>> result=new HashMap<>();
		
		String[] input= {"1-english:45","2-englist:45"
				        ,"3-hindi:60","4-hindi:90","4-Math:90"};
		
	for(int i=0;i<input.length;i++) {
		int index=input[i].indexOf("-");
		String subAndMarksSubstring=input[i].substring(index+1);
		String[] subAndMarks=subAndMarksSubstring.split(":");
		
		if(result.containsKey(subAndMarks[0])) {
			List<Integer> list=result.get(subAndMarks[0]);
			list.add(Integer.parseInt(subAndMarks[1]));
			
		}else {
			List<Integer> list=new ArrayList<>();
			list.add(Integer.parseInt(subAndMarks[1]));
			result.put(subAndMarks[0], list);
		}
	}

	result.forEach((key,value)->{
		double avg=value.stream().mapToDouble(d->d)
				.average()
				.orElse(0.0);
		System.out.println(key+" Average "+avg);
	});
	
	}

}
