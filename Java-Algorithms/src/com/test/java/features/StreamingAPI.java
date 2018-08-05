package com.test.java.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList("Rahul", "Vishal", "Pravin", "Rahul");
		System.out.println("Original List "+stringList);
		
		List<String> distinctList = stringList.stream()
											 .distinct()
											 .collect(Collectors.toList());
		
		
		System.out.println("distinctList "+distinctList);
		
									
		
	}

}
