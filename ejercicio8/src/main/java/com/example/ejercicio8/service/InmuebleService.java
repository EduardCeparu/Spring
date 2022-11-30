package com.example.ejercicio8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio8.model.Inmueble;
import com.example.ejercicio8.repository.IInmuebleRepository;

@Service
public class InmuebleService {
    
    @Autowired
    private IInmuebleRepository inmuebleRepository;

    public Inmueble guardar(Inmueble inmueble){
        return inmuebleRepository.save(inmueble);
    }
}
