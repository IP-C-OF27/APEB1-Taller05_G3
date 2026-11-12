import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio06_CategoriadeEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        String categoria;
        System.out.print("Deme edad: ");
        edad = tcl.nextInt();
        if (edad < 12)
            categoria = "Nino";
        else if (edad < 18)
            categoria = "Adolescente";
        else
            categoria = "Adulto";
        System.out.println("La persona de " + edad + " anios es: " + categoria);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme edad: 18
La persona de 18 anios es: Adulto
BUILD SUCCESSFUL (total time: 7 seconds)
 */