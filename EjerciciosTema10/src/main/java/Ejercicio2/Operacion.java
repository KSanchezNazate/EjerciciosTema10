package Ejercicio2;

public class Operacion {
    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        // se usa long para evitar desbordamiento
        long result = (long) a + b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("La suma desborda la capacidad de un entero de tipo int");
        }
        return (int) result;
    }

    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long result = (long) a - b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("La resta desborda la capacidad de un entero de tipo int");
        }
        return (int) result;
    }

    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long result = (long) a * b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion("La multiplicación desborda la capacidad de un entero de tipo int");
        }
        return (int) result;
    }
}
