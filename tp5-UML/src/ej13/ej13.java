/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej13 {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Alejandro Pedrosa", "alejandropedrosa@gmail.com");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar CódigoQR 
        CodigoQR codigo = generador.generar("EJQR12345", usuario);

        // Mostrar información del CódigoQR
        System.out.println("\nInformación del Código QR:");
        System.out.println(codigo);

        // Mostrar información del usuario
        System.out.println("\nInformación del Usuario:");
        System.out.println(usuario);
    }
    
}
