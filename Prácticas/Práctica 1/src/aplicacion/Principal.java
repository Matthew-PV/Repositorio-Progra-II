package aplicacion;

import mates.Matematicas;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la cantidad de pasos a ejecutar: ");
        int pasos = teclado.nextInt();
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(pasos));
    }
}