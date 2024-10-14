// Суперкласс Животное
public class Animal {
    private static int animalCount = 0; // Счетчик животных

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
