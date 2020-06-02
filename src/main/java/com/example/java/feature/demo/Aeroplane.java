package com.example.java.feature.demo;

public interface Aeroplane {
    default void print(){
        System.out.println("Aeroplane Can Fly...");
    }
}
