/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class OperacionesPuntoCinco {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // División: cuidado con división por cero
        if (num2 != 0) {
            int division = num1 / num2; // División entera
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}
