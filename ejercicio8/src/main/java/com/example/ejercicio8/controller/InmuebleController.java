package com.example.ejercicio8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.ejercicio8.model.Inmueble;
import com.example.ejercicio8.service.InmuebleService;

@Controller
public class InmuebleController {
    
    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("inmueble", new Inmueble());
        return "form";
    }

    @PostMapping("/save")
    public String guardar(Inmueble inmueble){
         inmuebleService.guardar(inmueble);
         return "redirect:/form";
    }
}
