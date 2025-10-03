package org.poo.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducei numărul:");
        int n = sc.nextInt();

        while (n >= 10) {
            int suma = 0;
            while (n > 0) {
                suma += n % 10;
                n = n / 10;
            }
            n = suma;
        }

        System.out.println("Cifra de control = " + n);
    }
}
