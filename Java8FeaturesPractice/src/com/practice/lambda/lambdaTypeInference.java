package com.practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaTypeInference {

	public static void main(String[] args) {
		StringLengthLamda ld= s-> s.length();
		System.err.println("length "+ld.getLength("Sharnendra Dey"));
		
		List<Integer> numberList = new ArrayList<>(Arrays.asList(1,6,4,5,3,2));
        
		/*numberList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return 0;
			}
		});*/
		
		numberList.sort((o1,o2)-> o1>o2?1:(o1<o2?-1:0));
		
		numberList.stream()
		    .filter(i -> i % 2 == 0)
		    .forEach(System.out::println);
		
	}
}

interface StringLengthLamda
{
	int getLength(String s);
}