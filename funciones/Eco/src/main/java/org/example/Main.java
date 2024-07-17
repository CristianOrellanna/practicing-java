package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de veces que desea ver el mensaje: ");
        int veces = sc.nextInt();
        eco(veces);
    }

    static void eco(int u){
        for (int i = 0; i < u; i ++){
            System.out.println("Eco...");
        }
    }
}