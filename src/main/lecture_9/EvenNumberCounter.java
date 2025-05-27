package src.main.lecture_9;
import java.util.Arrays;
import java.util.Random;

//������� �1. ��� ������ ������ ��������-��������������� ����� ����� ���������� ���������� ������ �����.

public class EvenNumberCounter {
    private static final Random random = new Random();

    public static void main(String[] args) {
        // ������������ ���������
        final int count = 15;        // ���������� �����
        final int min = 1;           // ����������� ��������
        final int max = 100;         // ������������ ��������

        // ��������� ����� ����� Stream API
        int[] numbers = generateNumbers(count, min, max);

        // ������� ������ ����� ����� Stream API
        long evenCount = countEvens(numbers);

        // ����� �����������
        System.out.println("��������������� �����: " + Arrays.toString(numbers));
        System.out.println("���������� ������ �����: " + evenCount);
    }

    //��������� ������� ��������� ����� � ������� Stream API
    private static int[] generateNumbers(int count, int min, int max) {
        return random.ints(count, min, max + 1).toArray();
    }

    // ������� ������ ����� ����� Stream API
    private static long countEvens(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0).count(); // ������-���������
    }
}
