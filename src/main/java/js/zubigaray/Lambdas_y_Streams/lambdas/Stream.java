package js.zubigaray.Lambdas_y_Streams.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        /*
         * 🎯 filter() – Operación intermedia
         * 🔍 Filtra los elementos según una condición booleana.
         */
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        /*
         * 🚀 map() – Operación intermedia
         * 🔁 Transforma cada elemento del stream aplicando una función.
         */
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*
         * 💥 forEach() – Operación terminal
         * 📤 Ejecuta una acción para cada elemento del stream (usualmente para mostrar o consumir).
         */
        names.stream()
                .forEach(name -> System.out.println("Nombre: " + name));

        /*
         * 📦 collect() – Operación terminal
         * 📥 Recoge los elementos del stream en una colección o estructura final.
         */
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))  // intermedia
                .collect(Collectors.toList());         // terminal
        System.out.println("Nombres que empiezan con A: " + namesStartingWithA);

        /*
         * 📊 sorted() – Operación intermedia
         * 🔃 Ordena los elementos del stream de forma natural o con un comparador.
         */
        names.stream()
                .sorted()
                .forEach(System.out::println);

        /*
         * 🔗 reduce() – Operación terminal
         * 🔄 Combina todos los elementos del stream en un solo resultado acumulado.
         */
        String concatenatedNames = names.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println("Nombres concatenados: " + concatenatedNames);

        /*
         * ✨ distinct() – Operación intermedia
         * ♻️ Elimina los elementos duplicados del stream.
         */
        List<String> duplicates = Arrays.asList("Ana", "Luis", "Luis", "Maria", "Pedro");
        duplicates.stream()
                .distinct()
                .forEach(System.out::println);

        /*
         * 🎚️ limit() – Operación intermedia
         * 📉 Limita el número de elementos procesados del stream.
         */
        names.stream()
                .limit(3)
                .forEach(System.out::println);

        /*
         * 🔄 skip() – Operación intermedia
         * ⏭️ Omite una cantidad específica de elementos iniciales del stream.
         */
        names.stream()
                .skip(2)
                .forEach(System.out::println);

        /*
         * 🔍 anyMatch() – Operación terminal
         * ✅ Verifica si *algún* elemento cumple una condición.
         */
        boolean anyStartsWithP = names.stream()
                .anyMatch(name -> name.startsWith("P"));
        System.out.println("¿Hay algún nombre que empiece con P?: " + anyStartsWithP);

        /*
         * 🔒 allMatch() – Operación terminal
         * ✔️ Verifica si *todos* los elementos cumplen una condición.
         */
        boolean allHaveMoreThan3Letters = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("¿Todos los nombres tienen más de 3 letras?: " + allHaveMoreThan3Letters);

        /*
         * ❌ noneMatch() – Operación terminal
         * 🚫 Verifica si *ningún* elemento cumple una condición.
         */
        boolean noneStartsWithZ = names.stream()
                .noneMatch(name -> name.startsWith("Z"));
        System.out.println("¿Ningún nombre empieza con Z?: " + noneStartsWithZ);
    }

}
