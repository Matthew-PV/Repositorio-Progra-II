# Proyecto: Aproximación de Pi con Montecarlo

Este proyecto implementa una aproximación del número Pi utilizando el método de Montecarlo en Java. Se hace uso de una interfaz funcional para calcular el valor estimado de Pi mediante la generación de puntos aleatorios dentro de un cuadrado y verificando cuántos caen dentro de un círculo inscrito.

## Estructura del Proyecto

El proyecto está dividido en dos paquetes principales:

- `dominio`: Contiene la interfaz funcional `PiAproximado`.
- `aplicacion`: Contiene la clase `Principal`, que implementa el cálculo de Pi y la interacción con el usuario.

## Diagrama UML

A continuación, se muestra el diagrama UML del proyecto:

![Diagrama UML](ruta/a/la/imagen.png)

## Ejecución

Para ejecutar el programa, compila y ejecuta la clase `Principal`:

```sh
javac -d . dominio/PiAproximado.java aplicacion/Principal.java
java aplicacion.Principal
```

## Licencia

Este proyecto está licenciado bajo los términos de la [Licencia Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0).

## Autores

-Lucía Guzmán
-Matthew Puente-Villegas