package src.main.lecture_10;

import src.main.lecture_10.boxes.Box;
import src.main.lecture_10.fruits.Apple;
import src.main.lecture_10.fruits.Fruit;
import src.main.lecture_10.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        // ������� ������
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        // ������� �������
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        Box<Fruit> fruitBox1 = new Box<>(); // ��� �����
        Box<Fruit> fruitBox2 = new Box<>(); // ��� ����������

        // ��������� �������
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);

        // ������� ���������� � ��������
        System.out.println("������� � ��������: " + appleBox);
        System.out.println("������� � �����������: " + orangeBox);
        System.out.println();

        // ���������� �������
        System.out.println("��������� �������:");
        System.out.println("������ vs ���������: " + appleBox.compare(orangeBox));
        System.out.println();

        // ���������� ������
        System.out.println("���������� ������:");
        appleBox.pourTo(anotherAppleBox);
        System.out.println("��������: " + appleBox);
        System.out.println("��������: " + anotherAppleBox);
        System.out.println();

        System.out.println("���������� ���������:");
        orangeBox.pourTo(anotherOrangeBox);
        System.out.println("��������: " + orangeBox);
        System.out.println("��������: " + anotherOrangeBox);
        System.out.println();

        // ���������� � ������ ����� �������
        System.out.println("���������� ������ � ����� ������� 1:");
        anotherAppleBox.pourTo(fruitBox1);
        System.out.println("����� ������� 1: " + fruitBox1);
        System.out.println();

        System.out.println("���������� ��������� � ����� ������� 2:");
        anotherOrangeBox.pourTo(fruitBox2);
        System.out.println("����� ������� 2: " + fruitBox2);
        System.out.println();

        // ������������ ������ � ������� ���������
        System.out.println("������������ ����������� � ������ �������:");
        Box<Apple> newAppleBox = new Box<>();

        // ������� � ��������� ��������� ������� ��������
        Box<Apple> tempAppleBox = new Box<>();
        tempAppleBox.addFruit(new Apple());
        tempAppleBox.addFruit(new Apple());

        System.out.println("���������� ������ � ������ ������� ��� �����:");
        tempAppleBox.pourTo(newAppleBox);
        System.out.println("��������: " + newAppleBox);

        // ������������ ������ ��� ����������� ������ �����
        try {
            System.out.println("\n������� ���������� ��������� � ������� � ��������:");
            Box<Orange> tempOrangeBox = new Box<>();
            tempOrangeBox.addFruit(new Orange());

            // ������� ���������� ��������� � ������� � ��������
            tempOrangeBox.pourTo(newAppleBox);
        } catch (IllegalArgumentException e) {
            System.out.println("������: " + e.getMessage());
        }
    }
}