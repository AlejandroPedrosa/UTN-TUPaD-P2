/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Calculando impuesto de " +
                               impuesto.getContribuyente().getNombre() +
                               ": $" + impuesto.getMonto());
        } else {
            System.out.println("No hay impuesto para calcular.");
        }
    }
}