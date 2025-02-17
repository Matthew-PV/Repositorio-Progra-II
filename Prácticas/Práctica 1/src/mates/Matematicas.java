package mates;

public class Matematicas{
    private final static int r = 1; //Declaración del radio para posibles pruebas.

    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo. Usaremos una circunferencia de radio r = 1 centrada en (0,0).
     * @param pasos Indica el número de puntos generados.
     * @return Devuelve el valor aproximado de Pi.
     */
    public static double generarNumeroPiIterativo(long pasos){
        int puntos = 0; //Contador de puntos contenidos.

        for (int i = 1 ; i < pasos ; i++) { //Estructura de control repetitiva

            //Asignaciones iniciales de valores entre 0 y 1 para las coordenadas del punto.
            double x = Math.random();
            double y = Math.random();

            //El punto estará en el interior de la circunferencia si (x-x0)^2 + (y-y0)^2 <= r
            if ((x*x + y*y) <= r) puntos++; //Estructura de control condicional
        }
        //Pi es 4 veces la proporción de puntos contenidos respecto de los puntos totales.
        return 4.0*puntos/pasos; //Valor aproximado de Pi
    }
}
