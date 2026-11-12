import java.util.Scanner;
/**
 * Ejercicio 12: "Calculo de impuestos: Desarrollar una solución que permita
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto
 * por pagar y el precio de venta (incluido el impuesto). Si el origen es
 * Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es
 * de Italia, 15%, y si es de USA, 8%"
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca;
        int origen;
        double costo, porcentaje, impuesto, precioVenta;
        System.out.print("Deme la marca: ");
        marca = tcl.next();
        System.out.print("Deme el origen (1=Alemania, 2=Japon, 3=Italia, 4=USA): ");
        origen = tcl.nextInt();
        System.out.print("Deme el costo: ");
        costo = tcl.nextDouble();
        switch (origen)
        { //Inicio SENTENCIA DE SELECCION MULTIPLE
            case 1: porcentaje = 0.20;
                break;
            case 2: porcentaje = 0.30;
                break;
            case 3: porcentaje = 0.15;
                break;
            case 4: porcentaje = 0.08;
                break;
            default:
                porcentaje = 0;
        }//FIN SENTENCIA DE SELECCION MULTIPLE
        impuesto = costo * porcentaje;
        precioVenta = costo + impuesto;
        System.out.println("Marca: " + marca);
        System.out.println("Impuesto por pagar: " + impuesto);
        System.out.println("Precio de venta: " + precioVenta);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme la marca: Chevrolet
Deme el origen (1=Alemania, 2=Japon, 3=Italia, 4=USA): 4
Deme el costo: 16000
Marca: Chevrolet
Impuesto por pagar: 1280.0
Precio de venta: 17280.0
BUILD SUCCESSFUL (total time: 17 seconds)
 */