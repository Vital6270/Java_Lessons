class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = perimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public void printDetails() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
        printCharacteristics(fillColor, borderColor);
    }
}
