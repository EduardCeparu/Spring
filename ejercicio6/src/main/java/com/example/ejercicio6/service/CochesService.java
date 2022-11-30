package com.example.ejercicio6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio6.model.Coches;
import com.example.ejercicio6.repository.ICochesRepository;

@Service
public class CochesService {
    
    @Autowired
    private ICochesRepository cochesRepository;

    public List<Coches>listaCoches(){
        return cochesRepository.findAll();
    }

    public Coches guardarCoche(Coches coche){
        return cochesRepository.save(coche);
    }

    
}
