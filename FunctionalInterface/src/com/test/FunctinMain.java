package com.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctinMain {
	static int mod=0;
	public static void main(String[] args) {
		
		
		CollectionsData
		.listMapper.entrySet()
		.stream()
		.filter(new Predicate<Map.Entry<Integer, List<String>> >() {
			@Override
			public boolean test(Entry<Integer, List<String>> t) {
				List<String> l1=t.getValue();
				l1= l1.stream()
					  .filter(new Predicate<String>() {
						@Override
						public boolean test(String x) {
							if(x.contains("V"))
							{
								mod=1;
								return true;
							}
							else
							{
								mod=0;
								return false;
							}
						}
					  })
					  .collect(Collectors.toList());
				if(mod==1)
				{
					CollectionsData.listMapper.get(t.getKey()).clear();
					CollectionsData.listMapper.get(t.getKey()).addAll(l1);
				}
				return true;
			}
		})
		.map(Map.Entry::getValue)
		.flatMap(new Function<List<String>, Stream<String>>() {

			@Override
			public Stream<String> apply(List<String> l) {
				// TODO Auto-generated method stub
				return l.stream().map(t->"Associate - "+t);
			}
		})
		.forEach(System.out::println);
	}
}
