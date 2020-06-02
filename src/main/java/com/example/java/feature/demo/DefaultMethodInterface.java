package com.example.java.feature.demo;

public class DefaultMethodInterface implements Flyable, Animal, Aeroplane {
    public void print() {
        System.out.println("My thing can fly...");
        Flyable.super.print();
        Animal.super.print();
        Aeroplane.super.print();
    }

    /*@Override
    public void print() {
//        Flyable.super.print();
//        Animal.super.print();
//        Aeroplane.super.print();
    }*/

    public static void main(String[] args) {
        DefaultMethodInterface defaultMethodInterface = new DefaultMethodInterface();
        defaultMethodInterface.print();
    }
}
