package task2;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public void showRectanglePerimeter() {
        double perimeter = shapeCalculator.rectPerimeter(this);
        System.out.println("Obwód prostokąta o bokach " + this.sideA + " i " + this.sideB + " wynosi: " + perimeter);
    }
}