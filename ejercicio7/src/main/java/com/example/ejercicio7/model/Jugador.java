package com.example.ejercicio7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jugadores") 
public class Jugador {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido_uno;
    private String apellido_dos;
    private String estatura;
    private String posicion;
    private String equipo;

    public Jugador(){

    }

    public Jugador(Long id, String nombre, String apellido_uno, String apellido_dos, String estatura, String posicion,
            String equipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_uno = apellido_uno;
        this.apellido_dos = apellido_dos;
        this.estatura = estatura;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_uno() {
        return apellido_uno;
    }

    public void setApellido_uno(String apellido_uno) {
        this.apellido_uno = apellido_uno;
    }

    public String getApellido_dos() {
        return apellido_dos;
    }

    public void setApellido_dos(String apellido_dos) {
        this.apellido_dos = apellido_dos;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    

}
