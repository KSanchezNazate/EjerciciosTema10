package org.Ejercicio1;

import java.util.Scanner;

public class IntroducirDatos {
public void introducirDatos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    double num = sc.nextDouble();
    System.out.println("El número introducido es: " + num);
    sc.close();

    RaizCuadrada raiz = new RaizCuadrada();
    System.out.println("La raíz cuadrada de " + num + " es: " + raiz.raizCuadrada(num));

    }

}
