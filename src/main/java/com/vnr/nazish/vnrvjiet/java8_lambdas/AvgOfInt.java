package com.vnr.nazish.vnrvjiet.java8_lambdas;

import java.util.*; 
import java.util.stream.IntStream; 

public class AvgOfInt {
	 public static void average() 
	    {
	        IntStream stream = IntStream.of(1,2,3,4,5,6,7,8,9,10); 
	        OptionalDouble obj1 = stream.average(); 
	        if (obj1.isPresent()) { 
	            System.out.println(obj1.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("Sorry average cannot be calculated!"); 
	        } 
	    } 

}