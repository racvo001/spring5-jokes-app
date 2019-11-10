package com.rachit.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rachit.joke.services.JokeService;

@Controller
public class JokeController {
	
	
	private JokeService jokeservice;

	@Autowired
	public JokeController(JokeService jokeservice) {
		
		this.jokeservice = jokeservice;
	}
	
@RequestMapping({"/",""})	
public String displayJoke( Model model)
{
   System.out.println("In Con troller");
	 model.addAttribute("joke",jokeservice.getJoke());
	 
	 
	 return  "chucknorris";
		

}

}