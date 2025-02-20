package src.main.lesson1;

/**
 * First JAVA program.
 */
public class FirstApp {
    public static void main(String[]arg){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    /** Задание №1 Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.**/
    public static void printThreeWords() {
        System.out.println("-----------------Задание №1-----------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    /** Задание №2 Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
     значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше
     или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма
     отрицательная”**/

    public static void checkSumSign() {
        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println("-----------------Задание №2-----------------");
        if (c >= 0) {
            System.out.println("Положительная сумма");
        } else {
            System.out.println("Отрицательная сумма");
        }
    }
    /** Задание №3 Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в
     пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”**/

    public static void printColor() {
        int value = 101;
        System.out.println("-----------------Задание №3-----------------");
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    /** Задание №4 Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
     любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае
     “a < b”**/

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        System.out.println("-----------------Задание №4-----------------");
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

        System.out.println("-------------------Другое-------------------");
        int a2 = 4;
        System.out.println(++a2);
        System.out.println(a2++);
        System.out.println(a2);
    }
}