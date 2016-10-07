package com.shankar.chapter.two;

import java.util.List;

public class ApplePrinterSimple implements ApplePrinter {

	@Override
	public void acceptApple(List <Apple> apples) {
		
		for(Apple apple : apples) {
			String result =  apple.getColor() + " apple weight is : "+apple.getWeight();
			System.out.println(result);
			
		}
		
		
	}
	
	

}
