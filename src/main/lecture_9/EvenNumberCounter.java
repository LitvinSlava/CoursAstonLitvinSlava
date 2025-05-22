package src.main.lecture_9;
import java.util.Arrays;
import java.util.Random;

//Задание №1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.

public class EvenNumberCounter {
    private static final Random random = new Random();

    public static void main(String[] args) {
        // Конфигурация генерации
        final int count = 15;        // Количество чисел
        final int min = 1;           // Минимальное значение
        final int max = 100;         // Максимальное значение

        // Генерация чисел через Stream API
        int[] numbers = generateNumbers(count, min, max);

        // Подсчет четных чисел через Stream API
        long evenCount = countEvens(numbers);

        // Вывод результатов
        System.out.println("Сгенерированные числа: " + Arrays.toString(numbers));
        System.out.println("Количество четных чисел: " + evenCount);
    }

    //Генерация массива случайных чисел с помощью Stream API
    private static int[] generateNumbers(int count, int min, int max) {
        return random.ints(count, min, max + 1).toArray();
    }

    // Подсчет четных чисел через Stream API
    private static long countEvens(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0).count(); // Лямбда-выражение
    }
}
