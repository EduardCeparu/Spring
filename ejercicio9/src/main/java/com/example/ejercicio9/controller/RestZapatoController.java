package com.example.ejercicio9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio9.model.Zapato;
import com.example.ejercicio9.service.ZapatoService;

@RestController
@RequestMapping("/api/zapato")
public class RestZapatoController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/{id}")
    public Zapato buscarZapato(@PathVariable Long id){
        return zapatoService.buscarZapato(id);
    }
}
