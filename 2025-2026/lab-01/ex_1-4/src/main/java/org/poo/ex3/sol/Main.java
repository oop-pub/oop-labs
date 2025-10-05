package org.poo.ex3.sol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = scanner.nextLine().charAt(0);
        }

        int vocale = 0;
        int consoane = 0;

        for (int i = 0; i < n; i++) {
            char c = chars[i];

            // litere mici
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocale++;
                } else {
                    consoane++;
                }
            }

            // litere mari
            if (c >= 'A' && c <= 'Z') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vocale++;
                } else {
                    consoane++;
                }
            }
        }

        System.out.println("Vocale: " + vocale);
        System.out.println("Consoane: " + consoane);
    }
}
