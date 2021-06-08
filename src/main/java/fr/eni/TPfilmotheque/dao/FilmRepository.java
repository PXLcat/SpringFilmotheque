package fr.eni.TPfilmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.TPfilmotheque.BO.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
