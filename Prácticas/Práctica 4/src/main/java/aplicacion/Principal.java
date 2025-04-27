package aplicacion;

import dominio.CalculadoraDistancias;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta, cadena1 = "", cadena2 = "";
        do {
            System.out.println();
            System.out.print("Calculadora de distancias\n" +
                    "(stop/parar para terminar)\n" +
                    "\t1 - Cambiar valor cadena 1(actual "+cadena1+")\n" +
                    "\t2 - Cambiar valor cadena 2 (actual "+cadena2+")\n" +
                    "\t3 - Calcular distancia de edición mínima\n" +
                    "Introduce el número de la instrucción a ejecutar: ");
            respuesta = teclado.nextLine();
            switch (respuesta) {
                case "1":
                    System.out.println("Introduce el nuevo valor de la cadena 1 (actual"+cadena1+"):");
                    cadena1 = teclado.nextLine();
                    break;
                case "2":
                    System.out.println("Introduce el nuevo valor de la cadena 2 (actual"+cadena2+"):");
                    cadena2 = teclado.nextLine();
                    break;
                case "3":
                    System.out.println("La distancia de edición mínima entre "+cadena1+" y "+cadena2+
                            " es "+ CalculadoraDistancias.calcularDistancia(cadena1, cadena2));
                    break;
                case "stop":
                    System.out.println("Terminando programa...");
                    break;
                case "parar": //Los mantenemos separados por errores del makefile
                    System.out.println("Terminando programa...");
                    break;
                default:
                    System.out.println("Instrucción incorrecta, inténtalo de nuevo.");
            }
        } while (!respuesta.equalsIgnoreCase("stop")
                && !respuesta.equalsIgnoreCase("parar"));
    }
}