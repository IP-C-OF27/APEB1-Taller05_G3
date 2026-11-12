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
        System.out.println("Deme nro. dia (1-7: )");
        int dia=tcl.nextInt();
        String msjDia;
        switch (dia) {
            case 1:
                msjDia="Lunes";
                break;
            case 2:
                msjDia="Martes";
                break;
            case 3:
                msjDia="Miercoles";
                break;
            case 4:
                msjDia="Jueves";
                break;
            case 5:
                msjDia="Viernes";
                break;
            case 8:
                msjDia="Sabado";
                break;
            case 7:
                msjDia="Domingo";
                break;    
            default:
                msjDia="ERROR";  
        }
        System.out.println("El nro: " + dia + " Corresponde al: " + msjDia);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme nro. dia (1-7: )
3
El nro: 3 Corresponde al: Miercoles
BUILD SUCCESSFUL (total time: 3 seconds)
 */