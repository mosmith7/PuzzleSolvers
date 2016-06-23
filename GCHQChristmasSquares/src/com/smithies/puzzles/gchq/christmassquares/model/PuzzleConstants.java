package com.smithies.puzzles.gchq.christmassquares.model;

import java.util.ArrayList;
import java.util.List;

public class PuzzleConstants {

	public static final int NUMBER_OF_ROWS = 25;
	public static final int NUMBER_OF_COLUMNS = 25;
	
	public static final List<List<Integer>> INITIAL_BOARD = getInitialBoard();
	public static final List<AllInitialClues> ROW_CLUES = getAllRowClues();
	public static final List<AllInitialClues> COLUMN_CLUES = getAllColumnClues();
	
	private static List<List<Integer>> getInitialBoard() {
		List<List<Integer>> initialBoard = new ArrayList<>();
		initialBoard.add(RowInitialColourValues.ROW_1.getRowNumber(), RowInitialColourValues.ROW_1.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_2.getRowNumber(), RowInitialColourValues.ROW_2.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_3.getRowNumber(), RowInitialColourValues.ROW_3.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_4.getRowNumber(), RowInitialColourValues.ROW_4.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_5.getRowNumber(), RowInitialColourValues.ROW_5.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_6.getRowNumber(), RowInitialColourValues.ROW_6.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_7.getRowNumber(), RowInitialColourValues.ROW_7.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_8.getRowNumber(), RowInitialColourValues.ROW_8.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_9.getRowNumber(), RowInitialColourValues.ROW_9.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_10.getRowNumber(), RowInitialColourValues.ROW_10.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_11.getRowNumber(), RowInitialColourValues.ROW_11.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_12.getRowNumber(), RowInitialColourValues.ROW_12.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_13.getRowNumber(), RowInitialColourValues.ROW_13.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_14.getRowNumber(), RowInitialColourValues.ROW_14.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_15.getRowNumber(), RowInitialColourValues.ROW_15.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_16.getRowNumber(), RowInitialColourValues.ROW_16.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_17.getRowNumber(), RowInitialColourValues.ROW_17.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_18.getRowNumber(), RowInitialColourValues.ROW_18.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_19.getRowNumber(), RowInitialColourValues.ROW_19.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_20.getRowNumber(), RowInitialColourValues.ROW_20.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_21.getRowNumber(), RowInitialColourValues.ROW_21.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_22.getRowNumber(), RowInitialColourValues.ROW_22.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_23.getRowNumber(), RowInitialColourValues.ROW_23.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_24.getRowNumber(), RowInitialColourValues.ROW_24.getInitialColourValues());
		initialBoard.add(RowInitialColourValues.ROW_25.getRowNumber(), RowInitialColourValues.ROW_25.getInitialColourValues());
		return initialBoard;
	}
	
	private static List<AllInitialClues> getAllRowClues() {
		List<AllInitialClues> rowClues = new ArrayList<>();
		rowClues.add(AllInitialClues.ROW_CLUE_1);
		rowClues.add(AllInitialClues.ROW_CLUE_2);
		rowClues.add(AllInitialClues.ROW_CLUE_3);
		rowClues.add(AllInitialClues.ROW_CLUE_4);
		rowClues.add(AllInitialClues.ROW_CLUE_5);
		rowClues.add(AllInitialClues.ROW_CLUE_6);
		rowClues.add(AllInitialClues.ROW_CLUE_7);
		rowClues.add(AllInitialClues.ROW_CLUE_8);
		rowClues.add(AllInitialClues.ROW_CLUE_9);
		rowClues.add(AllInitialClues.ROW_CLUE_10);
		rowClues.add(AllInitialClues.ROW_CLUE_11);
		rowClues.add(AllInitialClues.ROW_CLUE_12);
		rowClues.add(AllInitialClues.ROW_CLUE_13);
		rowClues.add(AllInitialClues.ROW_CLUE_14);
		rowClues.add(AllInitialClues.ROW_CLUE_15);
		rowClues.add(AllInitialClues.ROW_CLUE_16);
		rowClues.add(AllInitialClues.ROW_CLUE_17);
		rowClues.add(AllInitialClues.ROW_CLUE_18);
		rowClues.add(AllInitialClues.ROW_CLUE_19);
		rowClues.add(AllInitialClues.ROW_CLUE_20);
		rowClues.add(AllInitialClues.ROW_CLUE_21);
		rowClues.add(AllInitialClues.ROW_CLUE_22);
		rowClues.add(AllInitialClues.ROW_CLUE_23);
		rowClues.add(AllInitialClues.ROW_CLUE_24);
		rowClues.add(AllInitialClues.ROW_CLUE_25);
		return rowClues;
	}
	
	private static List<AllInitialClues> getAllColumnClues() {
		List<AllInitialClues> columnClues = new ArrayList<>();
		columnClues.add(AllInitialClues.COLUMN_CLUE_1);
		columnClues.add(AllInitialClues.COLUMN_CLUE_2);
		columnClues.add(AllInitialClues.COLUMN_CLUE_3);
		columnClues.add(AllInitialClues.COLUMN_CLUE_4);
		columnClues.add(AllInitialClues.COLUMN_CLUE_5);
		columnClues.add(AllInitialClues.COLUMN_CLUE_6);
		columnClues.add(AllInitialClues.COLUMN_CLUE_7);
		columnClues.add(AllInitialClues.COLUMN_CLUE_8);
		columnClues.add(AllInitialClues.COLUMN_CLUE_9);
		columnClues.add(AllInitialClues.COLUMN_CLUE_10);
		columnClues.add(AllInitialClues.COLUMN_CLUE_11);
		columnClues.add(AllInitialClues.COLUMN_CLUE_12);
		columnClues.add(AllInitialClues.COLUMN_CLUE_13);
		columnClues.add(AllInitialClues.COLUMN_CLUE_14);
		columnClues.add(AllInitialClues.COLUMN_CLUE_15);
		columnClues.add(AllInitialClues.COLUMN_CLUE_16);
		columnClues.add(AllInitialClues.COLUMN_CLUE_17);
		columnClues.add(AllInitialClues.COLUMN_CLUE_18);
		columnClues.add(AllInitialClues.COLUMN_CLUE_19);
		columnClues.add(AllInitialClues.COLUMN_CLUE_20);
		columnClues.add(AllInitialClues.COLUMN_CLUE_21);
		columnClues.add(AllInitialClues.COLUMN_CLUE_22);
		columnClues.add(AllInitialClues.COLUMN_CLUE_23);
		columnClues.add(AllInitialClues.COLUMN_CLUE_24);
		columnClues.add(AllInitialClues.COLUMN_CLUE_25);
		return columnClues;
	}
}
