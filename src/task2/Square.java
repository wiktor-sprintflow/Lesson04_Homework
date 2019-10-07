package task2;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    public void showSquareArea() {
        double area = shapeCalculator.squareArea(this);
        System.out.println("Pole kwadratu wynosi o boku " + this.side + " wynosi: " + area);
    }
}