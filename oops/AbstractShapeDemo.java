abstract class Shape {
    int a;
    int b;
Shape(int a, int b) {
this.a = a;
this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {

Rectangle(int length, int breadth) {
super(length, breadth);
    }

    void printArea() {
System.out.println("Area of Rectangle: " + (a * b));
    }
}

class Triangle extends Shape {

Triangle(int base, int height) {
super(base, height);
    }

    void printArea() {
System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
Circle(int radius) {
super(radius, 0);  
    }

    void printArea() {
System.out.println("Area of Circle: " + (3.14 * a * a));
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(6, 4);
        Shape circle = new Circle(7);

rectangle.printArea();
triangle.printArea();
circle.printArea();
    }
}
