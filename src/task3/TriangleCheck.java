package task3;

public class TriangleCheck {
    public boolean isRightTriangle(Triangle triangle) {
        boolean isRightTriange = Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideB, 2) == Math.pow(triangle.sideC, 2) ||
                Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideC, 2) == Math.pow(triangle.sideB, 2) ||
                Math.pow(triangle.sideB, 2) + Math.pow(triangle.sideC, 2) == Math.pow(triangle.sideA, 2);

        return isRightTriange;
    }
}