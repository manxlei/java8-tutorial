package com.winterbe.java8.samples.robin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaTest1 {
	
	
	public static void  test1() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		System.out.println("===================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	}
	
	public static void  test3() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Supplier obj = str::toString;
		
		test3();
		System.out.println();
	}



	private static void test2() {
		List<String> stringCollection = new ArrayList<String>();
		stringCollection.add("Robin");
		stringCollection.add("Jason");
		stringCollection.add("Tony");
		stringCollection.add("Alisa");
		
		Optional<String> reduced =
			    stringCollection
			        .stream()
			        .sorted()
			        .reduce((s1, s2) -> s1 + "#" + s2);
		
		reduced.ifPresent(System.out::println);
	}

}
