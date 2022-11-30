package com.example.ejercicio6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coches")
public class Coches {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    @Column (name = "modelo")
    private String model;
    private int precio;

    public Coches(){}

    public Coches(Long id, String marca, String model, int precio) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 
}
