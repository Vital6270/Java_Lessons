interface Shape {
    double area(); // Метод для расчета площади
    double perimeter(); // Метод для расчета периметра

    // Дефолтный метод для вывода характеристик фигуры
    default void printCharacteristics(String fillColor, String borderColor) {
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границ: " + borderColor);
    }
}
