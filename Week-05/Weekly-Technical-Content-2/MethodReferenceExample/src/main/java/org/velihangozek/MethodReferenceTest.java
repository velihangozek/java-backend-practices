package org.velihangozek;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        // 1. Static Method Reference => ClassName::methodName
        // 2. Instance Method Reference => objectReference::instanceMethod
        // 3. Instance Method Reference (via Class Reference) => ClassName::methodName
        // 4. Constructor Method Reference => ClassName::new

        // 1. Static Method Reference => ClassName::methodName
        BiFunction<Integer, Integer, Integer> calculateTotal = MathOperations::sum;
        System.out.println(calculateTotal.apply(3, 7));

        // 2. Instance Method Reference => objectReference::instanceMethod
        Printer printer = new Printer();
        Consumer<String> print = printer::print;
        print.accept("Velo - Instance Method Reference");

        // 3. Instance Method Reference (via Class Reference) => ClassName::methodName
        BiConsumer<Printer, String> print1 = Printer::print;
        print.accept("Velo - Instance Method Reference (via Class Reference)");
        List<String> names = Arrays.asList("Velihan", "Tutku", "Türkan", "Taylan");
        names.forEach(System.out::println);

        // 4. Constructor Method Reference => ClassName::new
        Runnable carRunner = Car::new;
        carRunner.run();
        new Thread(carRunner).start();
        Supplier<Car> carSupplier = Car::new;
        Car car = carSupplier.get();
        carSupplier.get();
    }
}
