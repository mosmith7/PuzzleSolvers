package com.smithies.puzzles.gchq.christmassquares.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smithies.puzzles.gchq.christmassquares.model.AllInitialClues;
import com.smithies.puzzles.gchq.christmassquares.model.PuzzleConstants;
import com.smithies.puzzles.gchq.christmassquares.model.RowInitialColourValues;
import com.smithies.puzzles.gchq.christmassquares.model.SquareColours;
import com.smithies.puzzles.gchq.christmassquares.service.Board;

@Service
public class BoardImpl implements Board {
	
	@Override
	public List<List<Integer>> solveFirstStep(List<List<Integer>> initialBoard) {
		PuzzleConstants.ROW_CLUES.forEach(rowClue -> {
			if(rowClue.squaresAccountedFor()==PuzzleConstants.NUMBER_OF_ROWS) {
				Integer[] clues = rowClue.getClues();
				Integer numberOfClues = rowClue.getNumberOfClues();
				List<Integer> row = new ArrayList<>();
				for (int i=0; i<numberOfClues; i++) {
					for (int j=0; j<clues[i]; j++) {
						row.add(SquareColours.WHITE.getValue());
					}
					row.add(SquareColours.BLACK.getValue());
				}
				initialBoard.add(rowClue.getClueNumber(), row.subList(0, PuzzleConstants.NUMBER_OF_ROWS));
			}
		});
		return initialBoard;
	}
	

}
