import java.util.Arrays;
import java.util.Collection;


/*
Cerință:
    a) Definiţi o clasă care să implementeze operaţii pe numere double. Operaţiile vor arunca excepţii. Clasa va trebui
    să implementeze interfața CalculatorBase, ce conţine trei metode:
        - add: primeşte două numere şi întoarce un double
        - divide: primeşte două numere şi întoarce un double
        - average: primeşte o colecţie ce conţine obiecte double, şi întoarce media acestora ca un numar de tip double.
        !! Pentru calculul mediei, sunt folosite metodele add şi divide. !!
    b) Metodele pot arunca următoarele excepții (definite în interfața CalculatorBase):
        - NullParameterException: este aruncată dacă vreunul din parametrii primiți este null;
        - OverflowException: este aruncată dacă suma a două numere e egală cu Double.POSITIVE_INFINITY;
        - UnderflowException: este aruncată dacă suma a două numere e egală cu Double.NEGATIVE_INFINITY.
    c) Completați metoda main din clasa Main, evidențiind prin teste toate cazurile posibile care generează excepţii.

    Exemplu:
    5.0
    2.25
    2.5
    Null Parameter Exception thrown!
    Null Parameter Exception thrown!
    Null Parameter Exception thrown!
    Overflow Exception thrown!
    Underflow Exception thrown!
    Null Parameter Exception thrown!
    Null Parameter Exception thrown!
    Null Parameter Exception thrown!
    Null Parameter Exception thrown!
    Overflow Exception thrown!
    Underflow Exception thrown!
    Overflow Exception thrown!
    Underflow Exception thrown!
 */
interface CalculatorBase {
    class NullParameterException extends RuntimeException {
    }

    class UnderflowException extends RuntimeException {
    }

    class OverflowException extends RuntimeException {
    }

    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);
}

public class Main {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        CalculatorBase calculator = null;

        // TODO: Uncomment after implementing the task
        /*
        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(Arrays.asList(1d, 2d, 3d, 4d)));


        try {
            calculator.add(null, Double.MAX_VALUE);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(Double.MAX_VALUE, null);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(null, null);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (CalculatorBase.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (CalculatorBase.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }

        try {
            calculator.divide(null, Double.MAX_VALUE);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(Double.MAX_VALUE, null);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(null, null);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(null, null);
        } catch (CalculatorBase.NullParameterException e) {
            System.out.println("Null Parameter Exception thrown!");
        }

        try {
            calculator.divide(1d, 0d);
        } catch (CalculatorBase.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.divide(-1d, 0d);
        } catch (CalculatorBase.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }

        try {
            calculator.average(Arrays.asList(1d, 2d, Double.MAX_VALUE, Double.MAX_VALUE));
        } catch (CalculatorBase.OverflowException e) {
            System.out.println("Overflow Exception thrown!");
        }

        try {
            calculator.average(Arrays.asList(1d, -100d, -Double.MAX_VALUE, -Double.MAX_VALUE));
        } catch (CalculatorBase.UnderflowException e) {
            System.out.println("Underflow Exception thrown!");
        }
        */
    }
}