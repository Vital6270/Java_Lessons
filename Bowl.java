// Класс Миска
public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount - amount < 0) {
            System.out.println("Недостаточно еды в миске для уменьшения на " + amount);
        } else {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды.");
    }
}
