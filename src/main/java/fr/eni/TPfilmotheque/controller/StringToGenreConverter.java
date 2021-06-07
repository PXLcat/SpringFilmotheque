package fr.eni.TPfilmotheque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.TPfilmotheque.BO.Genre;
import fr.eni.TPfilmotheque.service.GenreService;


@Component
public class StringToGenreConverter implements Converter<String, Genre>{

	private GenreService service;
	
	@Autowired
	public void setGenreService(GenreService service) {
		this.service = service;
	}
	
	@Override
	public Genre convert(String id) {
		Integer theId = Integer.parseInt(id);
		
		Genre test = service.getMapGenres().get(theId);
		
		return test;
		
	}
	
}

