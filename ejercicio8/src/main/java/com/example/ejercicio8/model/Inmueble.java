package com.example.ejercicio8.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "metros_cuadrados")
    private String metrosCuadrados;
    private String precio;

    public Inmueble(){

    }

    public Inmueble(Long id, String metrosCuadrados, String precio) {
        this.id = id;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setmetrosCuadrados(String metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
}
