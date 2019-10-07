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

    private boolean areTriangleSidesCorrect() {
        boolean areCorrect = (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA);
        return areCorrect;
    }

    public void showRightTriangleInfo() {
        if (areTriangleSidesCorrect()) {
            TriangleCheck triangleCheck = new TriangleCheck();
            boolean rightTriangle = triangleCheck.isRightTriangle(this);
            System.out.println("Trójkąt o bokach " + sideA + ", " + sideB + " i " + sideC + " jest trójkątem prostokątnym (" + rightTriangle + ")");
        } else {
            System.out.println("Nie można utworzyć trójkąta o bokach: " + sideA + ", " + sideB + " i " + sideC);
        }
    }
}