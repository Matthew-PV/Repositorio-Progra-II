# Aproximación al Número Pi con el Método de Montecarlo

Este proyecto contiene un programa en Java que utiliza el **método de Montecarlo** para generar una aproximación del número Pi. Se genera un número Pi utilizando puntos aleatorios dentro de un círculo de radio 1, en el primer cuadrante de un sistema de coordenadas cartesianas.

## Estructura del Proyecto

El proyecto está compuesto por dos clases principales:

1. **Matematicas.java**: Esta clase contiene los métodos para generar la aproximación de Pi utilizando recursividad.
2. **Principal.java**: Esta clase es la clase de entrada que interactúa con el usuario y muestra el resultado de la aproximación.

## Funcionalidad

### Clase `Matematicas`

La clase `Matematicas` contiene dos métodos principales:

- `generarNumeroPiRecursivo(long puntos)`: Este es el punto de entrada que permite al usuario indicar cuántos puntos desea generar para la aproximación de Pi. Internamente, llama al método recursivo `generarNumeroPiRecursivoAux`.

- `generarNumeroPiRecursivoAux(long puntos, int actual, int contenidos)`: Método recursivo que genera puntos aleatorios dentro de un círculo con radio 1 y calcula una aproximación del número Pi a partir de la proporción de puntos dentro del círculo respecto al total de puntos generados.

#### Parámetros
- **puntos**: Número de puntos aleatorios generados.
- **actual**: Índice actual de la iteración.
- **contenidos**: Contador que lleva la cuenta de los puntos que están dentro del círculo.

### Clase `Principal`

La clase `Principal` es la interfaz de usuario que solicita al usuario la cantidad de pasos (puntos) que desea generar. Luego, imprime el valor aproximado de Pi calculado.

## Instrucciones de Uso

1. Clona o descarga este proyecto.
2. Compila el código Java:
   javac dominio/Matematicas.java aplicacion/Principal.java
3. Ejecuta el programa: java aplicacion.Principal
4. Introduce la cantidad de puntos a generar cuando se te solicite. Cuantos más puntos generes, mayor será la precisión de la aproximación de Pi.

## Ejemplo de Ejecución

Introduce la cantidad de pasos a ejecutar: 1000000
El número PI es 3.141633

#### Advertencia
En nuestros equipos no hemos logrado utilizar más de 5000 pasos por falta de memoria.

## Explicación del Método de Montecarlo

El método de Montecarlo es una técnica de simulación probabilística que utiliza la aleatoriedad para obtener resultados aproximados. En este caso, el programa genera puntos aleatorios en el primer cuadrante de un círculo de radio 1. Luego, calcula la proporción de puntos que caen dentro del círculo respecto del total y la multiplica por 4 para aproximar el valor de Pi. A medida que aumentamos la cantidad de puntos generados, la aproximación de Pi se vuelve más precisa.

### Notas

El valor de Pi generado será más preciso si se aumenta la cantidad de puntos (pasos).
El proceso es recursivo, lo que significa que utiliza funciones que se llaman a sí mismas para realizar las iteraciones.

### Licencia

La práctica está bajo la licencia Apache 2.0. Consultar el archivo LICENSE para
más detalles.