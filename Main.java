public class Main {
    public static void main(String[] args) {
        
        Bowl bowl = new Bowl(30); // Создаем миску с 30 единицами еды
        // --------Задание 1------------------------------------------------------
        Cat[] cats = {
                new Cat("Персик"),
                new Cat("Митя"),
                new Cat("Вася")
        };

        for (Cat cat : cats) {
            cat.eat(20, bowl); // Каждый кот пытается покушать 20 единиц еды
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытость: " + (cat.isFull() ? "Сыт" : "Голоден"));
        } // Печатаем информацию о сытости котов

        bowl.addFood(30); // Добавляем 30 единиц еды в миску

        for (Cat cat : cats) {
            cat.eat(20, bowl); // Каждый кот снова пытается покушать 20 единиц еды
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытость: " + (cat.isFull() ? "Сыт" : "Голоден"));
        } // Печатаем информацию о сытости котов после второго раза

        // Выводим оставшееся количество еды в миске
        System.out.println("Оставшееся количество еды в миске: " + bowl.getFoodAmount() + " единиц.");
        

        // --------Задание 2------------------------------------------------------
        Shape circle = new Circle(5, "Красный", "Черный");
        ((Circle) circle).printDetails();

        System.out.println();

        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        ((Rectangle) rectangle).printDetails();

        System.out.println();

        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");
        ((Triangle) triangle).printDetails();
    }
}
