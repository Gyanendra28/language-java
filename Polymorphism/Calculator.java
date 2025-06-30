package Polymorphism;

public class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with different argument count
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different argument type
    double add(int a, int b, int c, double d) {
        return a + b + c + d;
    }
}