/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;
import java.util.UUID;

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    
    private static int contadorId = 1;
    private final String id;
    private Libro libro;
    private String usuario;
    private String fecha;
    

    public Prestamo(Libro libro, String usuario, String fecha) {
        this.id = UUID.randomUUID().toString();     // ID aleatorio automatico
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
    
    public String getId() { return id; }
    public Libro getLibro() { return libro; }
    
    public void prestar(Libro libro) {
    
        if(libro == null) {
            System.out.println("Error: el libro no existe.");
        return;
        }

        if(!libro.isDisponible()) {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
        return;
        }

        libro.setDisponible(false); // ✅ Lo marca como no disponible
        System.out.println("Libro '" + libro.getTitulo() + "' prestado exitosamente!");
        }
    
    public void devolver(Libro libro) {
        
      if(libro == null) {
        System.out.println("Error: el libro no existe.");
        return;
        }

        if(libro.isDisponible()) {
        System.out.println("El libro ya está disponible, no fue prestado.");
        return;
        }

        libro.setDisponible(true);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto exitosamente!");
        }
    
    
}
