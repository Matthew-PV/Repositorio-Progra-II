package dominio;

public class Matematicas{
    private final static int r = 1; //Declaración del radio para posibles pruebas.

    /**
     * Función que permite el acceso sencillo a la función auxiliar.
     * @param puntos Indica el número de puntos generados
     * @return Devuelve el valor de la función auxiliar, que es un valor aproximado de Pi.
     */
    public static double generarNumeroPiRecursivo(long puntos) {
        return generarNumeroPiRecursivoAux(puntos, 0, 0);
    }

    /**
     * Función auxiliar recursiva con memoria que contiene el funcionamiento
     * del método. Genera una aproximación al número Pi mediante el método de
     * Montecarlo. Usaremos una circunferencia de radio r = 1 centrada en (0,0).
     * @param puntos Indica el número de puntos generados.
     * @param actual Almacena el índice de la iteración actual que estamos evaluando.
     * @param contenidos Contador que acumula la cantidad de puntos contenidos en el círculo.
     * @return Devuelve cuatro veces la cantidad de puntos contenidos dividida por el total de puntos.
     */
    private static double generarNumeroPiRecursivoAux(long puntos, int actual, int contenidos){
        if (actual < puntos) {
            //Asignaciones iniciales de valores entre 0 y 1 para las coordenadas del punto.
            double x = Math.random();
            double y = Math.random();

            //El punto estará en el interior de la circunferencia si (x-x0)^2 + (y-y0)^2 <= r
            if ((x * x + y * y) <= r) {
                contenidos++;
            }
            actual++;
            return generarNumeroPiRecursivoAux(puntos, actual, contenidos);
        }
        else {
            //Pi es 4 veces la proporción de puntos contenidos respecto de los puntos totales.
            return 4.0 * contenidos / puntos; //Valor aproximado de Pi
        }
    }
}
