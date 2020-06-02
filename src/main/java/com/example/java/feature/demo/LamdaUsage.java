package com.example.java.feature.demo;

import java.util.stream.IntStream;

public class LamdaUsage {
    public static void main(String[] args) {
        FuncInterface fun = (a, b) -> a + b;
        System.out.println(fun.calc(5, 10));

        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((int i) -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
