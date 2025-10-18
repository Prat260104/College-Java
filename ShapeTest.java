sealed abstract class Shape permits Circle, Rectangle, Triangle {
    abstract void area();
}

final class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    void area() {
        System.out.println("Circle area: " + (Math.PI * radius * radius));
    }
}

final class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) { this.length = l; this.breadth = b; }

    void area() {
        System.out.println("Rectangle area: " + (length * breadth));
    }
}

final class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { this.base = b; this.height = h; }

    void area() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 8);

        c.area();
        r.area();
        t.area();
    }
}
