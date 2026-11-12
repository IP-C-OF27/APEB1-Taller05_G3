import java.util.Scanner;
/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad
 * de Loja se hace un descuento del 10% si el cliente se hospeda más de
 * 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más
 * de 15 días. Elaborar una solución que pida el número de días y el precio
 * diario de la habitación y luego calcule e imprima el subtotal por
 * pagar, el descuento y el total por pagar."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio13_SistemaDeReservasHoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double precioDiario, subtotal, descuento, total;
        System.out.print("Deme el numero de dias: ");
        dias = tcl.nextInt();
        System.out.print("Deme el precio diario de la habitacion: ");
        precioDiario = tcl.nextDouble();
        subtotal = dias * precioDiario;
        if (dias > 15)
            descuento = subtotal * 0.20;
        else if (dias > 10)
            descuento = subtotal * 0.15;
        else if (dias > 5)
            descuento = subtotal * 0.10;
        else
            descuento = 0;
        total = subtotal - descuento;
        System.out.println("Subtotal por pagar: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total por pagar: " + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme el numero de dias: 17
Deme el precio diario de la habitacion: 25
Subtotal por pagar: 425.0
Descuento: 85.0
Total por pagar: 340.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */