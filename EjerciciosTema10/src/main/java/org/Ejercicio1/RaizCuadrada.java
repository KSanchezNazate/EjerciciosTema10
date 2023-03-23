package org.Ejercicio1;

public class RaizCuadrada {
    public static double raizCuadrada(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Argumento no puede ser negativo");
        }
        return Math.sqrt(num);
    }
}
