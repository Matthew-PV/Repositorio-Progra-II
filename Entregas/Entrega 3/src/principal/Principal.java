package principal;

import java.util.*;
import java.util.stream.Collectors;

import dominio.Ejercicio15;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ejercicio15 funciones = new Ejercicio15();

        //Apartado 1 del ejercicio 15.
        System.out.print("\t1. La suma 0+1+2+...+n.\nIntroduce el valor de n: ");
        int n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.sumaN(n));

        //Apartado 2
        System.out.print("\n\t2. El factorial de un número.\nIntroduce el valor del número: ");
        n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.factorial(n));

        //Apartado 3
        System.out.print("\n\t3. La potencia n-ésima de un número natural.\nIntroduce el número: ");
        int a = teclado.nextInt();
        System.out.print("Ahora introduce el valor de la potencia: ");
        n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.potenciaEnesima(a, n));

        //Apartado 4
        System.out.println("\n\t4. La suma de los elementos de una lista de números.");
        teclado.reset();
        List<Integer> lista1 = crearLista(teclado);
        System.out.println("Resultado: "+funciones.sumaLista(lista1));

        //Apartado 5
        System.out.println("\n\t5. La media aritmética de una lista de números.\nLista: "+lista1);
        System.out.println("Resultado: "+funciones.media(lista1));

        //Apartado 6
        System.out.println("\n\t6. La desviación típica de una lista de números.\nLista: "+lista1);
        System.out.println("Resultado: "+funciones.desviacionTipica(lista1));

        //Apartado 7
        System.out.print("\n\t7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. Por\n" +
                " ejemplo, sumaPares(9) = 8+6+4+2 = 20." +
                "\nIntroduce el valor de n: ");
        n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.sumaPares(n));

        //Apartado 8
        System.out.println("\n\t8. La suma de los elementos pares de una lista de enteros. Por ejemplo,\n" +
                " sumaPares([1,2,3,4]) = 6.");
        lista1.clear();
        teclado.reset();
        lista1 = crearLista(teclado);
        System.out.println("Resultado: "+funciones.sumaParesLista(lista1));

        //Apartado 9
        System.out.println("\n\t 9. Dada una lista de números naturales mayores o iguales que 2, obtiene\n" +
                " otra lista con los números pares de la lista inicial, en el mismo orden y\n" +
                " respetando los números  repetidos. Por ejemplo,\n" +
                " obtenerListaPar([1,2,6,11]) = [2,6].");
        lista1.clear();
        teclado.reset();
        lista1 = crearLista(teclado);
        System.out.println("Resultado: "+funciones.listaPar(lista1));

        //Apartado 10
        System.out.print("\n\t10. La lista de los primeros números pares hasta n asumiendo n ≥ 2. Por\n" +
                " ejemplo, listaPar(9) = [8,6,4,2]." +
                "\nIntroduce el valor de n: ");
        n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.listaParReducida(n));

        //Apartado 11
        System.out.println("\n\t11. Producto escalar de dos listas de números no vacías y del mismo tama\n" +
                "ño. Por ejemplo, calcularProductoEscalar([1,2,3],[2,4,6]) = 1 · 2 +\n" +
                " 2 · 4+3·6 =2+8+18=28");
        lista1.clear();
        teclado.reset();
        lista1 = crearLista(teclado);
        System.out.println("Ahora con la lista 2.");
        List<Integer> lista2 = crearLista(teclado);
        System.out.println("Resultado: "+funciones.productoEscalar(lista1, lista2));

        //Apartado 12
        System.out.print("\n\t12. El elemento n-ésimo de la sucesión de Fibonacci." +
                "\nIntroduce el valor de n: ");
        n = teclado.nextInt();
        System.out.println("Resultado: "+funciones.fibonacci(n));
    }

    /**
     * Método auxiliar creado para facilitar la creación de listas
     * a la hora de hacer pruebas con el código.
     * @param teclado Scanner que se utilizará para introducir los elementos.
     * @return Devuele una lista de números enteros.
     */
    public static List<Integer> crearLista(Scanner teclado) {
        teclado.nextLine();
        ArrayList<Integer> lista = new ArrayList<>();
        String entrada;
        do {
            System.out.print("Introduce un valor que añadir a la lista (STOP para parar): ");
            entrada = teclado.nextLine();
            try {
                if (!entrada.equalsIgnoreCase("stop"))
                    lista.add(Integer.parseInt(entrada));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, inténtalo de nuevo.");
            }
        } while (!entrada.equalsIgnoreCase("stop"));
        List<Integer> resultado = lista;
        System.out.println("Lista creada: "+resultado);
        return resultado;
    }
}