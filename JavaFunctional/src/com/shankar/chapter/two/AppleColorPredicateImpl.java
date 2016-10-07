package com.shankar.chapter.two;

public class AppleColorPredicateImpl implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		
		return "green".equalsIgnoreCase(apple.getColor());
	}

	
}
