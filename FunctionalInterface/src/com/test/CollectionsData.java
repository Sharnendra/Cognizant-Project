package com.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SuppressWarnings("serial")
public class CollectionsData {
	
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

}
