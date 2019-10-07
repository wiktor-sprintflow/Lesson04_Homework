package task2;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double squareArea(double side) {
        return Math.pow(side, 2);
    }

    public void showSquareArea() {
        double area = squareArea(side);
        System.out.println("Pole kwadratu wynosi o boku " + side + " wynosi: " + area);
    }
}