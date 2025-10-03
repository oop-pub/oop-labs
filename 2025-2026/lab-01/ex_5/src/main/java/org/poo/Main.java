package org.poo;

import org.apache.commons.math3.util.FastMath;

public class Main {
    public static void main(String[] args) {
        int principal = 2_000_000_000;   // capital mare (aproape de Integer.MAX_VALUE)
        double rate = 0.05;              // 5% dobândă
        int years = 20;

        // BUG 1: overflow pe int (rezultat complet eronat, negativ)
        long doubledCapital = principal * 2L;
        System.out.println("Capital dublat: " + doubledCapital);
        System.out.println("Capital dublat (corect): 4000000000");

        // BUG 2: aparent salvăm în double, dar expresia e int * int -> int overflow
        // Venitul total fără dobândă
        double totalRevenueWithoutInterest = (double)principal * years;
        // se face int*int mai întâi, apoi conversie implicită la double
        System.out.println("Valoare viitoare a venitului după " + years + " ani: " + totalRevenueWithoutInterest);
        System.out.println("Valoare viitoare a venitului după " + years + " ani (corect): 4.0E10");

        // BUG 3: putere calculată corect, dar facem cast la int -> pierdem fracțiuni
        // Venitul total cu dobândă compusă
        double totalRevenueWithInterest = (principal * FastMath.pow(1 + rate, years));
        System.out.println("Valoare viitoare a venitului după " + years + " ani, cu dobândă compusă: " + totalRevenueWithInterest);
        System.out.println("Valoare viitoare a venitului după " + years + " ani, cu dobândă compusă (corect): 5.306595410288844E9");
        Float.MAX_VALUE;
    }
}
