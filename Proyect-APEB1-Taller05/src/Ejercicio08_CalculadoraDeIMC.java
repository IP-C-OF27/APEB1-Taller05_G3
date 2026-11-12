import java.util.Scanner;
/**
 * Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal
 * (IMC) de una persona y clasificarla en función de su valor (bajo peso,
 * peso normal, sobrepeso, etc.)."
 * @author David Acaro, Brithany Celi
 * @version 1.0
 */
public class Ejercicio08_CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso, estatura, imc;
        String clasificacion;
        System.out.print("Deme el peso (kg): ");
        peso = tcl.nextDouble();
        System.out.print("Deme la estatura (m): ");
        estatura = tcl.nextDouble();
        imc = peso / (estatura * estatura);
        if (imc < 18.5)
            clasificacion = "Bajo peso";
        else if (imc < 25)
            clasificacion = "Peso normal";
        else if (imc < 30)
            clasificacion = "Sobrepeso";
        else
            clasificacion = "Obesidad";
        System.out.println("Su IMC es: " + imc);
        System.out.println("Clasificacion: " + clasificacion);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme el peso (kg): 50
Deme la estatura (m): 2
Su IMC es: 12.5
Clasificacion: Bajo peso
BUILD SUCCESSFUL (total time: 22 seconds)
 */