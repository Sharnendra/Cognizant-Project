package com.practice.collectionElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class collectableElements {
	
	static int counter=0;
	
	public static List<String> list=new ArrayList<String>()
	{{
		add("Dweep");
		add("Sharnendra");
		add("Debapriya");
		add("Gourav");
		add("Ashish");
		add("Carry");
	}};
	
	public static Map<Integer, List<String>> listMapper=new HashMap<Integer, List<String>>(){{
		put(1,new ArrayList<String>(){{
			add("Ravi");
			add("Vijay");
		}});
		put(2,new ArrayList<String>(){{
			add("Ravish");
			add("Ajay");
		}});
	}};
	
	public static Map<Integer, List<String>> listMapperLamda=new HashMap<Integer, List<String>>(){{
		put(1, list.stream().filter( 
				new Predicate<String>() {

					@Override
					public boolean test(String list) {
						counter +=1;
						if(counter==2)
						{
							counter=0;
							return false;
						}
						else
						return true;
					}
				}
				).collect(Collectors.toList())
			);
	}};
	
	public static Map<Integer, List<String>> listMapperLamda2=new HashMap<Integer, List<String>>(){{
		put(1, list.stream().filter(list ->{
						counter +=1;
						if(counter>2)
						{
							counter=0;
							return false;
						}
						else
						return true;
				}
				).collect(Collectors.toList())
			);
	}};
	
	
	
	/*private Boolean getRequestValidation(List<String> listData, Predicate<String> predicate, Consumer<String> consumer)
	{
		return null;
	}*/

}



