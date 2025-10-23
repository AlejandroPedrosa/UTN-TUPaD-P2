package ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("SISTEMA DE STOCK");
        
        System.out.println("\nAgregar Productos");
        
        inventario.agregarProducto(new Producto("A001", "Manzana 1kg", 1500.00, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E002", "Noblex Smart TV 50'", 45000.50, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A003", "Bananas 1kg", 1500.00, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("H004", "Juego de Sábanas", 1200.00, 20, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("A005", "Leche", 980.99, 80, CategoriaProducto.ALIMENTOS));
        
        //Listar los productos
        System.out.println("\nAgregar Productos");
        inventario.listarPorductos();
        
        //Buscar producto por id
        String idBuscado = "A005";
        System.out.println("\n Buscar producto por id");
        Producto productoEncontrado = inventario.buscarProductoPorId(idBuscado);
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInfo();
        }else{
            System.out.println("Producto con id " + idBuscado + " no encontrado");
        }
        
        //Filtrar y mostrar productos
        System.out.println("\nFiltrar por categoria");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        //Eliminar Producto
        String idEliminar = "H004";
        System.out.println("\nEliminar producto");
        inventario.eliminarProducto(idEliminar);
        System.out.println("\nLista de productos restantes:");
        inventario.listarPorductos();
        
        //Actualizar el stock
        System.out.println("\nActualizar stock");
        inventario.actualizarStock("E002", 30);
        
        //Total de stock
        System.out.println("\nTotal de stock");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Catidad de stock: " + totalStock);
        
        //Producto con mayor stock
        System.out.println("\nProducto con mayor stock");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es: ");            
            mayorStock.mostrarInfo();
        }else{
            System.out.println("El inventario esta vacio");
        }
        
        //Filtrar producto por precio
        System.out.println("\n Filtrar por precio");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        
        // Mostrar categoria disponibles
        System.out.println("\n Mostrar categoria disponible");
        inventario.mostrarCategoriasDisponibles();
        System.out.println("Fin del sistema de stock");
    }
}
