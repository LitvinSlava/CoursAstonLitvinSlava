package src.main.lecture_5;

public class Animal {
    private static int animalCount = 0; // ������� ���� ��������
    private String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " �������� " + distance + " �.");
    }

    public void swim(int distance) {
        System.out.println(name + " ������� " + distance + " �.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}