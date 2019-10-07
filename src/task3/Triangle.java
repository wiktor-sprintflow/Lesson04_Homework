package task3;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean areTriangleSidesCorrect(Triangle triangle) {
        boolean areCorrect = (triangle.sideA + triangle.sideB > triangle.sideC &&
                triangle.sideA + triangle.sideC > triangle.sideB &&
                triangle.sideB + triangle.sideC > triangle.sideA);
        return areCorrect;
    }

    public void showRightTriangleInfo() {
        if (areTriangleSidesCorrect(this)) {
            TriangleCheck triangleCheck = new TriangleCheck();
            boolean rightTriangle = triangleCheck.isRightTriangle(this);
            System.out.println("Trójkąt o bokach " + this.sideA + ", " + this.sideB + " i " + this.sideC + " jest trójkątem prostokątnym (" + rightTriangle + ")");
        } else {
            System.out.println("Nie można utworzyć trójkąta o bokach: " + this.sideA + ", " + this.sideB + " i " + this.sideC);
        }
    }
}