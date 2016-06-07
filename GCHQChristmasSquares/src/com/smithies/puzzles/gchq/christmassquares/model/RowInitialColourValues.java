package com.smithies.puzzles.gchq.christmassquares.model;

import java.util.ArrayList;
import java.util.List;

public enum RowInitialColourValues {

	ROW_1(0),
	ROW_2(1),
	ROW_3(2),
	ROW_4(3),
	ROW_5(4),
	ROW_6(5),
	ROW_7(6),
	ROW_8(7),
	ROW_9(8),
	ROW_10(9),
	ROW_11(10),
	ROW_12(11),
	ROW_13(12),
	ROW_14(13),
	ROW_15(14),
	ROW_16(15),
	ROW_17(16),
	ROW_18(17),
	ROW_19(18),
	ROW_20(19),
	ROW_21(20),
	ROW_22(21),
	ROW_23(22),
	ROW_24(23),
	ROW_25(24);
	
	private final Integer WHITE_VALUE = SquareColours.WHITE.getValue();
	
	private final Integer BLACK_VALUE = SquareColours.BLACK.getValue();
	
	private List<Integer> initialColourValues = new ArrayList<>();
	
	private Integer rowNumber;
	
	public List<Integer> getInitialColourValues() { return this.initialColourValues; }
	
	public Integer getRowNumber() { return this.rowNumber; }
	
	//--------------------------------------------------------------------------------
	// Helper Methods to populate values
	//--------------------------------------------------------------------------------
	RowInitialColourValues(Integer rowNumber) {
		List<Integer> Row = new ArrayList<>();
		if (rowNumber == 3) {
			addRowValues(Row, row3WhiteColumnNumbers());
		}
		if (rowNumber == 8) {
			addRowValues(Row, row8WhiteColumnNumbers());
		}
		if (rowNumber == 16) {
			addRowValues(Row, row16WhiteColumnNumbers());
		}
		if (rowNumber == 21) {
			addRowValues(Row, row21WhiteColumnNumbers());
		}
		this.initialColourValues = Row;
		this.rowNumber = rowNumber;
	}
	
	private void addRowValues(List<Integer> Row, List whiteColumnNumbers) {
		for (int i=0; i<25; i++) {
			if (whiteColumnNumbers.contains((Integer) i)) {
				Row.add(i, WHITE_VALUE);
			} else {
				Row.add(i, BLACK_VALUE);
			}
		}
	}
	
	private List<Integer> row3WhiteColumnNumbers() {
		List<Integer> rowThreeWhiteColumnNumbers = new ArrayList<>();
		rowThreeWhiteColumnNumbers.add(3);
		rowThreeWhiteColumnNumbers.add(4);
		rowThreeWhiteColumnNumbers.add(12);
		rowThreeWhiteColumnNumbers.add(13);
		rowThreeWhiteColumnNumbers.add(21);
		return rowThreeWhiteColumnNumbers;
	}
	
	private List<Integer> row8WhiteColumnNumbers() {
		List<Integer> rowThreeWhiteColumnNumbers = new ArrayList<>();
		rowThreeWhiteColumnNumbers.add(6);
		rowThreeWhiteColumnNumbers.add(7);
		rowThreeWhiteColumnNumbers.add(10);
		rowThreeWhiteColumnNumbers.add(14);
		rowThreeWhiteColumnNumbers.add(15);
		rowThreeWhiteColumnNumbers.add(18);
		return rowThreeWhiteColumnNumbers;
	}
	
	private List<Integer> row16WhiteColumnNumbers() {
		List<Integer> rowThreeWhiteColumnNumbers = new ArrayList<>();
		rowThreeWhiteColumnNumbers.add(6);
		rowThreeWhiteColumnNumbers.add(11);
		rowThreeWhiteColumnNumbers.add(16);
		rowThreeWhiteColumnNumbers.add(20);
		return rowThreeWhiteColumnNumbers;
	}
	
	private List<Integer> row21WhiteColumnNumbers() {
		List<Integer> rowThreeWhiteColumnNumbers = new ArrayList<>();
		rowThreeWhiteColumnNumbers.add(3);
		rowThreeWhiteColumnNumbers.add(4);
		rowThreeWhiteColumnNumbers.add(9);
		rowThreeWhiteColumnNumbers.add(10);
		rowThreeWhiteColumnNumbers.add(15);
		rowThreeWhiteColumnNumbers.add(19);
		rowThreeWhiteColumnNumbers.add(20);
		return rowThreeWhiteColumnNumbers;
	}
}
