package org.poo.ex2.sol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float pi = 0.f;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pi += 1.f / (2 * i + 1);
            } else {
                pi -= 1.f / (2 * i + 1);
            }
        }
        pi *= 4;

        System.out.println("Aproximare pi = " + pi);
    }
}
