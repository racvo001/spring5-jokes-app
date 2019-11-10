package com.rachit.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class JokeServiceImpl implements JokeService {
	

	public final ChuckNorrisQuotes chucknorrisquotes ;
	
	
	
	public JokeServiceImpl() {
		
		this.chucknorrisquotes = new ChuckNorrisQuotes ();
		
   //  this.chucknorrisquotes = chucknorrisquotes;
	}


	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chucknorrisquotes.getRandomQuote();
	}
	
	

}
