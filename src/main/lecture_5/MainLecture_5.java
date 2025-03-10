package src.main.lecture_5;

public class MainLecture_5 {
    public static void main(String[] args) {

        // ������� ��������
        Dog dog1 = new Dog("�����");
        Dog dog2 = new Dog("�����");
        Cat cat1 = new Cat("������");
        Cat cat2 = new Cat("������");

        // ��������� ��� � ��������
        dog1.run(501);
        dog1.run(499);
        dog1.swim(11);
        dog1.swim(9);

        cat1.run(201);
        cat1.run(199);
        cat1.swim(1);

        // ������� ����� � ������ �����
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2};

        // ������ �����
        for (Cat cat : cats) {
            cat.eat(bowl, 20);
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
