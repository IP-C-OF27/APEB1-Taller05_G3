import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números,
 * ordenarlos en orden ascendente."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio09_OrdenamientoDeTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a, b, c, aux;
        System.out.print("Deme el primer numero: ");
        a = tcl.nextInt();
        System.out.print("Deme el segundo numero: ");
        b = tcl.nextInt();
        System.out.print("Deme el tercer numero: ");
        c = tcl.nextInt();
        if (a > b)
        {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c)
        {
            aux = a;
            a = c;
            c = aux;
        }
        if (b > c)
        {
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println("Orden ascendente: " + a + ", " + b + ", " + c);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme el primer numero: 10
Deme el segundo numero: 4
Deme el tercer numero: 6
Orden ascendente: 4, 6, 10
BUILD SUCCESSFUL (total time: 10 seconds)
 */