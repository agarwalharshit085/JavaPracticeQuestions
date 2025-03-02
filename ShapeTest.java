interface Drawable {
    void draw();
}

class Shape {
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape implements Drawable {

    public double area(double radius ) {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape implements Drawable {

    public double area(double length, double width) {
        return length * width;
    }
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Area of Circle: " + c.area(12.5));
        System.out.println("Area of Rectangle: " + r.area(10.2, 14.3));

        c.draw();
        r.draw();
    }
}
