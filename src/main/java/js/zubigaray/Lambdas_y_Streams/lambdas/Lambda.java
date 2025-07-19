package js.zubigaray.Lambdas_y_Streams.lambdas;

import java.util.concurrent.Callable;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        /*
         * ✅ Predicate
         * 🔍 Evalúa una condición lógica sobre un valor. Retorna true o false.
         */
        Predicate<String> predicate = str -> str.length() > 5;
        boolean result = predicate.test("Hola Mundo");
        System.out.println(result);

        /*
         * 🎯 Function
         * 🔁 Recibe un valor y retorna un resultado transformado.
         */
        Function<Integer, String> function = num -> "El número es: " + num;
        String result2 = function.apply(5);
        System.out.println(result2);

        /*
         * 🛠️ Consumer
         * 📤 Recibe un valor y realiza una acción, sin retornar nada.
         */
        Consumer<String> consumer = System.out::print;
        consumer.accept("Santiago");

        /*
         * 📦 Supplier
         * 📥 No recibe valores, pero retorna un resultado.
         */
        Supplier<String> supplier = () -> "Hola, soy un Supplier";
        System.out.println(supplier.get());

        /*
         * 🔧 UnaryOperator
         * 🔁 Variante de Function: transforma un valor al mismo tipo.
         */
        UnaryOperator<Integer> unaryOperator = number -> number * number;
        int result3 = unaryOperator.apply(5);
        System.out.println(result3);

        /*
         * 🧮 BinaryOperator
         * ➕ Variante de BiFunction: opera sobre dos valores del mismo tipo y devuelve el mismo tipo.
         */
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int result4 = binaryOperator.apply(10, 20);
        System.out.println(result4);

        /*
         * ✨ BiFunction
         * 🔁 Recibe dos valores (de cualquier tipo) y retorna un resultado.
         */
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        int result5 = biFunction.apply(10, 20);
        System.out.println(result5);

        /*
         * ⚙️ BiConsumer
         * 📤📤 Recibe dos valores y realiza una acción, sin retornar nada.
         */
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hola", "Mundo");

        /*
         * 🔍 BiPredicate
         * ✅ Evalúa una condición lógica entre dos valores. Retorna true o false.
         */
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        boolean result6 = biPredicate.test(10, 5);
        System.out.println(result6);

        /*
         * 🚀 Runnable
         * 🧭 Ejecuta una tarea sin parámetros ni valor de retorno.
         */
        Runnable runnable = () -> System.out.println("Ejecutando tarea...");
        runnable.run();

        /*
         * 📞 Callable
         * 📬 Ejecuta una tarea que retorna un resultado y puede lanzar una excepción.
         */
        Callable<String> callable = () -> "Resultado de la tarea";
        try {
            String resultado = callable.call();
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Error al ejecutar callable");
        }
    }
}
