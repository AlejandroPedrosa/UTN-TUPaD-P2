/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author dev-alejandropedrosa
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generando Código QR para " + usuario.getNombre() + ": " + valor);
        return qr;
    }
}