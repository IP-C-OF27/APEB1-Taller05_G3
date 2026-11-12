
import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres numeros: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double n3 = tcl.nextDouble();
        double mayor;
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n1 && n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese el primer numero: 6
Ingrese el segundo numero: 9
Ingrese el tercer numero: 2
El numero mayor es: 9.0
BUILD SUCCESSFUL (total time: 12 seconds)
 */