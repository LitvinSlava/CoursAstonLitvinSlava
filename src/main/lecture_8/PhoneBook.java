package src.main.lecture_8;
import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> directory = new HashMap<>();

    // ����� ��� ���������� ������
    public void add(String surname, String phoneNumber) {
        // ��������� ������������� ������� � �����������
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // ����� ��� ������ ������� �� �������
    public List<String> get(String surname) {
        // ���������� ����� ������ ��� ������ ������, ���� ������� ���
        return new ArrayList<>(directory.getOrDefault(surname, List.of()));
    }

    public static void main(String[] args) {
        PhoneBook dir = new PhoneBook();

        // ��������� ������
        dir.add("������", "111-11-11");
        dir.add("������", "222-22-22");
        dir.add("������", "333-33-33");
        dir.add("�������", "444-44-44");
        dir.add("������", "555-55-55");

        // �������� ������
        System.out.println("������: " + dir.get("������"));
        System.out.println("������: " + dir.get("������"));
        System.out.println("�������: " + dir.get("�������"));
    }
}
