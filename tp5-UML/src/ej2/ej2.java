/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

/**
 *
 * @author dev-alejandropedrosa
 */
public class ej2 {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Alejandro Pedrosa", "12345678");

        // Crear batería 
        Bateria bateria = new Bateria("Bat-20000mAh", 20000);

        // Crear celular y asociarle la batería
        Celular celular = new Celular("IMEI123456", "Samsung", "Galaxy S25 Ultra", bateria);

        // Asociar bidireccionalmente celular y usuario
        usuario.setCelular(celular);

        // Mostrar información celular
        System.out.println("Celular:");
        System.out.println(celular);

        // Mostrar información usuario
        System.out.println("\nUsuario:");
        System.out.println(usuario);
    }
}
   
