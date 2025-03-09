# Proyecto: Aproximación de Pi con Montecarlo

Este proyecto implementa una aproximación del número Pi utilizando el método de Montecarlo en Java. Se hace uso de una interfaz funcional para calcular el valor estimado de Pi mediante la generación de puntos aleatorios dentro de un cuadrado y verificando cuántos caen dentro de un círculo inscrito.

## Estructura del Proyecto

El proyecto está dividido en dos paquetes principales:

- `dominio`: Contiene la interfaz funcional `PiAproximado`.
- `aplicacion`: Contiene la clase `Principal`, que implementa el cálculo de Pi y la interacción con el usuario.

## Diagrama UML

A continuación, se muestra el diagrama UML del proyecto:

![Diagrama UML](https://github.com/Matthew-PV/Repositorio-Progra-II/blob/44fe2fa2fea2bb0f21cd452e29248dee33935cf5/Pr%C3%A1cticas/Pr%C3%A1ctica%203/Diagrama%20UML.png)

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