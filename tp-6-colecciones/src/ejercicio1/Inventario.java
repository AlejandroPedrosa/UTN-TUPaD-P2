/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    //Construtor
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    //agregar producto
    public void agregarProducto(Producto p){
        productos.add(p);
        System.out.println("El producto fue agregado " + p.getNombre());
    }
    
    //listar producto
    public void listarPorductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay producto");
            return;
        }
        System.out.println("Lista de todos los productos");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    //buscar por id
    public Producto buscarProductoPorId(String id){
        Producto p = null;
        int i = 0;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            p = this.productos.get(i);
        }        
        return p; 
    }
    
    //eliminar producto
    public void eliminarProducto(String id){
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            this.productos.remove(productoAEliminar);
            System.out.println("El producato con el ID " + id +" fue eliminado exictosamente");
        } else {
            System.out.println("No se encontro el producto con el ID " + id );
        }
    }
    
    //actualizar stock
    public void actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            System.out.println("Stock producto " + p.getNombre() + " actualizo a " + nuevaCantidad);
        }else{
            System.out.println("No se encontro el producto con el ID: " + id);
        }
    }
    
    //Filtrar categoria
    public void filtrarPorCategoria(CategoriaProducto categoria){
        System.out.println("Poductos en la categoria: " + categoria);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                System.out.println( p.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron esos productos en esa categoria");
        }
    }
    
    //obtener total Stock
    public int obtenerTotalStock(){
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        return totalStock;
    }
    
    //obtener producto con mayor Stock
    public Producto obtenerProductoConMayorStock(){
        if(productos.isEmpty()) return null;
        
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
    
    //filtrar productos por precios
    public void filtrarProductosPorPrecio(double min, double max){
        boolean encontrado = false;
        for (Producto p : productos) {
         if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos con ese precio");
        }
    }
    
    //Mostrar caategoria disponible
    public void mostrarCategoriasDisponibles(){
        System.out.println("Categoria de productos disponible");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}
