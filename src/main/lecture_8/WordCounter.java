package src.main.lecture_8;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        // —оздаем массив из 20 слов с повторени€ми
        String[] words = {
                "€блоко", "банан", "апельсин", "€блоко", "виноград",
                "банан", "киви", "манго", "груша", "€блоко",
                "вишн€", "арбуз", "слива", "киви", "персик",
                "гранат", "лимон", "лайм", "груша", "€блоко"
        };
        // —оздаем HashMap дл€ подсчета слов
        Map<String, Integer> wordCount = new HashMap<>();

        // «аполн€ем карту подсчета
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
}