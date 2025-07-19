
# 🧠 Java Functional Interfaces (Lambdas) & Streams Examples

Este repositorio contiene ejemplos prácticos sobre el uso de **interfaces funcionales** y **Streams** en Java. Cada sección incluye comentarios mejorados con emojis para facilitar su comprensión y recordación. ¡Ideal para aprender y repasar! 😄

---

## 🔗 Interfaces Funcionales (Lambdas) en Java

Se incluyen ejemplos con las siguientes interfaces del paquete `java.util.function`:

| Interfaz         | Descripción                                                                 |
|------------------|-----------------------------------------------------------------------------|
| ✅ Predicate      | Recibe un valor y devuelve `boolean` (true/false).                         |
| 🎯 Function       | Transforma un valor de entrada en otro de salida.                         |
| 🛠️ Consumer       | Realiza una acción con un valor recibido, sin retornar nada.              |
| 📦 Supplier       | No recibe nada y retorna un valor.                                        |
| 🔧 UnaryOperator  | Similar a Function, pero entrada y salida son del mismo tipo.             |
| 🧮 BinaryOperator | Similar a BiFunction, pero ambos argumentos y resultado son del mismo tipo.|
| ✨ BiFunction     | Recibe dos valores y retorna uno.                                          |
| ⚙️ BiConsumer     | Recibe dos valores y no retorna nada.                                     |
| 🔍 BiPredicate    | Recibe dos valores y retorna booleano.                                    |
| 🚀 Runnable       | Ejecuta una tarea sin entrada ni retorno.                                 |
| 📞 Callable       | Ejecuta una tarea sin entrada, retorna un valor y puede lanzar excepción. |

---

## 🔁 Operaciones de Streams

Se presentan distintos métodos del API Stream, divididos entre intermedios y terminales:

### 🧩 Operaciones Intermedias
- 🎯 `filter()` – Filtra elementos por condición.
- 🚀 `map()` – Transforma los elementos.
- 📊 `sorted()` – Ordena los elementos.
- ✨ `distinct()` – Elimina duplicados.
- 🎚️ `limit()` – Limita la cantidad de elementos.
- 🔄 `skip()` – Omite una cantidad de elementos.

### 🛑 Operaciones Terminales
- 💥 `forEach()` – Ejecuta una acción por cada elemento.
- 📦 `collect()` – Recoge los elementos en una colección.
- 🔗 `reduce()` – Reduce todos los elementos a uno solo.
- 🔍 `anyMatch()` – ¿Algún elemento cumple?
- 🔒 `allMatch()` – ¿Todos cumplen?
- ❌ `noneMatch()` – ¿Ninguno cumple?

---

## 📁 Contenido del Proyecto

- `Lambda.java`: Ejemplos de interfaces funcionales con comentarios explicativos.
- `Stream.java`: Ejemplos de métodos del Stream API, organizados por tipo de operación.

---

## 🧑‍💻 Requisitos
- Java 8+ ☕
- IDE recomendado: IntelliJ IDEA o VS Code

---

## ✨ Autor
Hecho con ❤️ por Juan Simón Zubigaray

