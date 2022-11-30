package com.example.ejercicio9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio9.model.Zapato;
import com.example.ejercicio9.repository.IZapatoRepository;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoRepository zapatoRepository;

    public Zapato buscarZapato(Long id){
        return zapatoRepository.findById(id).orElse(null);
    }
}
