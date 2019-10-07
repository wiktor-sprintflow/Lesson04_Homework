package task2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void showCircleArea() {
        double area = circleArea(radius);
        System.out.println("Pole okręgu o promieniu " + radius + " wynosi: " + area);
    }
}