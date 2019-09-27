package com.practice.set1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.allLambda.lambdaIntegrals;

public class LamdaImplementorOnCollection {

	private static Map<Integer, List<String>> maps=null;
	
	static List<String> listdata=new ArrayList<String>();
	static Map<Integer, List<String>> mapdata=new HashMap<Integer, List<String>>();
	
	@FunctionalInterface
	interface MapData 
	{ 
	    Map<?, ?> showcaseMap(Map m); 
	}
	
	@FunctionalInterface
	interface ListData 
	{ 
		List<?> showcaseMap(); 
	}
	
	public static void main(String[] args) {
		
		MapData m1=mapper -> (CollectionImplementor.getListMapper().entrySet().stream()
				.filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())));
		
		maps=    (CollectionImplementor.getListMapper().entrySet().stream()
				.filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())));
		
		
		
		listdata=CollectionImplementor.getListMapper().entrySet().stream()
				.map(Map.Entry::getValue)
			    .flatMap(List::stream) 
				.collect(Collectors.toList());
		
		
		
		
		
		System.err.println(CollectionImplementor.getListMapper().entrySet().stream()
				.filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue())));
		
		System.err.println(CollectionImplementor.getListMapper().entrySet().stream()
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())));
		
		
		CollectionImplementor.getList().forEach(item-> System.err.println(item));
		CollectionImplementor.getListMapper().forEach((k,v) -> 
															{
																System.out.printf(" 1 "+ k +":"+ v);
																v.forEach(item -> System.out.println("2 "+item));
															}
		);
		
		listdata.stream()
	    //.filter(i -> i % 2 == 0)
	    .forEach(System.out::println);
		
		Predicate<? super Entry<Integer, List<String>>> predicate =x -> ((Entry<Integer, List<String>>) x).getKey() == 2;
		
		mapdata=CollectionImplementor.listMapper1.entrySet().stream()
				
				.map(Map.Entry::getValue)
				
			    .flatMap(new Function<Map<Integer, List<String>>, Stream<Entry<Integer, List<String>>>>() {

					@Override
					public Stream<Entry<Integer, List<String>>> apply(Map<Integer, List<String>> t) {
						// TODO Auto-generated method stub
						return t.entrySet().stream().filter(predicate);
					}
				}) 
				.collect(Collectors.toMap(x -> ((Entry<Integer, List<String>>) x).getKey(), y -> ((Entry<Integer, List<String>>) y).getValue()));
		
		
		System.out.println("mapdata "+mapdata);
		
		System.out.println("mapdata 2 "+lambdaIntegrals.getMapWithInMap_withIntegerKey_FilterApplicable(CollectionImplementor.listMapper1, x -> ((Entry<Integer, List<String>>) x).getKey() == 2));
		
		System.out.println("mapdata 3 "+lambdaIntegrals.getMapWithInMap_withIntegerKey_FilterApplicable(CollectionImplementor.listMapper1,null));
	}
}
