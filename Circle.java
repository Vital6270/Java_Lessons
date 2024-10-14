public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void printDetails() {
        System.out.println("Фигура: Круг");
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
        printCharacteristics(fillColor, borderColor);
    }
}
