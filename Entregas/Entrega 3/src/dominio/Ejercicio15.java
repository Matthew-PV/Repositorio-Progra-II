package dominio;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ejercicio15 implements matematicas {
    //1
    @Override
    public int sumaN(int n) {
        return IntStream
                .rangeClosed(0, n)
                .sum();
    }
    //2
    @Override
    public long factorial(int n) {
        return LongStream
                .rangeClosed(1, n).reduce((num1, num2) -> num1 * num2)
                .orElse(1);
    }
    //3
    @Override
    public long potenciaEnesima(int a, int n) {
        return LongStream.rangeClosed(1, n)
                .map(w -> a)
                .reduce((num1, num2) -> num1 * num2).orElse(a);
    }
    //4
    @Override
    public int sumaLista(List<Integer> lista) {
        return lista.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    //5
    @Override
    public double media(List<Integer> lista){
        return lista.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    //6
    @Override
    public double desviacionTipica(List<Integer> lista){
        double media = media(lista);
        return Math.sqrt(lista.stream()
                .mapToDouble(num -> Math.pow(num - media, 2))
                .average()
                .orElse(0.0));
    }

    //7
    @Override
    public int sumaPares(int n) {
        return IntStream
                .iterate(n%2 == 0 ? n: n - 1, x -> x > 0, x -> x - 2)
                .sum();
    }

    //8
    @Override
    public int sumaParesLista(List<Integer> lista){
        return lista.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    //9
    @Override
    public List<Integer> listaPar(List<Integer> lista){
        return lista.stream()
                .filter(x -> x % 2 == 0)
                .toList();
    }

    //10
    @Override
    public List<Integer> listaParReducida(int n){
        return IntStream.iterate(n % 2 == 0 ? n : n - 1, x -> x > 0, x -> x - 2)
                .boxed()
                .toList();
    }

    //11
    @Override
    public int productoEscalar(List<Integer> lista1, List<Integer> lista2){
        return IntStream
                .range(0, lista1.size() * lista2.size())
                .sum();
    }

    //12
    @Override
    public int fibonacci(int n){
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .map(f -> f[0])
                .toList()
                .get(n-1);
    }
}