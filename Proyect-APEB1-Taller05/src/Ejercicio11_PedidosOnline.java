import java.util.Scanner;
/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el
 * costo de un pedido de un artículo del cual se tiene la descripción,
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida
 * excede de 50 unidades, se hace un descuento de 15%."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precioUnitario, subtotal, descuento, total;
        System.out.print("Deme la descripcion del articulo: ");
        descripcion = tcl.next();
        System.out.print("Deme la cantidad: ");
        cantidad = tcl.nextInt();
        System.out.print("Deme el precio unitario: ");
        precioUnitario = tcl.nextDouble();
        subtotal = cantidad * precioUnitario;
        if (cantidad > 50)
            descuento = subtotal * 0.15;
        else
            descuento = 0;
        total = subtotal - descuento;
        System.out.println("Articulo: " + descripcion);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Costo del pedido: " + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme la descripcion del articulo: Teclado
Deme la cantidad: 52
Deme el precio unitario: 25
Articulo: Teclado
Subtotal: 1300.0
Descuento: 195.0
Costo del pedido: 1105.0
BUILD SUCCESSFUL (total time: 16 seconds)
 */