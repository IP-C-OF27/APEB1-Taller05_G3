import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es
 * bisiesto o no. Si es bisiesto, muestra un mensaje especial."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio;
        System.out.print("Deme el anio: ");
        anio = tcl.nextInt();
        if (anio % 400 == 0)
            System.out.println("El anio " + anio + " ES BISIESTO. "
                    + "Tiene 366 dias!");
        else if (anio % 100 == 0)
            System.out.println("El anio " + anio + " NO es bisiesto");
        else if (anio % 4 == 0)
            System.out.println("El anio " + anio + " ES BISIESTO. "
                    + "Tiene 366 dias!");
        else
            System.out.println("El anio " + anio + " NO es bisiesto");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme el anio: 2006
El anio 2006 NO es bisiesto
BUILD SUCCESSFUL (total time: 5 seconds)
 */