/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Main {
    public static void main(String[] args) {
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor pA = new Profesor("P101", "Lic. María Gómez ", "Algoritmos y Estructuras");
        Profesor pB = new Profesor("P102", "Dr. Juan Perez", "Bases de Datos");
        Profesor pC = new Profesor("P103", "Ing. Ana López", "POO y Colecciones");
        
        Curso c1 = new Curso("C201", "Programación II");
        Curso c2 = new Curso("C202", "Estructuras de Datos");
        Curso c3 = new Curso("C301", "Bases de Datos I");
        Curso c4 = new Curso("C302", "Análisis de Sistemas Operativos");
        Curso c5 = new Curso("C401", "Programación Web");
        
        // 2. Agregar profesores y cursos a la universidad.
        System.out.println("\n Agregar cursos y profesores ");
        utn.agregarProfesor(pA);
        utn.agregarProfesor(pB);
        utn.agregarProfesor(pC);
        
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos 
        System.out.println("\n Asignar profesores a cursos");
        utn.asignarProfesorACurso("C201", "P103"); 
        utn.asignarProfesorACurso("C202", "P101"); 
        utn.asignarProfesorACurso("C301", "P102"); 
        utn.asignarProfesorACurso("C401", "P103"); 
        utn.asignarProfesorACurso("C302", "P101"); 
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n Listado");
        utn.listarCursos();
        utn.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n Cambiar profesor y verificar sincronizacion ");
        // Cambiamos C201 (era P103) a P101
        System.out.println("Cambiando C201 de P103 (Lic. Pérez) a P101 (Dr. López)...");
        utn.asignarProfesorACurso("C201", "P101"); 
        
        System.out.println("\nVerificación de C201:");
        utn.buscarCursoPorCodigo("C201").mostrarInfo(); 
        
        System.out.println("\nVerificación de P103 (Lista reducida -1):");
        utn.buscarProfesorPorId("P103").mostrarInfo();
        utn.buscarProfesorPorId("P103").listarCursos();

        System.out.println("\nVerificación de P101 (Lista aumentada +1):");
        utn.buscarProfesorPorId("P101").mostrarInfo();
        utn.buscarProfesorPorId("P101").listarCursos();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        String codigoEliminar = "C301"; 
        System.out.println("\n Eliminar curso (" + codigoEliminar + ")");
        utn.eliminarCurso(codigoEliminar);
        
        System.out.println("\nVerificación de P102 (Debe tener 0 cursos):");
        utn.buscarProfesorPorId("P102").mostrarInfo();
        utn.buscarProfesorPorId("P102").listarCursos();


        // 7. Remover un profesor y dejar profesor = null en los cursos que dictaba.
        String idEliminarProf = "P103";
        System.out.println("\n Eliminar Profesor (" + idEliminarProf + ") ");
        utn.eliminarProfesor(idEliminarProf);
        
        System.out.println("\nVerificación de C401 (Debe quedar SIN ASIGNAR):");
        utn.buscarCursoPorCodigo("C401").mostrarInfo();

        // 8. Mostrar un reporte: cantidad de cursos por profesor (Reporte final).
        System.out.println("\n Reporte final");
        utn.listarProfesores(); 
    }
}
