/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
import java.util.Scanner;

public class DivisionDecimalesPuntoOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número (double): ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2; // División decimal
            System.out.println("Resultado de la división (double): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}
