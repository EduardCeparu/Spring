package com.example.ejercicio9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.ejercicio9.service.ZapatoService;

@Controller
@RequestMapping("/zapato")
public class ZapatoController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/{id}")
    public String mostrarZapato(@PathVariable Long id, Model model){
        
        model.addAttribute("zapato", zapatoService.buscarZapato(id));
        return "zapato";
    }
}
