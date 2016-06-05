package com.smithies.puzzles.gchq.christmassquares.model;

import java.util.List;

public enum AllInitialClues {
	
	ROW_CLUE_1("Row", 7, 3, 1, 1, 7),
	ROW_CLUE_2("Row", 1, 1, 2, 2, 1, 1),
	ROW_CLUE_3("Row", 1, 3, 1, 3, 1, 1, 3, 1),
	ROW_CLUE_4("Row", 1, 3, 1, 1, 6, 1, 3, 1),
	ROW_CLUE_5("Row", 1, 3, 1, 5, 2, 1, 3, 1),
	ROW_CLUE_6("Row", 1, 1, 2, 1, 1),
	ROW_CLUE_7("Row", 7, 1, 1, 1, 1, 1, 7),
	ROW_CLUE_8("Row", 3, 3),
	ROW_CLUE_9("Row", 1, 2, 3, 1, 1, 3, 1, 1, 2),
	ROW_CLUE_10("Row", 1, 1, 3, 2, 1, 1),
	ROW_CLUE_11("Row", 4, 1, 4, 2, 1, 2),
	ROW_CLUE_12("Row", 1, 1, 1, 1, 1, 4, 1, 3),
	ROW_CLUE_13("Row", 2, 1, 1, 1, 2, 5),
	ROW_CLUE_14("Row", 3, 2, 2, 6, 3, 1),
	ROW_CLUE_15("Row", 1, 9, 1, 1, 2, 1),
	ROW_CLUE_16("Row", 2, 1, 2, 2, 3, 1),
	ROW_CLUE_17("Row", 3, 1, 1, 1, 1, 5, 1),
	ROW_CLUE_18("Row", 1, 2, 2, 5),
	ROW_CLUE_19("Row", 7, 1, 2, 1, 1, 1, 3),
	ROW_CLUE_20("Row", 1, 1, 2, 1, 2, 2, 1),
	ROW_CLUE_21("Row", 1, 3, 1, 4, 5, 1),
	ROW_CLUE_22("Row", 1, 3, 1, 3, 10, 2),
	ROW_CLUE_23("Row", 1, 3, 1, 1, 6, 6),
	ROW_CLUE_24("Row", 1, 1, 2, 1, 1, 2),
	ROW_CLUE_25("Row", 7, 2, 1, 2, 5),
	
	COLUMN_CLUE_1("Column", 7, 3, 1, 1, 7),
	COLUMN_CLUE_2("Column", 1, 1, 2, 2, 1, 1),
	COLUMN_CLUE_3("Column", 1, 3, 1, 3, 1, 3, 1, 3, 1),
	COLUMN_CLUE_4("Column", 1, 3, 1, 1, 5, 1, 3, 1),
	COLUMN_CLUE_5("Column", 1, 3, 1, 1, 4, 1, 3, 1),
	COLUMN_CLUE_6("Column", 1, 1, 1, 2, 1, 1),
	COLUMN_CLUE_7("Column", 7, 1, 1, 1, 1, 1, 7),
	COLUMN_CLUE_8("Column", 1, 1, 3),
	COLUMN_CLUE_9("Column", 2, 1, 2, 1, 8, 2, 1),
	COLUMN_CLUE_10("Column", 2, 2, 1, 2, 1, 1, 1, 2),
	COLUMN_CLUE_11("Column", 1, 7, 3, 2, 1),
	COLUMN_CLUE_12("Column", 1, 2, 3, 1, 1, 1, 1, 1),
	COLUMN_CLUE_13("Column", 4, 1, 1, 2, 6),
	COLUMN_CLUE_14("Column", 3, 3, 1, 1, 1, 3, 1),
	COLUMN_CLUE_15("Column", 1, 2, 5, 2, 2),
	COLUMN_CLUE_16("Column", 2, 2, 1, 1, 1, 1, 1, 2, 1),
	COLUMN_CLUE_17("Column", 1, 3, 3, 2, 1, 8, 1),
	COLUMN_CLUE_18("Column", 6, 2, 1),
	COLUMN_CLUE_19("Column", 7, 1, 4, 1, 1, 3),
	COLUMN_CLUE_20("Column", 1, 1, 1, 1, 4),
	COLUMN_CLUE_21("Column", 1, 3, 1, 3, 7, 1),
	COLUMN_CLUE_22("Column", 1, 3, 1, 1, 1, 2, 1, 1, 4),
	COLUMN_CLUE_23("Column", 1, 3, 1, 4, 3, 3),
	COLUMN_CLUE_24("Column", 1, 1, 2, 2, 2, 6, 1),
	COLUMN_CLUE_25("Column", 7, 1, 3, 2, 1, 1);
		
	private final String clueType;
	private final Integer[] clues;
	
	AllInitialClues(String clueType, Integer... clues) {
		this.clueType = clueType;
		this.clues = clues;
	}
	
	public String getClueType() { return clueType; }
	public Integer getNumberOfClues() { return clues.length; }
	public Integer[] getClues() { return clues; }
	public Integer getClue(int index) { return clues[index]; }
	
	public Integer squaresAccountedFor() {
		Integer squares = 0;
		for (int i=0; i < getNumberOfClues(); i++) {
			squares += getClue(i);
		}
		squares += getNumberOfClues() - 1;
		return squares;
	}
	
}

