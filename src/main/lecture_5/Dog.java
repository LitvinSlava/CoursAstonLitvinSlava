package src.main.lecture_5;

public class Dog extends Animal {
    private static int dogCount = 0; // —четчик собак

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м. (максимум 500 м.)");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " м. (максимум 10 м.)");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}