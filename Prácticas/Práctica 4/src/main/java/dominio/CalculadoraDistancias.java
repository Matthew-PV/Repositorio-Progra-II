package dominio;

public class CalculadoraDistancias{
    /**
     * Función de recubrimiento y utilidad para la
     * distancia de edición mínima entre dos cadenas.
     * <p>
     * Calcula la distancia de edición, tal y como la expone
     * Jurafsky entre las cadenas 's1' y 's2'.
     * Dado que la distancia es la misma tanto partiendo desde s1 - s2
     * como al contrario, ninguna de ellas se considera "la referencia".
     * @param patron Valor de la primera cadena (s1).
     * @param cadena Valor de la cadena a comparar (s2).
     * @return Distancia de edición entre patron y cadena.
     */
    public static int calcularDistancia(String patron, String cadena){
        int[][] tabla = new int[patron.length()+1][cadena.length()+1]; //Creamos la tabla de soluciones
        //Damos un valor temporal a todas las soluciones para ver cuáles
        //ya están calculadas y cuáles no.
        for (int i = 0 ; i <= patron.length() ; i++) {
            for (int j = 0 ; j <= cadena.length() ; j++) {
                tabla[i][j] = -1;
            }
        }
        return calcularDistanciaAux(patron, cadena, 0, 0, tabla);
    }
    /**
     * Función auxiliar que realiza la funcionalidad real del cálculo de la distancia.
     * Utiliza memoria cache en forma de una tabla con las distintas distancias en cada
     * caso para optimizar la complejidad temporal, reduciendo el algoritmo
     * de una complejidad temporal exponiencial a una polinómica.
     * <p>
     * <p>
     * Partiendo desde el primer símbolo de cada cadena, analiza si estos son iguales.
     * <p>
     * - Si bien lo son, analiza los dos siguientes símbolos (no suma nada, pues no hay que modificarlos).
     * <p>
     * - Si no:
     * * O bien inserta un nuevo caracter de s2 a s1 en la posición actual (empujando el que antes
     * se encontraba aquí), sumando 1 y pasando a comparar el siguiente de s2 con el nuevo de s1.
     * * O bien borra el caracter actual de s1, sumando 1 y pasando a comparar el siguiente de s1
     * con el actual de s2.
     * <p>
     * Después toma el valor mínimo entre insertar o borrar.
     * @param patron Valor de la cadena s1.
     * @param cadena Valor de la cadena s2.
     * @param i Índice actual que estamos evaluando del patron (s1).
     * @param j Índice actual que estamos evaluando de la cadena (s2).
     * @param tabla Tabla donde se almacenan las distintas soluciones.
     * @return Devuelve el valor de la posición final de la tabla a la que hemos llegado,
     * que contendrá la distancia mínima.
     */
    public static int calcularDistanciaAux(String patron, String cadena, int i, int j, int[][] tabla) {
        //Casos base (todos los símbolos anteriores ya son iguales y hemos llegado al final):
        if (i == patron.length()) return cadena.length() - j; //Sobran símbolos en la cadena y toca borrarlos.
        if (j == cadena.length()) return patron.length() - i; //Faltan símbolos en la cadena y toca insertarlos.
            //Solución ya calculada (distinta de -1):
        if (tabla[i][j] != -1) return tabla[i][j]; //Devolvemos el valor de esa posición de la tabla

        /*
        Si no es ninguno de los anteriores:
            El caracter que estamos analizando ya es igual (P = P) -> [lo que llevamos] + [mirar el siguiente]
            El caracter que estamos analizando no es igual -> [lo que llevamos] + [el mínimo entre:
                - Insertar el símbolo en el patrón y mirar el siguiente de la cadena (Hacer el patrón más largo).
                - Borrar el símbolo del patrón y mirar el siguiente (Hacerlo más corto
                  esperando que haya un símbolo que coincida).]
        En código:
        */
        if (patron.charAt(i) == cadena.charAt(j)) //Si son iguales
            tabla[i][j] = calcularDistanciaAux(patron, cadena, i+1, j+1, tabla); //Guardamos en la posición actual
        else { //Si no son iguales
            //Almacenamos temporalmente el valor de ambas posibilidades:
            int insertar = 1 + calcularDistanciaAux(patron, cadena, i, j+1, tabla);
            int borrar = 1 + calcularDistanciaAux(patron, cadena, i+1, j, tabla);
            tabla[i][j] = Math.min(insertar, borrar); //Guardamos en la posición actual
        }
        //Devolvemos la posición actual, que finalmente será la posición de la solución con la distancia mínima.
        return tabla[i][j];
    }
    /*
    if (i == patron.length()) return cadena.length() - j;
    if (j == cadena.length()) return patron.length() - i;
    if (tabla[i][j] != -1) return tabla[i][j];

    if (patron.charAt(i) == cadena.charAt(j))
        tabla[i][j] = calcularDistanciaAux(patron, cadena, i+1, j+1, tabla);
    else {
        int isertar = 1 + calcularDistanciaAux(patron, cadena, i, j+1, tabla);
        int borrar = 1 + calcularDistanciaAux(patron, cadena, i+1, j, tabla);
        tabla[i][j] = Math.min(insertar, borrar);
    }
    return tabla[i][j];
     */
}