package com.smithies.puzzles.gchq.christmassquares.model;

public enum AllInitialClues {
	
	ROW_CLUE_1(0, "Row", 7, 3, 1, 1, 7),
	ROW_CLUE_2(1, "Row", 1, 1, 2, 2, 1, 1),
	ROW_CLUE_3(2, "Row", 1, 3, 1, 3, 1, 1, 3, 1),
	ROW_CLUE_4(3, "Row", 1, 3, 1, 1, 6, 1, 3, 1),
	ROW_CLUE_5(4, "Row", 1, 3, 1, 5, 2, 1, 3, 1),
	ROW_CLUE_6(5, "Row", 1, 1, 2, 1, 1),
	ROW_CLUE_7(6, "Row", 7, 1, 1, 1, 1, 1, 7),
	ROW_CLUE_8(7, "Row", 3, 3),
	ROW_CLUE_9(8, "Row", 1, 2, 3, 1, 1, 3, 1, 1, 2),
	ROW_CLUE_10(9, "Row", 1, 1, 3, 2, 1, 1),
	ROW_CLUE_11(10, "Row", 4, 1, 4, 2, 1, 2),
	ROW_CLUE_12(11, "Row", 1, 1, 1, 1, 1, 4, 1, 3),
	ROW_CLUE_13(12, "Row", 2, 1, 1, 1, 2, 5),
	ROW_CLUE_14(13, "Row", 3, 2, 2, 6, 3, 1),
	ROW_CLUE_15(14, "Row", 1, 9, 1, 1, 2, 1),
	ROW_CLUE_16(15, "Row", 2, 1, 2, 2, 3, 1),
	ROW_CLUE_17(16, "Row", 3, 1, 1, 1, 1, 5, 1),
	ROW_CLUE_18(17, "Row", 1, 2, 2, 5),
	ROW_CLUE_19(18, "Row", 7, 1, 2, 1, 1, 1, 3),
	ROW_CLUE_20(19, "Row", 1, 1, 2, 1, 2, 2, 1),
	ROW_CLUE_21(20, "Row", 1, 3, 1, 4, 5, 1),
	ROW_CLUE_22(21, "Row", 1, 3, 1, 3, 10, 2),
	ROW_CLUE_23(22, "Row", 1, 3, 1, 1, 6, 6),
	ROW_CLUE_24(23, "Row", 1, 1, 2, 1, 1, 2),
	ROW_CLUE_25(24, "Row", 7, 2, 1, 2, 5),
	
	COLUMN_CLUE_1(0, "Column", 7, 3, 1, 1, 7),
	COLUMN_CLUE_2(1, "Column", 1, 1, 2, 2, 1, 1),
	COLUMN_CLUE_3(2, "Column", 1, 3, 1, 3, 1, 3, 1, 3, 1),
	COLUMN_CLUE_4(3, "Column", 1, 3, 1, 1, 5, 1, 3, 1),
	COLUMN_CLUE_5(4, "Column", 1, 3, 1, 1, 4, 1, 3, 1),
	COLUMN_CLUE_6(5, "Column", 1, 1, 1, 2, 1, 1),
	COLUMN_CLUE_7(6, "Column", 7, 1, 1, 1, 1, 1, 7),
	COLUMN_CLUE_8(7, "Column", 1, 1, 3),
	COLUMN_CLUE_9(8, "Column", 2, 1, 2, 1, 8, 2, 1),
	COLUMN_CLUE_10(9, "Column", 2, 2, 1, 2, 1, 1, 1, 2),
	COLUMN_CLUE_11(10, "Column", 1, 7, 3, 2, 1),
	COLUMN_CLUE_12(11, "Column", 1, 2, 3, 1, 1, 1, 1, 1),
	COLUMN_CLUE_13(12, "Column", 4, 1, 1, 2, 6),
	COLUMN_CLUE_14(13, "Column", 3, 3, 1, 1, 1, 3, 1),
	COLUMN_CLUE_15(14, "Column", 1, 2, 5, 2, 2),
	COLUMN_CLUE_16(15, "Column", 2, 2, 1, 1, 1, 1, 1, 2, 1),
	COLUMN_CLUE_17(16, "Column", 1, 3, 3, 2, 1, 8, 1),
	COLUMN_CLUE_18(17, "Column", 6, 2, 1),
	COLUMN_CLUE_19(18, "Column", 7, 1, 4, 1, 1, 3),
	COLUMN_CLUE_20(19, "Column", 1, 1, 1, 1, 4),
	COLUMN_CLUE_21(20, "Column", 1, 3, 1, 3, 7, 1),
	COLUMN_CLUE_22(21, "Column", 1, 3, 1, 1, 1, 2, 1, 1, 4),
	COLUMN_CLUE_23(22, "Column", 1, 3, 1, 4, 3, 3),
	COLUMN_CLUE_24(23, "Column", 1, 1, 2, 2, 2, 6, 1),
	COLUMN_CLUE_25(24, "Column", 7, 1, 3, 2, 1, 1);
		
	private final Integer clueNumber;
	private final String clueType;
	private final Integer[] clues;
	
	AllInitialClues(Integer clueNumber, String clueType, Integer... clues) {
		this.clueNumber = clueNumber;
		this.clueType = clueType;
		this.clues = clues;
	}
	
	public Integer getClueNumber() { return clueNumber; }
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

