/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Animal {
    protected String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal(){
        System.out.println("Soy un animal de tipo: " + tipoAnimal);
    }
}