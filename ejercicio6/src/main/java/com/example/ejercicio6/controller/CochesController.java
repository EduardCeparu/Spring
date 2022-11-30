package com.example.ejercicio6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ejercicio6.model.Coches;
import com.example.ejercicio6.service.CochesService;

@Controller
public class CochesController {
    
    @Autowired
    private CochesService cocheService;

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("coche", new Coches());
        return "form";
    }

    @PostMapping("/save")
    private String save(Coches coche){
        cocheService.guardarCoche(coche);
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    private String lista(Model model){
        model.addAttribute("coches", cocheService.listaCoches());
        return "lista";
    }
}
