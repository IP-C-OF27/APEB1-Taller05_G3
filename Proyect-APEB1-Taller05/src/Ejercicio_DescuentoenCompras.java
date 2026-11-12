import java.util.Scanner;

/**
 *Calcular el precio final de un producto con un descuento del 10% si
 * el precio original es mayor de $100; de lo contrario, no hay descuento.
 * Brithany Celi, David Acaro
 */
public class Ejercicio_DescuentoenCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: $");
        double precio = sc.nextDouble();
        double descuento = 0;
        double precioFinal;
        if (precio > 100) {
            descuento = precio * 0.10;
            precioFinal = precio - descuento;
        } else {
            precioFinal = precio;
        }
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final a pagar: $" + precioFinal);
    }
}  
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el precio original del producto: $465
Precio original: $465.0
Descuento aplicado: $46.5
Precio final a pagar: $418.5
BUILD SUCCESSFUL (total time: 8 seconds)
 */

