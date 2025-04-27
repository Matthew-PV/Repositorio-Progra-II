# Calculadora de Distancias de Edición

Este proyecto implementa una calculadora de distancia de edición mínima entre dos cadenas de texto, utilizando un enfoque basado en programación dinámica para optimizar el cálculo.

## Estructura del Proyecto

- **dominio/CalculadoraDistancias.java**: Contiene la lógica de cálculo de la distancia de edición mínima entre dos cadenas. Se emplea una versión recursiva optimizada mediante memoización (cacheo de resultados).
- **aplicacion/Principal.java**: Programa principal que permite al usuario interactuar a través de la consola para:
  - Introducir/modificar dos cadenas de texto.
  - Calcular la distancia de edición mínima entre ellas.
  - Finalizar la ejecución escribiendo `stop` o `parar`.

##Uso
Una vez ejecutado, el programa permitirá:

- Cambiar el valor de las cadenas.

- Calcular la distancia de edición mínima entre las dos cadenas actuales.

- Terminar el programa escribiendo stop o parar.

###Ejemplo de ejecución
Calculadora de distancias
(stop/parar para terminar)
    1 - Cambiar valor cadena 1 (actual )
    2 - Cambiar valor cadena 2 (actual )
    3 - Calcular distancia de edición mínima
Introduce el número de la instrucción a ejecutar: 1
Introduce el nuevo valor de la cadena 1 (actual): casa
Introduce el número de la instrucción a ejecutar: 2
Introduce el nuevo valor de la cadena 2 (actual): caza
Introduce el número de la instrucción a ejecutar: 3
La distancia de edición mínima entre casa y caza es 1

##Diagrama de clases
A continuación se muestra un diagrama de clases de la estructura del proyecto:

<!-- Reemplaza 'diagrama-clases.png' con la ruta o URL real de tu imagen si es diferente -->

##Licencia
Este proyecto está licenciado bajo la <a href="https://www.apache.org/licenses/LICENSE-2.0">Apache License 2.0</a>.