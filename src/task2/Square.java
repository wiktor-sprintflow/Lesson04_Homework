package task2;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double squareArea(Square square) {
        return Math.pow(square.side, 2);
    }

    public void showSquareArea() {
        double area = squareArea(this);
        System.out.println("Pole kwadratu wynosi o boku " + this.side + " wynosi: " + area);
    }
}