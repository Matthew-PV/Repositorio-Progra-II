package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;
import dominio.FuncionesMatematicas;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        //Apartado 1
        System.out.print("Apartado 1: suma 0 + 1 + ... + n.\nIntroduce el valor de n: ");
        int n = teclado.nextInt();
        System.out.println("Resultado 1: "+FuncionesMatematicas.suma0aN(n));
        System.out.println();

        //Apartado 2
        System.out.print("Apartado 2: El factorial de un número.\nIntroduce el valor de n: ");
        n = teclado.nextInt();
        System.out.println("Resultado 2: "+FuncionesMatematicas.factorial(n));
        System.out.println();

        //Apartado 3
        System.out.print("Apartado 3: La potencia n-ésima de un número natural.\nIntroduce el número natural: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el índice de la potencia: ");
        n = teclado.nextInt();
        System.out.println("Resultado 3: "+FuncionesMatematicas.potenciaNesima(base, n));
        System.out.println();
        teclado.nextLine();
         */

        //Apartado 4
        System.out.println("Apartado 4: La suma de elementos de una lista de números.");
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        String entrada;
        do {
            System.out.print("Añade un número a la lista (STOP para parar): ");
            entrada = teclado.nextLine();
            try {
                listaNumeros.add(Integer.parseInt(entrada));
            } catch (NumberFormatException e) {
                if (!entrada.equalsIgnoreCase("stop")) {
                    System.out.println("Entrada incorrecta.");
                }
            }
        } while (!entrada.equalsIgnoreCase("stop"));
        System.out.println("Resultado 4: "+FuncionesMatematicas.sumaElementos(listaNumeros));
        System.out.println();
    }
}