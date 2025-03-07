package src.main.lecture_5;

public class Cat extends Animal {
    private static int catCount = 0; // Счетчик котов
    private boolean isFull; // Сытость кота

    public Cat(String name) {
        super(name);
        this.isFull = false; // Кот голоден при создании
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м. (максимум 200 м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(getName() + " поел и теперь сыт.");
        } else {
            System.out.println(getName() + " не смог поесть. В миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
