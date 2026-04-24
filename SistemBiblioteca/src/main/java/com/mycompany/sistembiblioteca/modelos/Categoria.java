/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistembiblioteca.modelos;

import com.mycompany.sistembiblioteca.modelos.Libro;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    private static int contadorId = 1;
    private int Id;
    private final String name;
    private ArrayList<Libro> libros;
    
    

    public Categoria(String name) {
        this.Id = contadorId++;
        this.name = name;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public int getId() { return Id; }
    public String getNombre() { return name; }
    
    public ArrayList<Libro> getLibros() { return libros; }

    @Override
    public String toString() {
        return "ID: " + Id + " | Categoría: " + name;
    }
    
    public static Categoria buscarNombreCategoria(String nombre, Biblioteca biblioteca) {

        Categoria variable = null;

        for(int i = 0; i < biblioteca.getCategorias().size(); i++) {

            if(nombre.equals(biblioteca.getCategorias().get(i).getNombre())) {
                System.out.println("Categoría encontrada exitosamente");
                variable = biblioteca.getCategorias().get(i);
                break; 
            }
        }

        return variable;
    }
    
    public static Libro buscarNombreLibro(String nombre, Biblioteca biblioteca){
            
        Libro variable = null;
        
        for(int i =0; i < biblioteca.getCategorias().size(); i++){
            
            Categoria categoriaActual = biblioteca.getCategorias().get(i);
            
            for(int j=0; j < categoriaActual.getLibros().size(); j++  ){
                
                if(nombre == categoriaActual.getLibros().get(j).getTitulo()){
                    
                    variable=categoriaActual.getLibros().get(j);
                }
            }
        }
        return variable;
    }
    
}