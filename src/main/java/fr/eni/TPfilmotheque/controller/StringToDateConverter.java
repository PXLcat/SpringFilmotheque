package fr.eni.TPfilmotheque.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.TPfilmotheque.service.GenreService;

//@Component
public class StringToDateConverter implements Converter<String, Date>{


	
	@Override
	public Date convert(String txtDate) {
		
		
		return new Date();
		
	}
}
