package com.shankar.chapter.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FilterApplesOldWay {
	
	 static List<Apple> inventory = Arrays.asList(new Apple("green",80),
             new Apple("green", 155),
             new Apple("red", 120));
	 
	 
	 public static void main(String[] args) {
		
		 System.out.println(filterApplesByColor(inventory, "green"));
		 System.out.println(filterApplesByWeight(inventory, 150));
		 
	}


	private static List<Apple> filterApplesByColor(List<Apple> inventory2, String color) {
		
		List <Apple> result = new ArrayList<Apple>();
		
		for( Apple apple : inventory2) {
			
			if(apple.getColor().equalsIgnoreCase(color)) {
				
				result.add(apple);
				
			}
			
		}
		
		return result;
		
	}
	 
	private static List<Apple> filterApplesByWeight(List<Apple> inventory2, double weight) {
		
		List <Apple> result = new ArrayList<Apple>();
		
		for( Apple apple : inventory2) {
			
			if(apple.getWeight() >= weight) {
				
				result.add(apple);
				
			}
			
		}
		
		return result;
		
	}
	 
	 
	
	

}
