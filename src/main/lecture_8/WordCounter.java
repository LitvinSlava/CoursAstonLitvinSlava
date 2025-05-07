package src.main.lecture_8;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        // ������� ������ �� 20 ���� � ������������
        String[] words = {
                "������", "�����", "��������", "������", "��������",
                "�����", "����", "�����", "�����", "������",
                "�����", "�����", "�����", "����", "������",
                "������", "�����", "����", "�����", "������"
        };
        // ������� HashMap ��� �������� ����
        Map<String, Integer> wordCount = new HashMap<>();

        // ��������� ����� ��������
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
}