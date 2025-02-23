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
     * Apartado 4: La suma de elementos de una lista de números.
     * @param listaNumeros Lista de números de la que se hará la suma.
     * @return Devuelve el valor de la función auxiliar.
     */
    public static int sumaElementos (ArrayList<Integer> listaNumeros) {
        return sumaElementosAux(listaNumeros, 0, 0);
    }

    /**
     * Realiza la función del apartado 4.
     * @param listaNumeros Lista de números de la que se hará la suma.
     * @param elemento Elemento actual de la lista de números.
     * @param suma Valor que se actualizará al sumar cada elemento.
     * @return Devuelve la suma de elementos de la lista.
     */
    public static int sumaElementosAux (ArrayList<Integer> listaNumeros, int elemento, int suma) {
        if (elemento < listaNumeros.toArray().length) {
            suma += listaNumeros.get(elemento);
            elemento++;
            return sumaElementosAux(listaNumeros, elemento, suma);
        }
        else return suma;
    }

    /**
     * Apartado 5: La media aritmética de una lista de números.
     * @param listaNumeros Lista de números de la que se hará la media.
     * @return Devuelve el valor de la función auxiliar.
     */
    public static double mediaAritmetica (ArrayList<Integer> listaNumeros) {
        return mediaAritmeticaAux(listaNumeros, 0, 0);
    }

    /**
     * Realiza la función del apartado 5.
     * @param listaNumeros Lista de números de la que se hará la media.
     * @param elemento Elemento actual de la lista de números.
     * @param suma Valor de la suma total de todos los elementos necesaria para calcular la media.
     * @return Devuelve la suma de los números dividida por la cantidad de elementos.
     */
    public static double mediaAritmeticaAux (ArrayList<Integer> listaNumeros, int elemento, int suma) {
        if (elemento < listaNumeros.toArray().length) {
            suma += listaNumeros.get(elemento);
            elemento++;
            return mediaAritmeticaAux(listaNumeros, elemento, suma);
        }
        else return 1.0 * suma /elemento;
    }

    /**
     * Apartado 6: La desviación típica de una lista de números.
     * @param listaNumeros Lista de números de la que se hará la desviación típica.
     * @return Devuelve el valor de la función auxiliar.
     */
    public static double desviacionTipica (ArrayList<Integer> listaNumeros) {
        return desviacionTipicaAux(listaNumeros, 0, 0);
    }

    /**
     * Realiza la función del apartado 6.
     * @param listaNumeros Lista de números de la que se hará la media.
     * @param elemento Elemento actual de la lista de números.
     * @param suma Valor de la suma total de las desviaciones de cada elemento.
     * @return Devuelve la raíz cuadrada de la división entre la suma de desviaciones y la cantidad de elementos.
     */
    public static double desviacionTipicaAux (ArrayList<Integer> listaNumeros, int elemento, double suma) {
        double media = mediaAritmetica(listaNumeros);
        if (elemento < listaNumeros.toArray().length) {
            //Corresponde a la suma de cada (valor elemento - media)^2
            suma += Math.pow((listaNumeros.get(elemento)-media), 2);
            elemento++;
            return desviacionTipicaAux(listaNumeros, elemento, suma);
        }
        //Corrresponde a la raíz cuadrada de la división de la suma total entre el número de elementos.
        else return Math.sqrt(suma / elemento);
    }
}