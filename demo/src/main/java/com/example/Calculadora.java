package com.example;

public class Calculadora {

    /**
     * Este método funciona correctamente.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Este método tiene un error intencional.
     */
    public int restar(int a, int b) {
        return a + b; // Error: Debería ser a - b
        
    }
}