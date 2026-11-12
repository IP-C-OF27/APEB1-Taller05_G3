import java.util.Scanner;
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        // Usamos el teclado y le ponemos de nombre tcl
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = tcl.nextInt();

        String nombreDia; // Aquí vamos a guardar el día

        // Aquí preguntamos uno por uno, como si fuera: ¿es 1? ¿es 2? ¿es 3?
        if (dia == 1) {
            nombreDia = "Lunes";
        } else if (dia == 2) {
            nombreDia = "Martes";
        } else if (dia == 3) {
            nombreDia = "Miércoles";
        } else if (dia == 4) {
            nombreDia = "Jueves";
        } else if (dia == 5) {
            nombreDia = "Viernes";
        } else if (dia == 6) {
            nombreDia = "Sábado";
        } else if (dia == 7) {
            nombreDia = "Domingo";
        } else {
            nombreDia = "Número inválido. Debe ser del 1 al 7.";
        }

        System.out.println("El día es: " + nombreDia);

        tcl.close();
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Deme nro. dia (1-7): 3
El nro: 3corresponde a: Miercoles
BUILD SUCCESSFUL (total time: 20 seconds)
 */