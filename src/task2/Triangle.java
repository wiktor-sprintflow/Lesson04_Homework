package task2;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double trianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    private boolean areTriangleSidesCorrect() {
        boolean areCorrect = (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA);
        return areCorrect;
    }

    public void showTrianglePerimeter() {
        if (areTriangleSidesCorrect()) {
            double perimeter = trianglePerimeter(sideA, sideB, sideC);
            System.out.println("Obwód trójkąta o bokach " + sideA + ", " + sideB + " i " + sideC + " wynosi: " + perimeter);
        } else {
            System.out.println("Nie można utworzyć trójkąta o bokach: " + sideA + ", " + sideB + " i " + sideC);
        }
    }
}