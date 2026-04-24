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
    private ArrayList<Libro> Libros;
    
    

    public Categoria(String name) {
        this.Id = contadorId++;
        this.name = name;
        this.Libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        Libros.add(libro);
    }

    public int getId() { return Id; }
    public String getNombre() { return name; }
    public ArrayList<Libro> getLibros() { return Libros; }

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
        
    public ArrayList<Libro> buscarLibrosPorCategoria() {
        return this.Libros;
    }


    public ArrayList<Libro> buscarLibrosPorCategoria(boolean soloDisponibles) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : this.Libros) {
            if (!soloDisponibles || libro.isDisponible()) {
            resultado.add(libro);
            }
        }
        return resultado;
    }

}
