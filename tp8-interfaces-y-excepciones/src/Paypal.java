
import interfaces.PagoConDescuento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
public class Paypal implements PagoConDescuento{
    // implementamos pagoConDescuento
    @Override
    public double aplicarDescuento(double montoBase, double porcentaje){
        System.out.println("Se aplico descuento de: " + porcentaje + " % con Paypal");
        return montoBase * (1 - porcentaje / 100.0);
    }
    
    @Override
    public boolean procesarPago(double monto){
        System.out.println("El pago de $" + monto + " procesado con Paypal");
        return true;
    }
}