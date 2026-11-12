
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Clasificar a una persona en una categoría de edad (niño, adolescente, adulto)
 * en función de su edad.
 * Brithany Celi, David Acaro
 */
import java.util.Scanner;

public class Ejercicio06_CategoriadeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String categoria;
        if (edad < 0) {
            categoria = "Edad no válida";
        } else if (edad <= 12) {
            categoria = "Niño";
        } else if (edad <= 17) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }
        System.out.println("Edad: " + edad);
        System.out.println("Categoria: " + categoria);
    }
}/***
 * EVIDENCIA DEL RUN:
 Ingrese su edad: 18
Edad: 18
Categoria: Adulto
BUILD SUCCESSFUL (total time: 6 seconds)
 */