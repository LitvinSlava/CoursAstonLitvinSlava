package src.main.lecture_5;

public class Animal {
    private static int animalCount = 0; // —четчик всех животных
    private String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}