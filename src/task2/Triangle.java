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

    public double trianglePerimeter(Triangle triangle) {
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }

    private boolean areTriangleSidesCorrect(Triangle triangle) {
        boolean areCorrect = (triangle.sideA + triangle.sideB > triangle.sideC &&
                triangle.sideA + triangle.sideC > triangle.sideB &&
                triangle.sideB + triangle.sideC > triangle.sideA);
        return areCorrect;
    }

    public void showTrianglePerimeter() {
        if (areTriangleSidesCorrect(this)) {
            double perimeter = trianglePerimeter(this);
            System.out.println("Obwód trójkąta o bokach " + this.sideA + ", " + this.sideB + " i " + this.sideC + " wynosi: " + perimeter);
        } else {
            System.out.println("Nie można utworzyć trójkąta o bokach: " + this.sideA + ", " + this.sideB + " i " + this.sideC);
        }
    }
}