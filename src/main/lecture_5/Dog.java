package src.main.lecture_5;

public class Dog extends Animal {
    private static int dogCount = 0; // ������� �����

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(getName() + " �� ����� ��������� " + distance + " �. (�������� 500 �.)");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(getName() + " �� ����� �������� " + distance + " �. (�������� 10 �.)");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}