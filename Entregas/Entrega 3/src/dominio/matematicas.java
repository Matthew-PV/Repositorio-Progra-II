package dominio;

import java.util.List;

public interface matematicas {
    int sumaN(int n);
    long factorial(int n);
    long potenciaEnesima(int a, int n);
    int sumaLista(List<Integer> lista);
    double media(List<Integer> lista);
    double desviacionTipica(List<Integer> lista);
    int sumaPares(int n);
    int sumaParesLista(List<Integer> lista);
    List<Integer> listaPar(List<Integer> lista);
    List<Integer> listaParReducida(int n);
    int productoEscalar(List<Integer> lista1, List<Integer> lista2);
    int fibonacci(int n);
}