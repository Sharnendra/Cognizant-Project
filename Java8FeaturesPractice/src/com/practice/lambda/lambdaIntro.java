package com.practice.lambda;

import java.util.function.Consumer;

import com.practice.collectionElements.collectableElements;

public class lambdaIntro {

	public static void main(String[] args) {
		/* Lambda introduced in java 8 is very powerful programming
		   concepts that helps a programmer to enable funtional programming
		
		   It is used to provide readable and concise code.
		   
		   It also allow us to easily use API and Libraries.
		   
		   Support parallel processing.
		*/
		
		System.out.println(" Value without lambda");
		collectableElements.list.forEach(new Consumer<String>() {
			@Override
			public void accept(String listElements) {
				System.out.println(listElements);	
			}
		});
		
		System.out.println("");
		System.out.println("");
		System.out.println("Value 1 with lambda code optimization level 1");
		
		collectableElements.list.forEach(item -> {
				System.out.println(item);	
		});
		
		System.out.println("");
		System.out.println("");
		System.out.println("Value 2 with lambda code optimization level 2");
		
		collectableElements.list.forEach(item ->System.out.println(item));
		
		System.out.println("");
		System.out.println("");
		System.out.println("Value 3 with lambda code optimization level 3");
		
		collectableElements.list.forEach(System.out::println);

	}

}
