
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev-alejandropedrosa
 */
public class MainExcepcions {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- 1. División Segura (ArithmeticException) ---");
        divisionSegura(scanner);

        System.out.println("\n--- 2. Conversión (NumberFormatException) ---");
        conversionCadena(scanner);

        System.out.println("\n--- 3. Lectura de Archivo (FileNotFoundException) ---");
        lecturaArchivoSimple();

        System.out.println("\n--- 4. Excepción Personalizada (EdadInvalidaException) ---");
        lanzarExcepcionPersonalizada(scanner);

        System.out.println("\n--- 5. try-with-resources ---");
        usoTryWithResources();

        scanner.close();
    }

    // 1. División Segura: Manejo de ArithmeticException
    private static void divisionSegura(Scanner scanner) {
        try {
            System.out.print("Ingrese un numero: ");
            int num = scanner.nextInt();
            System.out.print("Ingrese divisor: ");
            int den = scanner.nextInt();
            int resultado = num / den;
            System.out.println("Resultado: " + resultado);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese solo números enteros.");
            scanner.nextLine(); // Limpiar buffer
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: " + e.getMessage());
            System.out.println("No se puede dividir por cero.");
        }
    }

    // 2. Conversión de Cadena: Manejo de NumberFormatException
    private static void conversionCadena(Scanner scanner) {
        scanner.nextLine(); // Consumir línea pendiente
        System.out.print("Ingrese texto a convertir a número: ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error capturado: La cadena '" + texto + "' no es un número válido.");
        }
    }

    // 3. Lectura de Archivo: Manejo de FileNotFoundException (Checked) 
    private static void lecturaArchivoSimple() {
        // Asumiendo que 'archivo_no_existe.txt' no existe
        try {
            FileReader fr = new FileReader("archivo_no_existe.txt");
            // Aquí iría la lógica de lectura
        } catch (FileNotFoundException e) {
            System.out.println("Error capturado: " + e.getMessage());
            System.out.println("El archivo de texto especificado no fue encontrado.");
        }
    }

    // 4. Lanzar Excepción Personalizada
    private static void lanzarExcepcionPersonalizada(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = 0;
        try {
            edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese solo números enteros.");
            scanner.nextLine(); // Limpiar buffer
        } catch (EdadInvalidaException e) {
            // Capturar la excepción personalizada y mostrar mensaje
            System.out.println("Error de validación: " + e.getMessage());
        }
    }

    // Método que usa 'throws' para declarar que puede lanzar la excepción personalizada 
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 100) {
            // Lanzar la excepción personalizada 
            throw new EdadInvalidaException("La edad debe estar entre 0 y 100 años.");
        }
    }

    // 5. Uso de try-with-resources 
    private static void usoTryWithResources() {
        // Aquí simulamos que sí existe para mostrar la sintaxis.
        try (
            // Recursos que implementan AutoCloseable se declaran aquí 
                BufferedReader br = new BufferedReader(new FileReader("ejemplo_try_with.txt")) 
        ) {
            System.out.println("Recurso (BufferedReader) abierto exitosamente.");
            String linea;
            while ((linea = br.readLine()) != null) {                
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
             System.out.println("Error: Archivo no encontrado para try-with-resources.");
        } catch (IOException e) { // Manejar IOException correctamente
            System.out.println("Error de I/O: " + e.getMessage());
        }
        
    }
}
