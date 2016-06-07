package com.smithies.puzzles.gchq.christmassquares.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smithies.puzzles.gchq.christmassquares.model.RowInitialColourValues;
import com.smithies.puzzles.gchq.christmassquares.service.Board;

@Service
public class BoardImpl implements Board {

	@Override
	public List<List<Integer>> getInitialBoard() {
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
	

}
