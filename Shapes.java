import java.util.Scanner;
abstract class Shape {
    int a, b;

    abstract void printArea();
}


class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}


class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}


class Circle extends Shape {
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Rectangle r = new Rectangle();
        System.out.print("Enter length of rectangle: ");
        r.a = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        r.b = sc.nextInt();

        
        Triangle t = new Triangle();
        System.out.print("Enter base of triangle: ");
        t.a = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        t.b = sc.nextInt();

        
        Circle c = new Circle();
        System.out.print("Enter radius of circle: ");
        c.a = sc.nextInt();

        System.out.println();

        r.printArea();
        t.printArea();
        c.printArea();

        sc.close();
    }
}

