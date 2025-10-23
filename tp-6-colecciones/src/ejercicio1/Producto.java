/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Producto {

    // Atributos de la clase Producto (Encapsulamiento con private)
    private String id; 
    private String nombre; 
    private double precio; 
    private int cantidad; 
    private CategoriaProducto categoria; // Categoría del producto (usando el enum) [cite: 32]

    // Constructor para inicializar un nuevo Producto con todos sus atributos
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Métodos Requeridos y Getters/Setters 
    public void mostrarInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.printf("Precio: $%.2f%n", this.precio);
        System.out.println("Stock Disponible: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria.name() + " (" + this.categoria.getDescripcion() + ")");
    }

    // Getters para acceder a los atributos desde otras clases (ej: Inventario)

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}