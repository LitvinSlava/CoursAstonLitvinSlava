package src.main.lecture_9;
import java.util.Arrays;
import java.util.List;

/* ������� �2. ������ ���������, ��������� �� �����: �Highload�, �High�, �Load�,
�Highload�. ����� � ��� ��������� ��������� �����������:
2.1. ���������, ������� ��� ������ �High� ����������� � ���������;
2.2. ����������, ����� ������� � ��������� ��������� �� ������ �����.
���� �� �������� ������ ���������, �� ����� ������������ 0;
2.3. ���������� ������� ��������� �������, ���� �������� ������
���������, �� ����� ������������ 0;*/

public class CollectionCount {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

        // 2.1. ������� ���������� "High"
        long count = collection.stream()
                .filter("High"::equals)
                .count();
        System.out.println("���������� 'High': " + count);

        // 2.2. ��������� ������� ��������
        String first = collection.stream()
                .findFirst()
                .orElse("0");
        System.out.println("������ �������: " + first);

        // 2.3. ��������� ���������� ��������
        String last = collection.stream()
                .reduce((a, b) -> b)
                .orElse("0");
        System.out.println("��������� �������: " + last);
    }
}