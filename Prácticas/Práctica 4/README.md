# 🛠️ Calculadora de Distancia de Edición

Este proyecto en Java implementa una herramienta interactiva que permite calcular la **distancia de edición mínima** entre dos cadenas de texto, utilizando una estrategia de **programación dinámica** para optimizar la eficiencia.

---

## 📚 Contenido

- [Descripción](#descripción)
- [Ejecución](#ejecución)
- [Diagrama UML](#diagrama-uml)
- [Licencia](#licencia)

---

## 📖 Descripción

La aplicación cuenta con dos componentes principales:

- `CalculadoraDistancias` (paquete `dominio`):  
  Contiene la lógica para calcular la distancia de edición mínima entre dos cadenas.

- `Principal` (paquete `aplicacion`):  
  Clase principal que gestiona la interacción con el usuario mediante consola.

La distancia de edición mínima, en este caso, considera únicamente **inserciones** y **borrados**, sin sustituciones.

---

## 🏗️ Estructura de las Clases

La organización de las clases es sencilla y modular:

| Clase                  | Paquete       | Descripción |
|:-----------------------|:--------------|:------------|
| `CalculadoraDistancias` | `dominio`     | Implementa el algoritmo de distancia de edición utilizando **programación dinámica**. Contiene métodos estáticos para el cálculo. |
| `Principal`             | `aplicacion`  | Clase que gestiona el flujo de la aplicación mediante un menú de opciones en la consola. |

**Relaciones principales:**

- `Principal` hace uso de los métodos estáticos de `CalculadoraDistancias`.
- No existen dependencias complejas ni herencia entre las clases.

**Javadoc:**
- La descripción de cada método se puede analizar en los archivos de la carpeta `html`.

---

## 🏃 Ejecución

### 📋 Menú principal

| Opción | Acción |
|:------:|:------ |
| 1️⃣    | Cambiar valor **cadena 1** |
| 2️⃣    | Cambiar valor **cadena 2** |
| 3️⃣    | Calcular **distancia de edición mínima** |
| 🛑     | Escribir `stop` o `parar` para **terminar** |

---

### 🚀 Flujo de ejecución

```bash
Calculadora de distancias
(stop/parar para terminar)

    1 - Cambiar valor cadena 1 (actual: )
    2 - Cambiar valor cadena 2 (actual: )
    3 - Calcular distancia de edición mínima

Introduce el número de la instrucción a ejecutar: 1️⃣
Introduce el nuevo valor de la cadena 1 (actual: ): casa

Introduce el número de la instrucción a ejecutar: 2️⃣
Introduce el nuevo valor de la cadena 2 (actual: ): caza

Introduce el número de la instrucción a ejecutar: 3️⃣
La distancia de edición mínima entre **casa** y **caza** es **1**
```

---

## 📈 Diagrama UML

A continuación se muestra el diagrama UML básico que representa la estructura del proyecto:

_Aquí va el diagrama de clases en formato imagen_  
![Diagrama UML](https://github.com/Matthew-PV/Repositorio-Progra-II/blob/ea156f4b8e5c60845e44d6502158de94e83f905b/Pr%C3%A1cticas/Pr%C3%A1ctica%204/Diagrama%20UML.png)

---

## 📜 Licencia

Este proyecto está protegido bajo la licencia **Apache 2.0**.  
Consulta el archivo [`LICENSE`](LICENSE) para más detalles.

---
