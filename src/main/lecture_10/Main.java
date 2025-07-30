package src.main.lecture_10;

import lecture_10.fruits.Apple;
import lecture_10.fruits.Orange;
import lecture_10.boxes.Box;

public class Main {
    public static void main(String[] args) {
        // Create fruits
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        // Create boxes
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();

        // Fill boxes
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);

        // Display box info
        System.out.println("Apple box: " + appleBox);
        System.out.println("Orange box: " + orangeBox);
        System.out.println();

        // Compare boxes
        System.out.println("Comparing boxes:");
        System.out.println("Apple box vs orange box: " + appleBox.compare(orangeBox));
        System.out.println();

        // Pour fruits
        System.out.println("Pouring apples:");
        appleBox.pourTo(anotherAppleBox);
        System.out.println("Original: " + appleBox);
        System.out.println("Destination: " + anotherAppleBox);
        System.out.println();

        System.out.println("Pouring oranges:");
        orangeBox.pourTo(anotherOrangeBox);
        System.out.println("Original: " + orangeBox);
        System.out.println("Destination: " + anotherOrangeBox);
        System.out.println();

        // Try invalid pouring
        try {
            System.out.println("Trying to pour oranges to apples:");
            anotherOrangeBox.pourTo(anotherAppleBox);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}