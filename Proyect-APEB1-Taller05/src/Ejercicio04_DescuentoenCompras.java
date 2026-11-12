import java.util.Scanner;
/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un
 * producto con un descuento del 10% si el precio original es mayor de
 * $100 ; De lo contrario, no hay descuento."
 * @author Brithany Celi, David Acaro
 * @version 1.0
 */
public class Ejercicio04_DescuentoenCompras {
    public static void main(String[] args) {
        double precio, factura;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme precio: $");
        precio = tcl.nextDouble();
        factura = precio;
        if (precio > 100)
            precio *= 0.9;
        System.out.println(precio);
    }
}  
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme precio: $1000
900.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */

