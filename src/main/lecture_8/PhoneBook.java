package src.main.lecture_8;
import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> directory = new HashMap<>();

    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        // Проверяем существование фамилии в справочнике
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String surname) {
        // Возвращаем копию списка или пустой список, если фамилии нет
        return new ArrayList<>(directory.getOrDefault(surname, List.of()));
    }

    public static void main(String[] args) {
        PhoneBook dir = new PhoneBook();

        // Добавляем записи
        dir.add("Литвин", "111-11-11");
        dir.add("Петров", "222-22-22");
        dir.add("Литвин", "333-33-33");
        dir.add("Сидоров", "444-44-44");
        dir.add("Литвин", "555-55-55");

        // Получаем номера
        System.out.println("Литвин: " + dir.get("Литвин"));
        System.out.println("Петров: " + dir.get("Петров"));
        System.out.println("Смирнов: " + dir.get("Смирнов"));
    }
}
