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
    }

    public static void setContadorId(int contadorId) {
        Prestamo.contadorId = contadorId;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
    public int getId() { return id; }
    public Libro getLibro() { return libro; }
    
    public void devolver(Libro libro) {
        
        libro.setDisponible(true);
        System.out.println("Libro devuelto exitosamente!");
        
    }
}
