import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
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
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 18
Edad: 18
Categoria: Adulto
BUILD SUCCESSFUL (total time: 6 seconds)
 */