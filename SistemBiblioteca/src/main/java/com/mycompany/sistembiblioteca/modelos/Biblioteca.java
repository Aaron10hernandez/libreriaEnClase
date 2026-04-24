/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Biblioteca {
    
    private ArrayList<Categoria> categorias;
    private ArrayList<Autor> autores;
    private ArrayList < Prestamo> prestamos;
    private ArrayList <Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Categoria> categorias, ArrayList<Autor> autores, ArrayList<Prestamo> prestamos) {
        this.categorias = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public ArrayList<Categoria> getCategorias() { 
        return categorias; 
    }
    
    public ArrayList<Autor> getAutores() { 
        return autores; 
    }
    
    public ArrayList<Prestamo> getPrestamos() { 
        return prestamos; 
    }
    
    public ArrayList<Libro> getLibros() { 
        return libros; 
    }
        
    public void setCategorias(Categoria nuevaCategoria) { 
        this.categorias.add(nuevaCategoria); 
    }
    
    public void setAutores(Autor nuevoAutor) { 
        this.autores.add(nuevoAutor); 
    }
    
    public void setPrestamos(Prestamo nuevoPrestamo) { 
        this.prestamos.add(nuevoPrestamo); 
    }
    
    public void agregarLibro(Libro nuevoLibro) { 
        if (this.libros == null) this.libros = new ArrayList<>();
        this.libros.add(nuevoLibro); 
    }
    
    public void verLibrosDisponible()   {
    boolean hayDisponibles = false;
    
    System.out.println("\n----LIBROS DISPONIBLES----");
    
    for(int i = 0; i < libros.size(); i++) {
        
        Libro libro = libros.get(i);
        
        if(libro.isDisponible()) {
            System.out.println("N°: " + (i + 1));
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor().getName());
            System.out.println("Categoría: " + libro.getCategoria().getNombre());
            System.out.println("--------------------------");
            hayDisponibles = true;
        }
    }
    
        if(!hayDisponibles) {
        System.out.println("No hay libros disponibles.");
        }
    }
    
}
    
    

