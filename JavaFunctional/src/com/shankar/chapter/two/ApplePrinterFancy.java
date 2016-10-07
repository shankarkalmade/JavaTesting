package com.shankar.chapter.two;

import java.util.List;

public class ApplePrinterFancy implements ApplePrinter {

	@Override
	public void acceptApple(List<Apple> apples) {
		
		for(Apple apple: apples) {
			String character = apple.getWeight() >= 150.0 ? " Heavy " : " light ";
			
			String result = "A "+ character + apple.getColor() + " Apple ";
			System.out.println(result);
			
		
		}
		
	}
	
	

}
