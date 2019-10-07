package task2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public void showCircleArea() {
        double area = shapeCalculator.circleArea(this);
        System.out.println("Pole okręgu o promieniu " + this.radius + " wynosi: " + area);
    }
}