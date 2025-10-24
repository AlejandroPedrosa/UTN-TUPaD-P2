/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author dev-alejandropedrosa
 */
public class EmpleadoTemporal extends Empleo{
    private double sueldo;
    private int valorHora;

    public EmpleadoTemporal(double sueldo, int valorHora, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldo * valorHora;
    }
}
