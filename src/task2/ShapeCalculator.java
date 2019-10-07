package task2;

public class ShapeCalculator {
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }

    public double rectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.sideA + 2 * rectangle.sideB);
    }

    public double squareArea(Square square) {
        return Math.pow(square.side, 2);
    }

    public double trianglePerimeter(Triangle triangle) {
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }
}
