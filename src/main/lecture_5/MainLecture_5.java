package src.main.lecture_5;

public class MainLecture_5 {
    public static void main(String[] args) {

        // ������� ��������
        Dog dog1 = new Dog("�����");
        Dog dog2 = new Dog("�����");
        Cat cat1 = new Cat("������");
        Cat cat2 = new Cat("������");

        // ��������� ��� � ��������
        dog1.run(600); // ����� �� ����� ��������� 600 �.
        dog1.run(400); // ����� �������� 400 �.
        dog1.swim(15); // ����� �� ����� �������� 15 �.
        dog1.swim(5);  // ����� ������� 5 �.

        cat1.run(250); // ������ �� ����� ��������� 250 �.
        cat1.run(150); // ������ �������� 150 �.
        cat1.swim(10); // ������ �� ����� �������.

        // ������� ����� � ������ �����
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};

        // ������ �����
        for (Cat cat : cats) {
            cat.eat(bowl, 20); // ������ ��� �������� ������ 20 ���
        }

        // ��������� ������� �����
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " ���: " + cat.isFull());
        }

        // ��������� ��� � �����
        bowl.addFood(50);

        // ����� ������ �����
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
        }

        // ��������� ������� �����
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " ���: " + cat.isFull());
        }

        // ������� ���������� ��������� ��������
        System.out.println("����� ��������: " + Animal.getAnimalCount());
        System.out.println("����� �����: " + Dog.getDogCount());
        System.out.println("����� �����: " + Cat.getCatCount());
    }
}
