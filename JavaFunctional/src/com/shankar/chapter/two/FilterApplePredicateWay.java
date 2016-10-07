package com.shankar.chapter.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApplePredicateWay {
	
	
	static List<Apple> inventory = Arrays.asList(new Apple("green",80),
            new Apple("green", 155),
            new Apple("red", 120));
	
	public static void main(String[] args) {
		
		System.out.println(filterByPredicate(inventory, new AppleColorPredicateImpl()));
		System.out.println(filterByPredicate(inventory, new AppleWeightPredicateImpl()));
		
		
		
		System.out.println("==========================Printing formatted apples===============");
		System.out.println("All green apples");
		new ApplePrinterFancy().acceptApple(filterByPredicate(inventory, new AppleColorPredicateImpl()));
		
		System.out.println("All heavy appples");
		new ApplePrinterFancy().acceptApple(filterByPredicate(inventory, new AppleWeightPredicateImpl()));
	}

	private static List<Apple> filterByPredicate(List<Apple> inventory2, ApplePredicate p) {
		
		List<Apple> results = new ArrayList<>();
		
		for( Apple apple : inventory2) {
			
			if(p.test(apple)) 
				results.add(apple);	
		}
		
		return results;
	}
	
	

}
