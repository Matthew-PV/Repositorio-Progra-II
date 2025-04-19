package com.prograII.dominio;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ejercicio11 {
    /*
    Los objetivos de esta Entrega son practicar el TDD, la recursividad y
    las expresiones lambda. Por esto, a expensas de que el enunciado pida hacerlo
    por bucles, se realizará cada apartado utilizando tanto recursividad
    como lambda en la medida de lo posible.
     */

    //SumaN
    /**
     * Apartado 1. La suma 0+1+2+...+n.
     * El método recursivo toma dos casos base:
     * @Caso n = 0────Devuelve el valor de "n".
     * @Caso n < 0────Realiza la suma con el valor absoluto y la invierte.
     * @param n Número en el que se detiene la sucesión.
     * @return Devuelve el valor de la suma.
     */
    public int sumaNRecursiva(int n) {
        if (n==0) return n;
        //En el caso de que n sea negativa calculamos la suma con el
        //valor absoluto y lo hacemos negativo.
        else if (n<0) return -sumaNRecursiva(Math.abs(n));
        else return n+ sumaNRecursiva(n-1);
    }
    /**
     * Apartado 1. La suma 0+1+2+...+n.
     * El método funcional crea un stream de enteros dentro de un rango
     * que toma el valor absoluto de "n". Posteriormente revisa si "n" era negativo
     * o positivo para devolver el valor de la suma correcto.
     * @param n Número en el que se detiene la sucesión.
     * @return Devuelve el valor de la suma.
     */
    public int sumaNFuncional(int n) {
        int suma = IntStream.rangeClosed(0, Math.abs(n)).sum();
        if (n >= 0) return suma;
        else return -suma;
    }


    //Factorial
    /**
     * Apartado 2. El factorial de un número.
     * El método recursivo plantea dos casos base:
     * @Caso n = 0 | 1────Devuelve 1 para evitar el elemento absorbente
     * de la multiplicación.
     * @Caso n < 0──────Por definición, no existe el factorial de un número negativo,
     * pero para evitar errores de ejecución, le daremos el valor de -1.
     * @param n El número del que se calculará el factorial.
     * @return Devuelve el valor del factorial.
     */
    public long factorialRecursivo(int n) {
        if (n==0 || n==1) return 1;
        else if (n<0) return -1;
        else return n*factorialRecursivo(n-1);
    }
    /**
     * Apartado 2. El factorial de un número.
     * El método funcional revisa que el valor de "n" sea 0 o menor
     * que 0, y si no lo es, hace una reducción de un stream de longs
     * de 0 a "n" multiplicando cada uno por el anterior.
     * @param n El número del que se calculará el factorial.
     * @return Devuelve el valor del factorial.
     */
    public long factorialFuncional(int n) {
        if (n==0) return 1;
        else if (n<0) return -1;
        else return LongStream.rangeClosed(1,n)
                    .reduce((num1, num2) -> num1*num2)
                    .orElse(n);
    }


    //Potencia n-ésima

    /**
     * Apartado 3. La potencia n-ésima de un natural.
     * @param base Valor sobre el que se calculara la potencia.
     * @param exponente Índice de la potencia.
     * @return Devuelve el valor de base^exponente (^ = elevado a).
     */
    public long potenciaRecursiva(int base, int exponente) {
        return 0;
    }
    /**
     * Apartado 3. La potencia n-ésima de un natural.
     * @param base Valor sobre el que se calculara la potencia.
     * @param exponente Índice de la potencia.
     * @return Devuelve el valor de base^exponente (^ = elevado a).
     */
    public long potenciaFuncional(int base, int exponente) {
        return 0;
    }
}