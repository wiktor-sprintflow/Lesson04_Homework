package task2;

public class FiguresTest {
    public static void main(String[] args) {

        Square square1 = new Square(3.5);
        square1.showSquareArea();

        Rectangle rectangle1 = new Rectangle(2.5, 4.5);
        rectangle1.showRectanglePerimeter();

        Circle circle1 = new Circle(3);
        circle1.showCircleArea();

        Triangle triangle1 = new Triangle(4,5,7);
        triangle1.showTrianglePerimeter();

        Triangle triangle2 = new Triangle(4,3,7);
        triangle2.showTrianglePerimeter();
    }
}