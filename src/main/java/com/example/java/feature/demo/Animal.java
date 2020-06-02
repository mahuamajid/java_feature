package com.example.java.feature.demo;

public interface Animal {
    default void print(){
        System.out.println("Bird Can Fly...");
    }
}
