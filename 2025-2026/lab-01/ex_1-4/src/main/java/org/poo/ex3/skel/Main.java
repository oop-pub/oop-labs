package org.poo.ex3.skel;

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

        // TODO
    }
}
