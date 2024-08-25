package org.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {
    public static void main(String[] args) {
        Function<String, String> function = s -> {
            return "Hello " + s;
        };
        Predicate<String> predicate = s-> s.length()<8;
        System.out.println("Testing Predicate : "+predicate.test("Hello Sir"));
        System.out.println("This is a test class");

        Supplier<String> supplier = ()-> "Heello Supplier";
        System.out.println("Testing supplier : "+supplier.get());

        Consumer<String> consumer = (s)-> System.out.println("Consumer : "+s);
        System.out.println("Testing consumer : ");
        consumer.accept("Tesing consumer");
        System.out.println("Manipulated String : " + function.apply("Contour"));

        printNames(List.of("ankur", "kumar", "is", "a", "great", "coder"));
    }

    public static void printNames(List<String> names) {
        names.forEach(name -> {
                    System.out.println("Printing Names");
                }
        );
    }
}
