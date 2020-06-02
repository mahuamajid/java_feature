package com.example.java.feature.demo;

public interface Flyable {
    default void print(){
        System.out.println("I can fly...");
    }
}
