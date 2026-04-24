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


    public Biblioteca() {}

    public Biblioteca(ArrayList<Categoria> categorias, ArrayList<Autor> autores, ArrayList<Prestamo> prestamos, ArrayList<Libro> libros) {
        this.categorias = categorias;
        this.autores = autores;
        this.prestamos = prestamos;
        this.libros = libros;
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
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor().getName());
            System.out.println("Categoria: " + libro.getCategoria().getNombre());
            System.out.println("--------------------------");
            hayDisponibles = true;
        }
    }
    
        if(!hayDisponibles) {
        System.out.println("No hay libros disponibles.");
        }
    }
    
        public void verEstadisticas() {
        System.out.println("\n========== ESTADISTICAS ==========");

        int totalLibros = 0;
        int totalAutores = 0;       // 1. total
        int totalCategorias = 0;

        if (libros != null) {
            totalLibros = libros.size();
        }
        if (autores != null) {
            totalAutores = autores.size();
        }
        if (categorias != null) {
            totalCategorias = categorias.size();
        }

        System.out.println("\n--- Totales ---");
        System.out.println("Libros registrados : " + totalLibros);
        System.out.println("Autores registrados: " + totalAutores);
        System.out.println("Categorías         : " + totalCategorias);


        int disponibles = 0;         // 2. disponibles vs prestados
        int prestados = 0;

        if (libros != null) {
            for (int i = 0; i < libros.size(); i++) {
                if (libros.get(i).isDisponible()) {
                    disponibles++;
                } else {
                    prestados++;
                }
            }
        }

        System.out.println("\n--- Disponibilidad ---");
        System.out.println("Disponibles: " + disponibles);
        System.out.println("Prestados  : " + prestados);


        System.out.println("\n--- Categoría con más libros ---");           // 3. Ccategoria mayor libros
        if (categorias == null || categorias.isEmpty()) {
            System.out.println("Sin categorías registradas.");
        } else {
            Categoria categoriaMayor = categorias.get(0);
            for (int i = 1; i < categorias.size(); i++) {
                if (categorias.get(i).getLibros().size() > categoriaMayor.getLibros().size()) {
                    categoriaMayor = categorias.get(i);
                }
            }
            System.out.println(categoriaMayor.getNombre() + " con " + categoriaMayor.getLibros().size() + " libro(s).");
        }


        System.out.println("\n--- Autor con más libros ---");        // 4. AUTOR CON MÁS LIBR
        if (libros == null || libros.isEmpty()) {
            System.out.println("Sin libros registrados.");
        } else {
            Autor autorMayor = null;
            int maxLibros = 0;

            for (int i = 0; i < autores.size(); i++) {
                int count = 0;
                for (int j = 0; j < libros.size(); j++) {
                    if (libros.get(j).getAutor().getName().equals(autores.get(i).getName())) {
                        count++;
                    }
                }
                if (count > maxLibros) {
                    maxLibros = count;
                    autorMayor = autores.get(i);
                }
            }

            if (autorMayor != null) {
                System.out.println(autorMayor.getName() + " con " + maxLibros + " libro(s).");
            } else {
                System.out.println("Sin datos.");
            }
        }

        // 5. LIBRO MÁS PRESTADO
        System.out.println("\n--- Libro mas prestado ---");
        if (prestamos == null || prestamos.isEmpty()) {
            System.out.println("Sin prestamos registrados.");
        } else {
            String tituloMasPrestado = "";
            int maxPrestamos = 0;

            for (int i = 0; i < prestamos.size(); i++) {
                String titulo = prestamos.get(i).getLibro().getTitulo();
                int count = 0;
                for (int j = 0; j < prestamos.size(); j++) {
                    if (prestamos.get(j).getLibro().getTitulo().equals(titulo)) {
                        count++;
                    }
                }
                if (count > maxPrestamos) {
                    maxPrestamos = count;
                    tituloMasPrestado = titulo;
                }
            }
            System.out.println(tituloMasPrestado + " con " + maxPrestamos + " prestamo(s).");
        }

        // 6. TOTAL DE MULTAS
        System.out.println("\n--- Total multas acumuladas ---");
        double totalMultas = 0.0;

        if (prestamos != null) {
            for (int i = 0; i < prestamos.size(); i++) {
                totalMultas = totalMultas + prestamos.get(i).getMulta();
            }
        }
        System.out.println("$" + totalMultas);

        System.out.println("\n===================================");
        }
}


    
    
 
