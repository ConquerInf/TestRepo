package org.example;

import java.util.function.Function;

public class TestClass {
    public static void main(String[] args) {
        Function<String,String>function = s -> {
            return "Hello "+s;
        };
        System.out.println("This is a test class");
        System.out.println("Manipulated String : "+function.apply("Contour"));
    }
}
