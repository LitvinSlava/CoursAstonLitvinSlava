package src.main.lecture_5;

public class Cat extends Animal {
    private static int catCount = 0; // ������� �����
    private boolean isFull; // ������� ����

    public Cat(String name) {
        super(name);
        this.isFull = false; // ��� ������� ��� ��������
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(getName() + " �� ����� ��������� " + distance + " �. (�������� 200 �.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " �� ����� �������.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(getName() + " ���� � ������ ���.");
        } else {
            System.out.println(getName() + " �� ���� ������. � ����� ������������ ���.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
