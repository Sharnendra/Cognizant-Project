package com.practice.set2;

public class string {
	
	public static void main(String[] args) {
	
		String s="ABCDECDE";
		
		char[] cr=s.toCharArray();
		
		for(int i=0,count=0;i<s.length();i++)
		{
			if(s.indexOf(cr[i],i+1)!=-1 && count==0)
			{
				System.out.println(cr[i]+" -> "+s.indexOf(cr[i],i+1));
				count=1;
			}
		}
		
		
		
		
		
	}

}
