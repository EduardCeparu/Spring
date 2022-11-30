package com.example.ejercicio11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.ejercicio11.service.ZapatoService;

@Controller
@RequestMapping("/zapato")
public class ZapatoController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/listar")
    public String mostrarZapato(Model model){
        
        model.addAttribute("zapatos", zapatoService.listarZapatos());
        return "zapato";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable Long id){
        zapatoService.borrarPorId(id);
        return "redirect:/zapato/listar";
    }
}
