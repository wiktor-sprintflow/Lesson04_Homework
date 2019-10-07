package task2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void showCircleArea() {
        double area = circleArea();
        System.out.println("Pole okręgu o promieniu " + radius + " wynosi: " + area);
    }
}