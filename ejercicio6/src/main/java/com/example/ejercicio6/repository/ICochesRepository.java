package com.example.ejercicio6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio6.model.Coches;

@Repository
public interface ICochesRepository extends JpaRepository<Coches, Long> {
    
}
