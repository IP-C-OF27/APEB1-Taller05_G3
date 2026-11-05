import java.util.Scanner;
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme nro. dia (1-7): ");
        int dia = tcl.nextInt();
        String msjDia;
        switch (dia) 
        { //Inicio SENTENCIA DE SELECCION MULTIPLE
            case 1: msjDia = "Lunes";
                break;
            case 2: msjDia = "Martes";
                break;
            case 3: msjDia = "Miercoles";
                break;
            case 4: msjDia = "Jueves";
                break;
            case 5: msjDia = "Viernes";
                break;
            case 6: msjDia = "Sabado";
                break;
            case 7: msjDia = "Domingo";
                break;
            default:
                msjDia = "Error";
        }//FIN SENTENCIA DE SELECCION MULTIPLE
        System.out.println("El nro: " + dia + "corresponde a: " + msjDia);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */