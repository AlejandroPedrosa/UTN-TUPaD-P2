/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej4 {
    public static void main(String[] args) {
        // Crear banco (puede existir sin tarjeta)
        Banco banco = new Banco("Banco Santander", "20-12345678-3");

        // Crear cliente
        Cliente cliente = new Cliente("Alejandro Pedrosa", "12345677");

        // Crear tarjeta de crédito y asociarla al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9800-5432", "12/26", banco);

        // Asociar bidireccionalmente tarjeta y cliente
        cliente.setTarjeta(tarjeta);

        // Mostrar información  tarjeta
        System.out.println("Tarjeta de Crédito:");
        System.out.println(tarjeta);

        // Mostrar información cliente
        System.out.println("\nCliente:");
        System.out.println(cliente);

        // Mostrar información del banco
        System.out.println("\nBanco:");
        System.out.println(banco);
    }
    
}
