package com.practice.allLambda;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaIntegrals {
	
	public static Map<Integer, List<String>> getMapWithInMap_withIntegerKey_FilterApplicable(Map<Integer, Map<Integer, List<String>>> mapContaingMap,Predicate<? super Entry<Integer, List<String>>> predicate)
	{
		/*return mapContaingMap.entrySet().stream()
		.map(Map.Entry::getValue)
	    .flatMap(new Function<Map<Integer, List<String>>, Stream<Entry<Integer, List<String>>>>() {

			@Override
			public Stream<Entry<Integer, List<String>>> apply(Map<Integer, List<String>> t) {
				// TODO Auto-generated method stub
				return t.entrySet().stream();
			}
		}) 
		.collect(Collectors.toMap(x -> ((Entry<Integer, List<String>>) x).getKey(), y -> ((Entry<Integer, List<String>>) y).getValue()));*/
		
		return mapContaingMap.entrySet().stream()
				.map(Map.Entry::getValue)
			    .flatMap(t ->t.entrySet().stream().filter(predicate==null?x->true:predicate)) 
				.collect(Collectors.toMap(x -> ((Entry<Integer, List<String>>) x).getKey(), y -> ((Entry<Integer, List<String>>) y).getValue()));
	}
	
	
	public static List<String> listFromMapOfTypeString_withIntegerKey(Map<Integer, List<String>> mapContainingList)
	{
		 return mapContainingList.entrySet().stream()
		.map(Map.Entry::getValue)
	    .flatMap(List::stream) 
		.collect(Collectors.toList());
	}
	
	public static List<Integer> listFromMapOfTypeInteger_withIntegerKey(Map<Integer, List<Integer>> mapContainingList)
	{
		 return mapContainingList.entrySet().stream()
		.map(Map.Entry::getValue)
	    .flatMap(List::stream) 
		.collect(Collectors.toList());
	}
	
	
	
	public static Map<String, List<String>> getMapWithInMap_withStringKey_FilterApplicable(Map<Integer, Map<String, List<String>>> mapContaingMap,Predicate<? super Entry<String, List<String>>> predicate)
	{
		/*return mapContaingMap.entrySet().stream()
		.map(Map.Entry::getValue)
	    .flatMap(new Function<Map<Integer, List<String>>, Stream<Entry<Integer, List<String>>>>() {

			@Override
			public Stream<Entry<Integer, List<String>>> apply(Map<Integer, List<String>> t) {
				// TODO Auto-generated method stub
				return t.entrySet().stream();
			}
		}) 
		.collect(Collectors.toMap(x -> ((Entry<Integer, List<String>>) x).getKey(), y -> ((Entry<Integer, List<String>>) y).getValue()));*/
		
		return mapContaingMap.entrySet().stream()
				.map(Map.Entry::getValue)
			    .flatMap(t ->t.entrySet().stream().filter(predicate==null?x->true:predicate)) 
				.collect(Collectors.toMap(x -> ((Entry<String, List<String>>) x).getKey(), y -> ((Entry<String, List<String>>) y).getValue()));
	}

}
