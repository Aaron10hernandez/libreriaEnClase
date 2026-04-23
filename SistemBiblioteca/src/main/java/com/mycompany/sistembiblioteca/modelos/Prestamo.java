/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    
    private static int contadorId = 1;
    private final int id;
    private Libro libro;
    private String usuario;
    private String fecha;

    public Prestamo(Libro libro, String usuario, String fecha) {
        this.id = contadorId++;
        this.libro = libro;
        this.usuario = usuario;
        this.fecha = fecha;
        this.libro.setDisponible(false);
    }

    public int getId() { return id; }
    public Libro getLibro() { return libro; }
    
    public void devolver() {
        this.libro.setDisponible(true);
    }
}
