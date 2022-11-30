package com.example.ejercicio8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio8.model.Inmueble;

public interface IInmuebleRepository extends JpaRepository<Inmueble, Long> {
    
}
