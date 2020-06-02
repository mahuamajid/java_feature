package com.example.java.feature.demo;

public class MethodReference {
    public static void main(String[] args) {
        //---1. Reference To an instance method--------
        Calculator instance = new Calculator();
        FuncInterface fun1 = instance::sub;
        System.out.println(fun1.calc(4, 3));

        //---2. Reference to a static method-----------
        FuncInterface fun2 = Calculator::sum;
        System.out.println(fun2.calc(4, 3));
    }
}
