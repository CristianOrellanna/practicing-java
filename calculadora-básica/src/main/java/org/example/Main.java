package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que operación desea realizar?(ingrese el número de la opción)");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) divición");
        System.out.println("4) multiplicación");
        System.out.println("-------------------------------------");
        int accionQueRealizar = sc.nextInt();

        System.out.println("Ingrese el primer número:");
        int num1 = (int) sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        int num2 = (int) sc.nextDouble();

        if (accionQueRealizar == 1){
            int accionSuma = num1 + num2;
            System.out.println("El resultado de la suma es: " + accionSuma);
        } else if (accionQueRealizar == 2) {
            int accionResta = num1 - num2;
            System.out.println("El resultado de la resta es: " + accionResta);
        } else if (accionQueRealizar == 3) {
            int accionDivicion = num1 / num2;
            System.out.println("El resultado de la divición es: " + accionDivicion);
        }else if (accionQueRealizar == 4){
            int accionMultiplicar = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + accionMultiplicar);
        }else {
            System.out.print("No a ingresado una acción a realizar");
        }
    }
}