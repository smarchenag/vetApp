package com.vet.vetApp.model;

import jakarta.persistence.*;

@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int edad;
    private String raza;

    @ManyToOne(targetEntity = Usuario.class)
    private Usuario usuarioAmo;

    public Mascota(Long id, String nombre, int edad, String raza, Usuario usuarioAmo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.usuarioAmo = usuarioAmo;
    }

    public Mascota() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Usuario getUsuarioAmo() {
        return usuarioAmo;
    }

    public void setUsuarioAmo(Usuario usuarioAmo) {
        this.usuarioAmo = usuarioAmo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", usuarioAmo=" + usuarioAmo +
                '}';
    }
}
