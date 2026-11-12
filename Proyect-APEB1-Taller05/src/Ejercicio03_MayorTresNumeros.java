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
        System.out.print(" Deme 3 num : ");
        int n1 = tcl.nextInt(),n2 = tcl.nextInt(),n3 = tcl.nextInt(), mayor;
        if (n1 > n2) 
            mayor = n1;
        else 
         mayor = n2;
         if ( mayor < n3) 
         mayor = n3;
       System.out.println(mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 Deme 3 num : 1 6 4
6
BUILD SUCCESSFUL (total time: 7 seconds)
 */