package com.example.java.feature.demo;

import java.util.Optional;

public class StringFeature {
    public static void main(String[] args) {
        String str1 = "";
        System.out.println(str1.isBlank());

        String str2 = "test";
        System.out.println(str2.isBlank());

        String str3 = "ab";
        System.out.println(str3.repeat(5));

        Optional str4 = Optional.empty();
        System.out.println(str4.isEmpty());

        Optional str5 = Optional.of("abc");
        System.out.println(str5.isPresent());

        Optional<String> opt = Optional.of("abc");
        opt.ifPresent(name -> System.out.println(name.length()));
    }
}
