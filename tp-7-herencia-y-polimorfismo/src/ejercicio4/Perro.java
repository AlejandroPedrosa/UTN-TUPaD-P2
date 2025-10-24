/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Perro extends Animal{
    public Perro(String tipoAnimal) {
        super(tipoAnimal);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(tipoAnimal + " Sonido es: Gua guau");
    }
}
