/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej10 {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Alejandro Pedrosa", "12345678");

        // Crear cuenta bancaria con clave de seguridad y fecha de última modificación como String
        CuentaBancaria cuenta = new CuentaBancaria("CBU-123451235", 15000.0, "4321", "07/09/2025");

        // Asociar bidireccionalmente titular y cuenta
        titular.setCuenta(cuenta);

        // Mostrar información de la cuenta bancaria
        System.out.println("Cuenta Bancaria:");
        System.out.println(cuenta);

        // Mostrar información titular
        System.out.println("\nTitular:");
        System.out.println(titular);
    }
    
}
