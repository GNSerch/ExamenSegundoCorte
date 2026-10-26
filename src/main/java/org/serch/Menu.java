package org.serch;
import java.util.Scanner;
public class Menu {
    static double promedio_total = 0;
    static int conta_registro = 0;
    static int conta_apro = 0;
    static int conta_repro = 0;
    static Scanner scan = new Scanner(System.in);
    public static void menu() {
        System.out.println("=====================================");
        System.out.println("      CONTROL DE CALIFICACIONES     ");
        System.out.println("=====================================");
        System.out.println("1. Registrar calificaciones");
        System.out.println("2. Mostrar estadísticas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");
    }
    public static double registro(int i) {
        System.out.println("Estudiante " + i);
        System.out.println("Ingrese Nombre");
        String nombre = scan.nextLine();
        scan.nextLine();
        System.out.println("Nombre:" + nombre);
        System.out.println("Evaluacion 1:");
        double ev1 = scan.nextDouble();
        System.out.println("Evaluacion 2:");
        double ev2 = scan.nextDouble();
        System.out.println("Evaluacion 3:");
        double ev3 = scan.nextDouble();
        double promedio = (ev1+ev2+ev3)/3;
        System.out.println("Promedio:" + promedio);
        return promedio;
    }
    public static void registro_menu() {
        System.out.println("=====================================");
        System.out.println("      Registro de Calificaciones     ");
        System.out.println("=====================================");
        System.out.println("¿Cuántos estudiantes registrará?:");
        int contALumno = scan.nextInt();
        conta_registro = conta_registro + contALumno;
        for (int i = 1; i <= contALumno; i++) {
            double promedio = registro(i);
            if (promedio <= 10 && promedio >= 6) {
                System.out.println("APROBADO");
                conta_apro++;
            } else {
                System.out.println("REPROBADO");
                conta_repro++;
            }
            promedio_total = (promedio_total + promedio);
        }
        scan.nextLine();
    }
    public static void main(String[] args) {
        int opcion = 0;
        do {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    int opciona = 1;
                    while (opciona == 1) {
                        registro_menu();
                        System.out.println("Desea continuar? 1. SI 2. NO");
                        opciona = scan.nextInt();
                    }
                    break;
                case 2:
                    int opcionb = 1;
                    while (opcionb == 1) {
                        System.out.println("Estudiantes registrados:" + conta_registro);
                        System.out.println("Estudiantes aprobados:" + conta_apro);
                        System.out.println("Estudiantes reprobados:" + conta_repro);
                        System.out.println("Promedio total:" + promedio_total/conta_registro);
                        System.out.println("Desea continuar? 1. SI 2. NO");
                        opcionb = scan.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Fin del Programa");
                    break;
            }
        } while (opcion != 3);
        scan.nextLine();
    }
}
