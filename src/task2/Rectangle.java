package task2;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double rectPerimeter() {
        return (2 * sideA + 2 * sideB);
    }

    public void showRectanglePerimeter() {
        double perimeter = rectPerimeter();
        System.out.println("Obwód prostokąta o bokach " + sideA + " i " + sideB + " wynosi: " + perimeter);
    }
}