package com.example.ejercicio11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio11.model.Zapato;
import com.example.ejercicio11.repository.IZapatoRepository;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoRepository zapatoRepository;

    public List<Zapato> listarZapatos(){
        return zapatoRepository.findAll();
    }

    public void borrarPorId(Long id){
        zapatoRepository.deleteById(id);
    }
}
