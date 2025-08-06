package src.main.lecture_10;

import src.main.lecture_10.boxes.Box;
import src.main.lecture_10.fruits.Apple;
import src.main.lecture_10.fruits.Fruit;
import src.main.lecture_10.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        // Создаем фрукты
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        // Создаем коробки
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        // Наполняем коробки
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);

        // Выводим информацию о коробках
        System.out.println("Коробка с яблоками: " + appleBox);
        System.out.println("Коробка с апельсинами: " + orangeBox);
        System.out.println();

        // Сравниваем коробки
        System.out.println("Сравнение коробок:");
        System.out.println("Яблоки vs апельсины: " + appleBox.compare(orangeBox));
        System.out.println();

        // Пересыпаем фрукты
        System.out.println("Пересыпаем яблоки:");
        appleBox.pourTo(anotherAppleBox);
        System.out.println("Исходная: " + appleBox);
        System.out.println("Приемник: " + anotherAppleBox);
        System.out.println();

        System.out.println("Пересыпаем апельсины:");
        orangeBox.pourTo(anotherOrangeBox);
        System.out.println("Исходная: " + orangeBox);
        System.out.println("Приемник: " + anotherOrangeBox);
        System.out.println();

        // Пересыпаем в общую коробку
        System.out.println("Пересыпаем яблоки в общую коробку:");
        anotherAppleBox.pourTo(fruitBox);
        System.out.println("Общая коробка: " + fruitBox);
        System.out.println();

        System.out.println("Пересыпаем апельсины в общую коробку:");
        anotherOrangeBox.pourTo(fruitBox);
        System.out.println("Общая коробка: " + fruitBox);
        System.out.println();

        // Демонстрация работы с пустыми коробками
        System.out.println("Демонстрация пересыпания в пустую коробку:");
        Box<Apple> newAppleBox = new Box<>();
        Box<Fruit> newFruitBox = new Box<>();

        // Создаем и наполняем временную коробку яблоками
        Box<Apple> tempAppleBox = new Box<>();
        tempAppleBox.addFruit(new Apple());
        tempAppleBox.addFruit(new Apple());

        System.out.println("Пересыпаем яблоки в пустую коробку для яблок:");
        tempAppleBox.pourTo(newAppleBox);
        System.out.println("Приемник: " + newAppleBox);

        System.out.println("Пересыпаем яблоки в пустую общую коробку:");
        tempAppleBox.pourTo(newFruitBox);
        System.out.println("Приемник: " + newFruitBox);
    }
}