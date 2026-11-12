import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es
 * bisiesto o no. Si es bisiesto, muestra un mensaje especial."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || 
                (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El anio " + anio + " ES bisiesto.");
            System.out.println("¡Mensaje especial! Este anio tiene 366 días,"
                    + " febrero tiene 29 días.");
        } else {
            System.out.println("El anio " + anio + " NO es bisiesto.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un anio: 2005
El anio 2005 NO es bisiesto.
BUILD SUCCESSFUL (total time: 7 seconds)
 */