package com.shankar.chapter.two;

public class AppleWeightPredicateImpl implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		
		return apple.getWeight() >= 150.0;
		
	}

	
	
}
