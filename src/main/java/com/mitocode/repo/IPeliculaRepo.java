package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Pelicula;

//@Repository
public interface IPeliculaRepo extends JpaRepository<Pelicula, Integer>{

}
