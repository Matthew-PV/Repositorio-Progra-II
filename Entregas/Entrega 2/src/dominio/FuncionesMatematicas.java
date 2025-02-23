package dominio;

import java.util.ArrayList;

public class FuncionesMatematicas {
    //Ejercicio 2 del cuaderno de ejercicios de Programación II.
    /**
     * Apartado 1: La suma 0 + 1 + 2 + ... + n.
     * @param n El número hasta el que se ejecutará la secuencia.
     * @return Devuelve el resultado de la suma.
     */
    public static int suma0aN (int n) {
        if (n == 0) return 0;
        else return n+suma0aN(n-1);
    }

    /**
     * Apartado 2: El factorial de un número.
     * @param n El número sobre el que se calculará el factorial.
     * @return Devuelve el factorial de n.
     */
    public static long factorial (int n) {
        if (n <= 1) return 1;
        else return n*factorial(n-1);
    }

    /**
     * Apartado 3: Potencia n-ésima de un número natural.
     * @param base Número natural que se va a operar.
     * @param n Índice del exponente al que se va a elevar la base.
     * @return Devuelve el resultado de base^n.
     */
    public static int potenciaNesima (int base, int n) {
        if (n == 0) return 1;
        else if (n == 1) return base;
        else if (n == 2) return base*base;
        else return base*potenciaNesima(base, n-1);
    }

    /**
     * Apartado 4: Apartado 4: La suma de elementos de una lista de números.
     * @param listaNumeros Lista de números de la que se hará la suma.
     * @return Devuelve la suma de todos los elementos.
     */
    public static int sumaElementos (ArrayList<Integer> listaNumeros) {
        return sumaElementosAux(listaNumeros, 0, 0);
    }
    public static int sumaElementosAux (ArrayList<Integer> listaNumeros, int elemento ,int suma) {
        if (elemento < listaNumeros.toArray().length) {
            suma += listaNumeros.get(elemento);
            elemento++;
            return sumaElementosAux(listaNumeros, elemento, suma);
        }
        else return suma;
    }
}