package fr.eni.TPfilmotheque.controller;

import java.util.Map;

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
		Long theId = Long.parseLong(id);
		
		Map<Long,Genre> map = service.getMapGenres();
		
		Genre test = map.get(theId);
		
		return test;
		
	}
	
}

