package lab3;

import java.util.Scanner;

class Form {

    // TODO[0]: Add fields

    // TODO[1]: Add constructors

    // TODO[2]: Add the function getArea

    // TODO[3]: Override toString
}

class Triangle extends Form {
    // TODO[0]: Add fields

    // TODO[1]: Add constructors

    // TODO[2]: Override toString

    // TODO[3]: Override getArea
}

class Square extends Form {

    // TODO[0]: Add fields

    // TODO[1]: Add constructors

    // TODO[2]: Override toString

    // TODO[3]: Override getArea
}

class Circle extends Form {
    // TODO[0]: Add fields

    // TODO[1]: Add constructors

    // TODO[2]: Override toString

    // TODO[3]: Override getArea
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        // TODO: Uncomment the code after implementing the task.
        // Task 1:

//        Form form1 = new Form();
//        Form form2 = new Form("blue");

        // Task 2:
//        Triangle triangle1 = new Triangle("red", 4, 3);
//        Triangle triangle2 = new Triangle();
//        Square square1 = new Square("yellow", 4);
//        Square square2 = new Square();
//        Circle circle1 = new Circle("green",10);
//        Circle circle2 = new Circle();

//        Task 4: add in this order the elements in the shape vector: triangle1, triangle2,
//                  square1, square2, circle1, circle2

//        Form [] forms = new Form[6];

        switch(task) {
            case 1:
//                Task 1:
//                System.out.println(form1);
//                System.out.println(form2);
                break;
            case 2:
//                Task 2:
//                System.out.println(triangle1);
//                System.out.println("The Area is: " + triangle1.getArea());
//                System.out.println(triangle2);
//                System.out.println("The Area is: " + triangle2.getArea());
//                System.out.println(square1);
//                System.out.println("The Area is: " + square1.getArea());
//                System.out.println(square2);
//                System.out.println("The Area is: " + square2.getArea());
//                System.out.println(circle1);
//                System.out.println("The Area is: " + circle1.getArea());
//                System.out.println(circle2);
//                System.out.println("The Area is: " + circle2.getArea());
                break;
            case 3:
//                Task 3:
//                Triangle triangle3 = new Triangle("yellow", 4, 3);
//                Triangle triangle4 = new Triangle("red", 4, 3);
//                System.out.println(triangle1.equals(triangle3));
//                System.out.println(triangle1.equals(triangle4));
//                System.out.println(triangle1.equals(square1));
                break;
            case 4:
                // Task 4: for each element of the vector call the toString function
                break;

            case 5:
                // Task 5: Loop through the vector from the previous exercise and, using downcasting to the appropriate class, call
                // methods specific to each class (printTriangleDimensions for Triangle, printCircleDimensions for Circle
                // printSquareDimensions for Square)
                break;
            case 6:
                //Task 6: Show shape sizes without using instanceof
                break;
        }
    }
}