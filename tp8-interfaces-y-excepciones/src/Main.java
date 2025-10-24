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
        //Crear producto y cliente
        Producto laptop = new Producto("Laptop Asus", 1300.0);
        Producto mouse = new Producto("Mouse Gaming", 200.0);
        Cliente juan = new Cliente("Juan Perez");
        
        //Crear pedido y agregar productos
        Pedido pedido1 = new Pedido(juan);
        pedido1.agregarProducto(laptop);
        pedido1.agregarProducto(mouse);
        
        double totalSinDescuento = pedido1.calcularTotal();
        System.out.println("Total del pedido sin descuento: $" + totalSinDescuento);
        
        //Procesar pago con descuento
        Paypal pagoPaypal = new Paypal();
        double totalConDescuento = pagoPaypal.aplicarDescuento(totalSinDescuento, 10.0);
        System.out.println("Total del pedido con descuento: $" + totalConDescuento);
        pagoPaypal.procesarPago(totalConDescuento);
        
        //Notificar cambio de estado
        pedido1.cambiarEstado("Enviado");
        
    }
}
