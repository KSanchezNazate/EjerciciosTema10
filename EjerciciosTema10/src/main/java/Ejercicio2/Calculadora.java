package Ejercicio2;

import java.util.Scanner;

public class Calculadora {
    public void calcular() {
        Scanner scanner = new Scanner(System.in);
        int a, b, opcion = 0;

        do {
            try {
                System.out.println("CALCULADORA");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción inválida. Inténtelo de nuevo...");
                } else if (opcion != 5) {
                    System.out.print("Introduzca el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Introduzca el segundo número: ");
                    b = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Resultado: " + Operacion.sumar(a, b));
                            break;
                        case 2:
                            System.out.println("Resultado: " + Operacion.restar(a, b));
                            break;
                        case 3:
                            System.out.println("Resultado: " + Operacion.multiplicar(a, b));
                            break;
                    }
                }
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage() + " Inténtelo de nuevo...");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + " Inténtelo de nuevo...");
            } catch (Exception e) {
                scanner.nextLine(); // Consumir entrada no válida
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
            }
        } while (opcion != 4);

        System.out.println("Adios");
    }
}

