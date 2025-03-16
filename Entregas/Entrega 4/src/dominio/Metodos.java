package dominio;
public class Metodos {
    //Ejercicio 34
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 34.
     */
    public static void Algoritmo() {
        System.out.println("Un algoritmo es un conjunto de instrucciones finitas\n" +
                "y definidas que permiten realizar una tarea.");
    }

    //Ejercicio 35
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 35.
     * @param n Valor de los primeros números naturales que se sumarán.
     */
    public static void SumaN(int n) {
        System.out.println("Valor de n introducido: "+n);
        int suma = 0;
        for (int i = 0 ; i <= n ; i++) {
            suma += i;
        }
        System.out.println("\tAlgoritmo de la suma de los n primeros naturales iterativo:\n" +
                "        for (int i = 0 ; i <= "+n+" ; i++) {\n" +
                "            suma += i;\n" +
                "        }\n" +
                "Resultado: "+suma);
        System.out.println("\tAlgoritmo recursivo:\n" +
                "        if (n == 0) return 0;\n" +
                "        else return n+SumaNRecursivo(n-1);\n" +
                "Resultado: "+SumaNRecursivo(n));
    }

    /**
     * Método auxiliar utilizado para resolver el ejercicio 35.
     * @param n Valor de los primeros números naturales que se sumarán.
     * @return Devuelve el valor de la suma 0 + 1 + ... + n.
     */
    public static int SumaNRecursivo(int n) {
        if (n == 0) return 0;
        else return n+SumaNRecursivo(n-1);
    }

    //Ejercicio 36
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 36.
     */
    public static void Defina() {
        System.out.println("O(n) describe la complejidad temporal\n" +
                "de un algoritmo indicando que el tiempo de ejecución\n" +
                "crece proporcionalmente al tamaño de la entrada n.");
    }

    //Ejercicio 37
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 37.
     */
    public static void EspacioRecorrido() {
        System.out.println("La complejidad temporal para el cálculo del espacio recorrido e = 1/2*g*t^2\n" +
                "en función del tiempo (t) se expresa como T(t), que es el número de instrucciones a\n" +
                "ejecutar para resolver un ejemplar de tamaño \"t\".\n" +
                "La complejidad temporal: lim T(t)/t² = 1 => O(t²), es decir, es complejidad cuadrática.");
    }

    //Ejercicio 38
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 38.
     */
    public static void Complejidad() {
        System.out.println("Ambos métodos son complejidad temporal 0(1)\n" +
                "ya que acceden directamente a un elemento del Array.");
    }

    //Ejercicio 39
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 39.
     */
    public static void ComplejidadSumaN() {
        System.out.println("La complejidad de los algoritmos SumaN es: lim T(n)+1/n = 1 => O(n), complejidad lineal.");
    }

    //Ejercicio 40
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 40.
     */
    public static void Ejercicio11() {
        System.out.println("Usando métodos iterativos, en el primer apartado\n" +
                "del ejercicio que nos pide una suma, sería complejidad O(n).");
    }

    //Ejercicio 41
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 41.
     */
    public static void Ejercicio2() {
        System.out.println("La complejidad temporal del algoritmo recursivo para calcular\n" +
                "el factorial de un número es: lim T(n-1)+1 / n = 1 => O(n), complejidad lineal.\n" +
                "El mismo algoritmo realizado de forma iterativa tiene una complejidad temporal\n" +
                "tal que: lim T(i-1)+1 / n = 0 => 0(1), complejidad en tiempo constante.");
    }

    //Ejercicio 42
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 42.
     */
    public static void ConjuntoA() {
        System.out.println("Al ser AxA, sería A^2 el total de ejecuciones,\n" +
                "lo que hace que la complejidad sea de tipo O(n^2).");
    }

    //Ejercicio 43
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 43.
     */
    public static void SumaElementosMatriz() {
        System.out.println("\tEl método a analizar es:\n" +
                "public static double sumaEltosMatriz(double matriz[][]){\n" +
                "   double suma = 0;\n" +
                "   for(int i = 0; i < matriz.length; i++){\n" +
                "       for(int j = 0; j < matriz[i].length; j++){\n" +
                "           suma+=matriz[i][j];\n" +
                "           }\n" +
                "       }\n" +
                "   return suma;\n" +
                " }");
        System.out.println("Su complejidad temporal será: lim T(n*n) / n² = 1 => O(n²), complejidad cuadrática.");
    }

    //Ejercicio 44
    /**
     * Este método calcula la respuesta al ejercicio 44.
     * @param n Valor del número a buscar.
     * @param array Array donde buscar el elemento
     * @return Devuelve verdadero si se ha encontrado y falso si no.
     */
    public static boolean Buscar(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 44.
     */
    public static void PrintBusqueda() {
        System.out.println("\tAlgoritmo para buscar un número en un Array:\n" +
                "        for (int i = 0; i < array.length; i++) {\n" +
                "            if (array[i] == n) {\n" +
                "                return true;\n" +
                "            }\n" +
                "        }\n" +
                "        return false;\n" +
                "En el mejor caso, la complejidad sería de O(1),\n" +
                "en el promedio y en el peor caso es O(n).");
    }

    //Ejercicio 46
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 46.
     */
    public static void Fibonacci() {
        System.out.println("La complejidad temporal de la sucesión de\n" +
                "Fibonacci sería O(2^n) y la espacial O(n).");
    }

    //Ejercicio 48

    //Ejercicio 50

    //Ejercicio 52
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 52.
     */
    public static void ComplejidadTemporal() {
        System.out.println("La complejidad puede alcanzar O(n^2) en el peor caso.");
    }

    //Ejercicio 54
    /**
     * Este método se utiliza para alojar la respuesta al ejercicio 54.
     */
    public static void Calculos() {
        System.out.println("1\tn=100");
        System.out.println("1. log(n) = 66.4 ns");
        System.out.println("2. n = 1 μs");
        System.out.println("3. nlog(n) = 6.64 μs");
        System.out.println("4. n² = 0.1 ms");
        System.out.println("5. n⁸ = 316,000 años");
        System.out.println("6. 10n = 10 μs");
        System.out.println("2\tn=100.00");
        System.out.println("1. log(n) = 166 ns");
        System.out.println("2. n = 1 ms");
        System.out.println("3. nlog(n) = 16.6 ms");
        System.out.println("4. n² = 115 días");
        System.out.println("5. n⁸ = ");
        System.out.println("6. 10n = 10 ms");
        System.out.println("3\tn=100.000 t=1 ms");
        System.out.println("1. log(n) = 16.6 ms");
        System.out.println("2. n = 100 s");
        System.out.println("3. nlog(n) = 27.7 min");
        System.out.println("4. n² = 115 días");
        System.out.println("5. n⁸ = ");
        System.out.println("6. 10n = 16.6 min");
    }
}