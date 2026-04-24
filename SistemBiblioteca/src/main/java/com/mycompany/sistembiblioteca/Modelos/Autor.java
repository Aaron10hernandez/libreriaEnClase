/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

/**
 *
 * @author ESTUDIANTE
 */
public class Autor {
    private String idAutor;
    private  final String name;
    private String paisAutor;
    private int anioNacimientoAutor;

    public Autor(String name, String idAutor, String paisAutor, int anioNacimientoAutor) {
        this.name = name;
        this.idAutor = idAutor;
        this.paisAutor = paisAutor;
        this.anioNacimientoAutor = anioNacimientoAutor;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public final String getName() {
        return name;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

    public int getAnioNacimientoAutor() {
        return anioNacimientoAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }

    public void setAnioNacimientoAutor(int anioNacimientoAutor) {
        this.anioNacimientoAutor = anioNacimientoAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", paisAutor=" + paisAutor + ", anioNacimientoAutor=" + anioNacimientoAutor + '}';
    }


    
}
