package src.main.lecture_9;
import java.util.Arrays;
import java.util.List;

/* Задание №2. Задана коллекция, состоящая из строк: «Highload», «High», «Load»,
«Highload». Нужно с ней выполнить следующие манипуляции:
2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
2.2. Определить, какой элемент в коллекции находится на первом месте.
Если мы получили пустую коллекцию, то пусть возвращается 0;
2.3. Необходимо вернуть последний элемент, если получили пустую
коллекцию, то пусть возвращается 0;*/

public class CollectionCount {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

        // 2.1. Подсчет количества "High"
        long count = collection.stream()
                .filter("High"::equals)
                .count();
        System.out.println("Количество 'High': " + count);

        // 2.2. Получение первого элемента
        String first = collection.stream()
                .findFirst()
                .orElse("0");
        System.out.println("Первый элемент: " + first);

        // 2.3. Получение последнего элемента
        String last = collection.stream()
                .reduce((a, b) -> b)
                .orElse("0");
        System.out.println("Последний элемент: " + last);
    }
}