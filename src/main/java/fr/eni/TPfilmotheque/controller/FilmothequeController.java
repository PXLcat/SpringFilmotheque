package fr.eni.TPfilmotheque.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.TPfilmotheque.BO.Film;
import fr.eni.TPfilmotheque.service.GenreService;



@Controller
@SessionAttributes("listeFilms")
public class FilmothequeController {

	private GenreService genreService;
	
	@Autowired
	public void setGenreService(GenreService genreService) {
		this.genreService = genreService;
	}
	
	@ModelAttribute("listeFilms") //TODO gérer entièrement dans le service
	public ArrayList<Film> initListePersonnes() {
		return new ArrayList<Film>();
	}

	@GetMapping("/formulaireFilms" )
	public String afficherFormulaire(Model model) {
		model.addAttribute("film", new Film());
		model.addAttribute("listeGenres", genreService.getListeGenres());
		return "formulaireFilms";
	}

	@PostMapping("/formulaireFilms") 
	public String ajoutFilm(@ModelAttribute("film") Film film,
			@ModelAttribute("listeFilms") List<Film> listeFilms) {

		listeFilms.add(film);
		return "redirect:/listeFilms";
	}

	@GetMapping({ "/", "/listeFilms"})
	public String afficherListeFilms() {
		return "listeFilms";
	}
	
}
