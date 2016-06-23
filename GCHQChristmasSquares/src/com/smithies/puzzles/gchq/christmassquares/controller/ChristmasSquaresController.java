package com.smithies.puzzles.gchq.christmassquares.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smithies.puzzles.gchq.christmassquares.model.AllInitialClues;
import com.smithies.puzzles.gchq.christmassquares.model.PuzzleConstants;
import com.smithies.puzzles.gchq.christmassquares.service.Board;


@Controller 
public class ChristmasSquaresController {

	@Autowired
	private Board board;
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("HelloPage"); // view name 
		model.addObject("message", "hello world");
		return model;
	}
	
	@RequestMapping("/start")
	public ModelAndView hiWorld() {
		ModelAndView model = new ModelAndView("StartPage"); // view name 
		model.addObject("greeting", "Welcome to the starting page of the GCHQ squares puzzle solver");
		return model;
	}
	
	@RequestMapping("/clues")
	public ModelAndView intialClues() {
		ModelAndView model = new ModelAndView("CluePage"); // view name 
		model.addObject("rowClue1", "Row clue 1: " +  AllInitialClues.ROW_CLUE_1.getClues().toString());
		model.addObject("numberOfClues", "numberOfClues: " +  AllInitialClues.ROW_CLUE_1.getNumberOfClues().toString());
		model.addObject("rowClue1Entry0", "Row clue 1, entry 0: " +  AllInitialClues.ROW_CLUE_1.getClue(0).toString());
		model.addObject("squaresAccountedFor", "Row clue 7, squares accounted for: " +  AllInitialClues.ROW_CLUE_7.squaresAccountedFor().toString());
		return model;
	}
	
	@RequestMapping("/initialBoard")
	public ModelAndView intialBoard() {
		ModelAndView model = new ModelAndView("DisplayBoard"); // view name 
		// make a model with getters and setters and pass all the black/white values to this.
		// Use an two integers, row and column, to get a given colour.
		List<List<Integer>> initialBoard = PuzzleConstants.INITIAL_BOARD;
		model.addObject("board", initialBoard);
		return model;
	}
	
	@RequestMapping("/firstStep")
	public ModelAndView solveFirstStep() {
		ModelAndView model = new ModelAndView("DisplayBoard"); // view name 
		// make a model with getters and setters and pass all the black/white values to this.
		// Use an two integers, row and column, to get a given colour.
		List<List<Integer>> initialBoard = PuzzleConstants.INITIAL_BOARD;
		List<List<Integer>> updatedBoard = board.solveFirstStep(initialBoard);
		model.addObject("board", updatedBoard);
		return model;
	}
}


