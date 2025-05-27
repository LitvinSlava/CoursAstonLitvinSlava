package src.main.lecture_8;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        // Создаем массив из 20 слов с повторениями
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "виноград",
                "банан", "киви", "манго", "груша", "яблоко",
                "вишня", "арбуз", "слива", "киви", "персик",
                "гранат", "лимон", "лайм", "груша", "яблоко"
        };
        // Создаем HashMap для подсчета слов
        Map<String, Integer> wordCount = new HashMap<>();

        // Заполняем карту подсчета
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        // Выводим уникальные слова
        System.out.println("Уникальные слова: " + wordCount.keySet());

        // Выводим количество повторений для каждого слова
        System.out.println("\nКоличество повторений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}