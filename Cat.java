// класс Кот
public class Cat extends Animal {
    private static int catCount = 0; // Счетчик котов
    private String name;
    private boolean isFull; // Сытость кота

    public Cat(String name) {
        super();
        this.name = name;
        this.isFull = false; // Кот изначально голоден
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int foodAmount, Bowl bowl) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            isFull = true; // Кот сыт
            System.out.println(name + " покушал " + foodAmount + " единиц еды.");
        } else {
            System.out.println(name + " не хватает еды в миске, чтобы покушать " + foodAmount + " единиц.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }

    public static int getCatCount() {
        return catCount;
    }
}
