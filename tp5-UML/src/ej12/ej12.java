/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej12 {
    public static void main(String[] args) {
        // Crear contribuyente
        Contribuyente contribuyente = new Contribuyente("Alejandro Pedrosa", "20-41231321-3");

        // Crear impuesto asociado al contribuyente
        Impuesto impuesto = new Impuesto(150.0, contribuyente);

        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar la calculadora para calcular el impuesto
        calculadora.calcular(impuesto);

        // Mostrar información del impuesto
        System.out.println("\nInformación del Impuesto:");
        System.out.println(impuesto);

        // Mostrar información del contribuyente
        System.out.println("\nInformación del Contribuyente:");
        System.out.println(contribuyente);
    }
    
}
