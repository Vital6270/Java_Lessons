// Задание 3. Создать класс Park с внутренним классом, с помощью объектов которого можно
// хранить информацию об аттракционах, времени их работы и стоимости.

public class Park {
    private String name;
    private double size;
    private int age;

    public Park(String name, double size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public static class Attraction {
        private String attractionName;
        private String openTime;
        private double cost;

        public Attraction(String attractionName, String openTime, double cost) {
            this.attractionName = attractionName;
            this.openTime = openTime;
            this.cost = cost;
        }
    }
}
