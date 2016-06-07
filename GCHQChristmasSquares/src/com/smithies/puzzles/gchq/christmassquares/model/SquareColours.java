package com.smithies.puzzles.gchq.christmassquares.model;

public enum SquareColours {

	BLACK(0), 
	WHITE(1);
	
	private final Integer value;
	
	SquareColours(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() { return value; }
}
