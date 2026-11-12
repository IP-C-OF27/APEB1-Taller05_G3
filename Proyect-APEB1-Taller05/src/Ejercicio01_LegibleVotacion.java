import java.util.Scanner;
/**
 *  * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible 
 * para votar en función de su edad (mayor o igual a 16 años)."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Deme edad: ");
        edad = tcl.nextInt();
        if (edad >= 16)
           System.out.println("Legible para votas");
        else
           System.out.println("NO Legible para votas");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme edad: 
19
Legible para votas
BUILD SUCCESSFUL (total time: 4 seconds)
*/
