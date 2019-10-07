package task3;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 5, 7);
        triangle1.showRightTriangleInfo();

        Triangle triangle2 = new Triangle(4, 3, 7);
        triangle2.showRightTriangleInfo();

        Triangle triangle3 = new Triangle(3, 4, 5);
        triangle3.showRightTriangleInfo();
    }
}