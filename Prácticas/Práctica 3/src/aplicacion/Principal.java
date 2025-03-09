package aplicacion;

import dominio.PiAproximado;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Principal {
    private static final double radio = 1;

    /**
     * Ejecución principal de la práctica 3.
     * Se pone a prueba el método de Montecarlo para el cálculo de pi,
     * mediante la generación de puntos de la función "piAproximado".
     */
    public static void main (String []args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Implementación funcional del método de Montecarlo para calcular el valor aproximado de Pi:" +
                "\n\tGeneraremos puntos que pueden estar contenidos dentro de un círculo de radio: "+radio+"\n\t" +
                "y calcularemos su proporción respecto del total generados.\nIntroduce la cantidad de puntos " +
                "a generar: ");
        int total = teclado.nextInt();
        System.out.println("Valor aproximado de Pi: "+ piAproximado(total));
    }

    /**
     * Método encargado de alojar el funcionamiento de la función
     * que calcula el valor aproximado de pi.
     * @param puntos Tamaño del stream, que corresponde con la cantidad de puntos que se generarán.
     * @return Valor aproximado de pi según el número de puntos generados.
     */
    public static double piAproximado(int puntos) {
        //Referencia a la interfaz funcional
        PiAproximado interfaz = total -> IntStream.rangeClosed(0, total)
                .mapToDouble(punto -> { //Transformación del stream a punto (x, y).
                    double x = Math.random();
                    double y = Math.random();
                    //Comprobación para ver si el punto está contenido, actualizando el contador.
                    return (x*x + y*y) <= 1 ? 1 : 0;
                })
                .sum() * 4.0 / total; //Fórmula 4*d/t, siendo d los dardos contenidos en la circunferencia.
        return interfaz.valor(puntos);
    }
}