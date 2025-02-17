package aplicacion;

import dominio.FuncionesMatematicas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Comprobación del apartado 1: La suma de 0 + 1 + ... + n.\nIntroduce el valor de n: ");
        int n = teclado.nextInt();
        System.out.println("Resultado 1: "+FuncionesMatematicas.suma0HastaN(n));
        System.out.println();
        System.out.print("Comprobación del apartado 2: Cálculo del factorial del número n.\nIntroduce el valor de n: ");
        n = teclado.nextInt();
        System.out.println("Resultado 2: "+FuncionesMatematicas.factorial(n));
        System.out.println();
        System.out.print("Comprobación del apartado 3: Potencia n-ésima de un natural.\nIntroduce el valor del natural: ");
        n = teclado.nextInt();
        System.out.print("Introduce el valor del exponente de la potencia: ");
        int ex = teclado.nextInt();
        System.out.println("Resultado 3: "+FuncionesMatematicas.potenciaNesima(n, ex));
        System.out.println();
    }
}