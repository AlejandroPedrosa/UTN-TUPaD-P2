/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    
    //Agregar Libro
    public void agregarLibro(String isbn, String titulo, int añoPublicacion, Autor autor){
        Libro libro = new Libro(isbn, titulo, añoPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado con exito: " + titulo);
    }
    
    //listar libros
    public void listarLibros(){
        System.out.println("\n Libros disponibles");
        if (libros.isEmpty()) {
            System.out.println("la biblioteca esta vacia");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    //buscar libro por isbn
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libro = null;
        int i = 0;
        while (i < libros.size() && !libros.get(i).getIsbn().equals(isbn)) {            
            i++;
        }
        if (i < libros.size()) {
            libro = libros.get(i);
        }
        return libro;
    }
    
    //eliminar libro
    public void eliminarLibro(String isbn){
        Libro libro = buscarLibroPorIsbn(isbn);
        if(libro != null){
            libros.remove(libro);
            System.out.println("El libro fue eliminado: " + libro.getTitulo());
        }else {
            System.out.println("Libro no encontrado: " + isbn);
        }
    }
    
    //obtener cantidad de libro
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    //filtrar libros por años
    public void filtrarLibroPorAnio(int anio){
        System.out.println("\n libro publicados en " + anio);
        boolean encontrar = false;
        for (Libro libro : libros) {
            if (libro.getAñoPublicacion() == anio) {
                libro.mostrarInfo();
                encontrar = true;
            }
        }
        if (!encontrar) {
            System.out.println("No hay libros publicados en ese año");
        }
    }
    
    //autores disponibles
    public void mostrarAutoresDisponibles(){
        System.out.println("\n Autores disponibles en la biblioteca");
        ArrayList<String> autoresMostrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            String autorId = libro.getAutor().getId();
            if (!autoresMostrados.contains(autorId)) {
                libro.getAutor().mostrarInfo();
                autoresMostrados.add(autorId);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}
