package task2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }

    public void showCircleArea() {
        double area = circleArea(this);
        System.out.println("Pole okręgu o promieniu " + this.radius + " wynosi: " + area);
    }
}