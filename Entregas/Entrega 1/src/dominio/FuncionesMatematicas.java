package dominio;

public class FuncionesMatematicas {
    //Ejercicio 2 de forma iterativa. Obligatorio hacerlo mediante bucles.

    /**
     * Apartado 1: La suma de 0 + 1 + 2 + ... + n. Realizarlo de forma iterativa.
     * @param n Número final de la suma.
     * @return Devuelve la suma sucesiva de los números de 0 a n.
     */
    public static int suma0HastaN (int n) {
        int suma = 0;
        for (int i = 0 ; i <= n ; i++) suma += i;
        return suma;
    }

    /**
     * Apartado 2: El factorial de un número. Realizarlo de forma iterativa.
     * @param n Número cuyo factorial se calculará.
     * @return Devuelve el factorial de n.
     */
    public static long factorial (int n) { //F(n)= n * f(n-1)
        if (n == 0 || n == 1) return 1; //f(0) = f(1) = 1
        else if (n == 2) return n; //f(2) = 1*2 = 2
        else {
            long f = 1;
            for (int i = 2; i <= n; i++) {
                f *= i;
            }
            return f;
        }
    }

    /**
     * Apartado 3: La potencia n-ésima de un número natural. Realizarlo de forma iterativa.
     * @param n Número sobre el que se calculará la potencia.
     * @param ex valor del exponente de la potencia.
     * @return Devuelve el resultado de elevar @base a @ex.
     */
    public static long potenciaNesima (int n, int ex) {
        int base = n;
        for (int i = 1 ; i < ex ; i++) {
            n *= base;
        }
        return n;
    }
}