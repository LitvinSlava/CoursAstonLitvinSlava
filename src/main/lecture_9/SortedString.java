package src.main.lecture_9;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/* ������ ��������� ���������� �������� "f10", "f15", "f2", "f4", "f4".
���������� ������������� ������ � ���������� ������� � �������� ��
� ������. */

public class SortedString {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        String[] sortedArray = collection.stream()
                .sorted(Comparator.comparing(SortedString::extractPrefix)
                        .thenComparingInt(SortedString::extractNumber))
                .toArray(String[]::new);

        System.out.println("����������� ����������: " + Arrays.toString(sortedArray));
    }

    private static String extractPrefix(String s) {
        // ��������� ��������� ����� �� ������� �����
        return s.replaceAll("\\d+", "");
    }

    private static int extractNumber(String s) {
        // ��������� �������� ����� � ������������ � Integer
        return Integer.parseInt(s.replaceAll("\\D+", ""));
    }
}
