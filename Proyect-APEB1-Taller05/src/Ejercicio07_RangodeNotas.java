
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Asignar una letra (A, B, C, D) a una calificación en función de su rango 
 * (A para 90-100, B para 80-89, etc.).
 * Brithany Celi, David Acaro
 */
public class Ejercicio07_RangodeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificacion (0-100): ");
        int nota = sc.nextInt();
        String letra;
        if (nota < 0 || nota > 100) {
            letra = "Nota no válida";
        } else if (nota >= 90) {
            letra = "A";
        } else if (nota >= 80) {
            letra = "B";
        } else if (nota >= 70) {
            letra = "C";
        } else if (nota >= 60) {
            letra = "D";
        } else {
            letra = "F";
        }
        System.out.println("Calificacion: " + nota);
        System.out.println("Letra asignada: " + letra);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese la calificacion (0-100): 75
Calificacion: 75
Letra asignada: C
BUILD SUCCESSFUL (total time: 4 seconds)

 */