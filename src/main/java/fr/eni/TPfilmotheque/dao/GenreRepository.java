package fr.eni.TPfilmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.TPfilmotheque.BO.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
