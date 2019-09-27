package com.practice.set1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionImplementor {
	
	private static List<String> list=new ArrayList<String>(){{
		add("Ravi");
		add("Vijay");
		add("Ravish");
		add("Ajay");
	}};//Creating arraylist 
		
	private static Map<Integer, List<String>> listMapper=new HashMap<Integer, List<String>>(){{
		put(1,new ArrayList<String>(){{
			add("Ravi");
			add("Vijay");
		}});
		put(2,new ArrayList<String>(){{
			add("Ravish");
			add("Ajay");
		}});
	}};

	public static List<String> getList() {
		return list;
	}

	public static Map<Integer, List<String>> getListMapper() {
		return listMapper;
	}
	
	public static Map<Integer, Map<Integer, List<String>>> listMapper1=new HashMap<Integer, Map<Integer, List<String>>>()
			{
		{
			put(1,listMapper);
		}
			};

}
