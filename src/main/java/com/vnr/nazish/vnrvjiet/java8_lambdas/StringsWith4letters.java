package com.vnr.nazish.vnrvjiet.java8_lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StringsWith4letters {
	public static List<Object> search(List<String> list) {
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void findStrings() {
		
		List<String> str = new ArrayList<String>();
		 str.add("abc"); 
	        str.add("aaa");
	        str.add("abcd");
	        str.add("bbb");
	        str.add("awer");
	        List<Object> s1 = search(str); 
	        System.out.println(s1);
		 
	}
}
