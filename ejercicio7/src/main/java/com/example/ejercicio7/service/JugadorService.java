package com.example.ejercicio7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio7.model.Jugador;
import com.example.ejercicio7.repository.IJugadorRepository;

@Service
public class JugadorService {
    
    @Autowired
    private IJugadorRepository jugadorRepository;

    public List<Jugador> listarJugadores(){
        return jugadorRepository.findAll();
    }
}
