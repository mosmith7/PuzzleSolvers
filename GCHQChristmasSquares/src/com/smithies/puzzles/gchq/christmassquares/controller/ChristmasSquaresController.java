package com.smithies.puzzles.gchq.christmassquares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smithies.puzzles.gchq.christmassquares.model.AllInitialClues;


@Controller 
public class ChristmasSquaresController {

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
	
	@RequestMapping("/intialBoard")
	public ModelAndView intialBoard() {
		ModelAndView model = new ModelAndView("InitialBoardPage"); // view name 
		model.addObject("rowClue1", "Row clue 1: " +  AllInitialClues.ROW_CLUE_1.getClues().toString());
		model.addObject("numberOfClues", "numberOfClues: " +  AllInitialClues.ROW_CLUE_1.getNumberOfClues().toString());
		model.addObject("rowClue1Entry0", "Row clue 1, entry 0: " +  AllInitialClues.ROW_CLUE_1.getClue(0).toString());
		model.addObject("squaresAccountedFor", "Row clue 7, squares accounted for: " +  AllInitialClues.ROW_CLUE_7.squaresAccountedFor().toString());
		return model;
	}
}


