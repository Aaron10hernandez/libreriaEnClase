/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistembiblioteca.vista;

import com.mycompany.sistembiblioteca.modelos.Autor;
import static com.mycompany.sistembiblioteca.modelos.Autor.buscarNombreAutor;
import com.mycompany.sistembiblioteca.modelos.Biblioteca;
import com.mycompany.sistembiblioteca.modelos.Categoria;
import static com.mycompany.sistembiblioteca.modelos.Categoria.buscarNombreCategoria;
import static com.mycompany.sistembiblioteca.modelos.Categoria.buscarNombreLibro;
import com.mycompany.sistembiblioteca.modelos.Libro;
import com.mycompany.sistembiblioteca.modelos.Prestamo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SistemBiblioteca {
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        System.out.println("=======SISTEMA GESTION BIBLIOTECA==========");

        int opcion;
        
        do{
            System.out.println("1. Crear nueva categoria");
            System.out.println("2. Agregar nuevo Autor");
            System.out.println("3. Agregar nuevo Libro");
            System.out.println("4. Realizar Préstamo");
            System.out.println("5. Devolver Libro Prestado");
            System.out.println("6. Ver Libros Disponibles");
            System.out.println("7. Ver Detalles de Autor");
            System.out.println("8. Ver Libros de una Categoría");
            System.out.println("9. Ver Multas Acumuladas");
            System.out.println("10. Ver Estadísticas");
            System.out.println("11. Salir");
            
            switch(opcion){
                
                case 1:
                    
                    System.out.print("Nombre de la nueva categoría: ");
                    String nombre = sc.nextLine();
                    Categoria nuevaCategoria = new Categoria(nombre);
                    biblioteca.setCategorias(nuevaCategoria);
                    System.out.println("Categoría '" + nombre + "' creada.");
                    break;
                  
                case 2:
                    System.out.print("Nombre del autor: ");
                    String nombreAutor = sc.nextLine();
                    System.out.print("Pais del autor: ");
                    String pais = sc.nextLine();
                    System.out.print("Año de nacimiento: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    Autor nuevoAutor = new Autor(nombreAutor, "", pais, anio);
                    biblioteca.setAutores(nuevoAutor);
                    System.out.println("Autor '" + nombreAutor + "' agregado.");
                    break;
                    
                case 3:
                     System.out.print("Título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Nombre del autor: ");
                    String aNombre = sc.nextLine();
                    System.out.print("Nombre de la categoría: ");
                    String cNombre = sc.nextLine();

                    Autor autorLibro = buscarNombreAutor(aNombre, biblioteca);
                    Categoria catLibro = buscarNombreCategoria(cNombre, biblioteca);

                    if (autorLibro == null) {
                        System.out.println("Autor no encontrado.");
                    } else if (catLibro == null) {
                        System.out.println("Categoría no encontrada.");
                    } else {
                        Libro nuevoLibro = new Libro("", titulo, autorLibro, catLibro, true);
                        biblioteca.agregarLibro(nuevoLibro);
                        catLibro.agregarLibro(nuevoLibro); 
                        System.out.println("Libro '" + titulo + "' agregado.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Nombre del libro a prestar: ");
                    String nombreLibro = sc.nextLine();
                    System.out.print("Nombre del usuario: ");
                    String usuario = sc.nextLine();

                    Libro libroPrestar = buscarNombreLibro(nombreLibro, biblioteca);

                    if (libroPrestar == null) {
                        System.out.println("Libro no encontrado.");
                    } else if (!libroPrestar.isDisponible()) {
                        System.out.println("El libro no está disponible.");
                    } else {
                        Prestamo nuevoPrestamo = new Prestamo(libroPrestar, usuario, "");
                        nuevoPrestamo.prestar(libroPrestar);
                        biblioteca.setPrestamos(nuevoPrestamo);
                    }
                    break;
                    
                case 5:
                    System.out.print("Nombre del libro a devolver: ");
                    String libroDevolver = sc.nextLine();

                    Libro libroEncontrado = buscarNombreLibro(libroDevolver, biblioteca);

                    if (libroEncontrado == null) {
                        System.out.println("Libro no encontrado.");
                    } else {
                        
                        Prestamo prestamoActivo = null;
                        for (Prestamo p : biblioteca.getPrestamos()) {
                            if (p.getLibro().getTitulo().equals(libroDevolver) && !p.getLibro().isDisponible()) {
                                prestamoActivo = p;
                                break;
                            }
                        }
                        if (prestamoActivo == null) {
                            System.out.println("No hay prestamo activo para ese libro.");
                        } else {
                            prestamoActivo.devolver(libroEncontrado);
                        }
                    }
                    break;
                  
                case 6:
                    biblioteca.verLibrosDisponible();
                    break;
                    
                case 7:
                    System.out.print("Nombre del autor: ");
                    String buscarAutor = sc.nextLine();
                    Autor autorEncontrado = buscarNombreAutor(buscarAutor, biblioteca);
                    if (autorEncontrado == null) {
                        System.out.println("Autor no encontrado.");
                    } else {
                        autorEncontrado.verDetallesAutor(buscarAutor, biblioteca);
                    }
                    break;
                    
                case 8:
                    System.out.print("Nombre de la categoria: ");
                    String buscarCat = sc.nextLine();
                    Categoria catEncontrada = buscarNombreCategoria(buscarCat, biblioteca);
                    if (catEncontrada == null) {
                        System.out.println("Categoria no encontrada.");
                    } else {
                        ArrayList<Libro> librosCategoria = catEncontrada.buscarLibrosPorCategoria();
                        if (librosCategoria.isEmpty()) {
                            System.out.println("No hay libros en esta categoria.");
                        } else {
                            System.out.println("\n---- LIBROS EN " + buscarCat.toUpperCase() + " ----");
                            for (Libro l : librosCategoria) {
                                System.out.println("- " + l.getTitulo()
                                    + " | Autor: " + l.getAutor().getName()
                                    + " | Disponible: " + (l.isDisponible() ? "Si" : "No"));
                            }
                        }
                    }
                    break;
                   
                    
                case 9:
                    System.out.print("Nombre del usuario: ");
                    String usuarioMultas = sc.nextLine();
                    biblioteca.verMultasAcumuladas(usuarioMultas);
                    break;
                  
                case 10:
                    biblioteca.verEstadisticas();
                    break;
                    
                case 11:
                    System.exit(0);
                    break;   
                    
                default:
                    System.out.println("Error! Ingrese una opcion valida...");
                    break;
                
                
            }
            
        }while(opcion != 11) ;
        
    }
}
       