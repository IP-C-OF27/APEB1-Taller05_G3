import java.util.Scanner;
/**
 * Ejercicio 10: "Valores pares o impares: Dado un valor entero ingresado
 * por teclado (positivo o negativo), determinar si se trata de un valor
 * par o impar."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio10_ValoresParesOImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valor;
        System.out.print("Deme un valor entero: ");
        valor = tcl.nextInt();
        if (valor % 2 == 0)
            System.out.println("El valor " + valor + " es PAR");
        else
            System.out.println("El valor " + valor + " es IMPAR");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme un valor entero: 7
El valor 7 es IMPAR
BUILD SUCCESSFUL (total time: 7 seconds)
 */