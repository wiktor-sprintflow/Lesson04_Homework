package task2;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double rectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.sideA + 2 * rectangle.sideB);
    }

    public void showRectanglePerimeter() {
        double perimeter = rectPerimeter(this);
        System.out.println("Obwód prostokąta o bokach " + this.sideA + " i " + this.sideB + " wynosi: " + perimeter);
    }
}