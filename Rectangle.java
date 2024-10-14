class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    public void printDetails() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
        printCharacteristics(fillColor, borderColor);
    }
}
